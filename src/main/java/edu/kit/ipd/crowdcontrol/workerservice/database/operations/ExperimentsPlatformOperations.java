package edu.kit.ipd.crowdcontrol.workerservice.database.operations;

import edu.kit.ipd.crowdcontrol.workerservice.database.model.Tables;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.enums.ExperimentsPlatformModeMode;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.*;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static edu.kit.ipd.crowdcontrol.workerservice.database.model.Tables.*;

/**
 * ExperimentsPlatformOperations contains all queries concerned with the platforms of the experiment and the associated
 * information.
 * @author LeanderK
 * @version 1.0
 */
public class ExperimentsPlatformOperations extends AbstractOperation {
    private static final Logger logger = LoggerFactory.getLogger(ExperimentsPlatformOperations.class);
    /**
     * creates a new ExperimentsPlatformOperations
     * @param create the context used to communicate with the database
     */
    public ExperimentsPlatformOperations(DSLContext create) {
        super(create);
    }

    /**
     * returns the mode for the platform of the experiment
     * @param experiment the primary key of the experiment
     * @param platform the platform to search for
     * @return the mode of the platform
     * @throws IllegalArgumentException if the experimentsPlatform is not existing
     */
    public ExperimentsPlatformModeMode getExperimentsPlatformMode(int experiment, String platform) throws IllegalArgumentException {
        return create.select(EXPERIMENTS_PLATFORM_MODE.MODE)
                .from(EXPERIMENTS_PLATFORM_MODE)
                .where(EXPERIMENTS_PLATFORM_MODE.EXPERIMENTS_PLATFORM.in(
                        DSL.select(EXPERIMENTS_PLATFORM.IDEXPERIMENTS_PLATFORMS)
                            .from(EXPERIMENTS_PLATFORM)
                            .where(EXPERIMENTS_PLATFORM.EXPERIMENT.eq(experiment))
                            .and(EXPERIMENTS_PLATFORM.PLATFORM.eq(platform))
                ))
                .orderBy(EXPERIMENTS_PLATFORM_MODE.TIMESTAMP.desc())
                .limit(1)
                .fetchOptional()
                .map(Record1::value1)
                .orElse(ExperimentsPlatformModeMode.normal);
    }

    public AnswerReservationRecord prepareAnswer(int worker, int experiment, int amount) {
        create.transactionResult(config -> {
            Result<AnswerReservationRecord> openReservations = DSL.using(config).selectFrom(ANSWER_RESERVATION)
                    .where(ANSWER_RESERVATION.EXPERIMENT.eq(experiment))
                    .and(ANSWER_RESERVATION.WORKER.eq(worker))
                    .and(ANSWER_RESERVATION.USED.eq(false))
                    .fetch();
            logger.trace("");

        });
    }

    /**
     * Reserves a number of ratings for the given worker.
     * <p>
     * Returns the reserved ratings if the worker has them.
     *
     * @param worker the worker to reserve the ratings for
     * @param experiment the experiment to reserve the ratings for
     * @param amount the amount of ratings to reserve
     * @return a map where the values are the answers to rate and the keys the ids of the ratings
     */
    public Map<Integer, AnswerRecord> prepareRating(int worker, int experiment, int amount) {
        Map<Integer, AnswerRecord> answers = create.transactionResult(config -> {
            Map<Integer, AnswerRecord> reservedRatings = DSL.using(config).select(ANSWER.fields())
                    .select(RATING_RESERVATION.IDRESERVERD_RATING)
                    .from(ANSWER)
                    .innerJoin(RATING_RESERVATION).on(RATING_RESERVATION.WORKER.eq(worker)
                            .and(RATING_RESERVATION.EXPERIMENT.eq(experiment))
                    )
                    .fetchMap(RATING_RESERVATION.IDRESERVERD_RATING, record -> record.into(Tables.ANSWER));
            logger.trace("Worker {} has reserved ratings {}.", worker, reservedRatings);

            Timestamp now = Timestamp.valueOf(LocalDateTime.now());

            DSL.using(config).update(RATING_RESERVATION)
                    .set(RATING_RESERVATION.TIMESTAMP, now)
                    .where(RATING_RESERVATION.IDRESERVERD_RATING.in(reservedRatings.keySet()))
                    .execute();

            int reserveNew = Math.max(amount - reservedRatings.size(), 0);
            logger.trace("Reserving {} new Answers for worker {}.", reserveNew, worker);

            LocalDateTime limit = LocalDateTime.now().minus(2, ChronoUnit.HOURS);
            Timestamp timestamp = Timestamp.valueOf(limit);
            Field<Integer> count = DSL.count(RATING_RESERVATION.IDRESERVERD_RATING).as("count");
            Map<Integer, AnswerRecord> toRate = DSL.using(config).select()
                    .select(ANSWER.fields())
                    .select(count)
                    .from(ANSWER)
                    .leftJoin(RATING_RESERVATION).on(RATING_RESERVATION.ANSWER.eq(ANSWER.ID_ANSWER)
                            .and(RATING_RESERVATION.USED.eq(true).or(RATING_RESERVATION.TIMESTAMP.greaterOrEqual(timestamp))))
                    .where(ANSWER.EXPERIMENT.eq(experiment))
                    .and(ANSWER.WORKER_ID.notEqual(worker))
                    .and(ANSWER.ID_ANSWER.notIn(
                            DSL.select(RATING_RESERVATION.ANSWER).from(RATING_RESERVATION).where(RATING_RESERVATION.WORKER.eq(worker).and(RATING_RESERVATION.EXPERIMENT.eq(experiment)))))
                    .and(ANSWER.QUALITY_ASSURED.eq(true).and(ANSWER.QUALITY.notEqual(0)).or(DSL.condition(true)))
                    .groupBy(ANSWER.fields())
                    .having(count.lessThan(
                            DSL.select(EXPERIMENT.RATINGS_PER_ANSWER).from(EXPERIMENT).where(EXPERIMENT.ID_EXPERIMENT.eq(experiment))))
                    .orderBy(ANSWER.QUALITY_ASSURED.desc())
                    .limit(reserveNew)
                    .fetchMap(Tables.ANSWER.ID_ANSWER, record -> record.into(Tables.ANSWER));

            List<RatingReservationRecord> reservations = toRate.values().stream()
                    .map(answer -> new RatingReservationRecord(null, worker, experiment, answer.getIdAnswer(), timestamp, false))
                    .collect(Collectors.toList());

            DSL.using(config).batchInsert(reservations).execute();

            Map<Integer, AnswerRecord> reserved = reservedRatings.entrySet().stream()
                    .collect(Collectors.toMap(entry -> entry.getValue().getIdAnswer(), Map.Entry::getValue));

            toRate.putAll(reserved);

            return toRate;
        });

        logger.trace("Worker {} can rate {}", worker, answers.values());

        List<Integer> answerIds = answers.values().stream()
                .map(AnswerRecord::getIdAnswer)
                .collect(Collectors.toList());

        Result<RatingRecord> ratings = create.selectFrom(RATING)
                .where(RATING.ANSWER_R.in(answerIds))
                .and(RATING.WORKER_ID.eq(worker))
                .fetch();

        return ratings.stream()
                .collect(Collectors.toMap(RatingRecord::getIdRating, record -> answers.get(record.getAnswerR())));
    }

    /**
     * returns the amount of answers submitted for the passed experiment
     * @param experimentID the primary key of the experiment
     * @return the number of answers submitted
     */
    public int getAnswersCount(int experimentID) {
        return create.fetchCount(
                DSL.selectFrom(ANSWER)
                        .where(ANSWER.EXPERIMENT.eq(experimentID))
                        .and(ANSWER.QUALITY_ASSURED.eq(true).and(Tables.ANSWER.QUALITY.notEqual(0))
                                .or(DSL.condition(true))
                        )
        );
    }

    /**
     * returns the amount of answers submitted for the passed experiment by the worker
     * @param experimentID the primary key of the experiment
     * @param workerID the worker to check for
     * @return the number of answers submitted
     */
    public int getAnswersCount(int experimentID, int workerID) {
        return create.fetchCount(
                DSL.selectFrom(Tables.ANSWER)
                        .where(Tables.ANSWER.EXPERIMENT.eq(experimentID))
                        .and(Tables.ANSWER.WORKER_ID.eq(workerID))
        );
    }

    /**
     * returns the amount of ratings submitted for the passed experiment by the worker
     * @param experimentID the primary key of the experiment
     * @param workerID the worker to check for
     * @return the number of ratings submitted
     */
    public int getRatingsCount(int experimentID, int workerID) {
        return create.fetchCount(
                DSL.selectFrom(Tables.RATING)
                        .where(Tables.RATING.EXPERIMENT.eq(experimentID))
                        .and(Tables.RATING.WORKER_ID.eq(workerID))
        );
    }

    /**
     * Lists all the answers and the count of their ratings were the answers were not from the passed worker and
     * do belong to the experiment.
     * @param experiment the experiment worked on
     * @param worker the primary key of the worker
     * @return the result
     */
    public List<Record> getOtherAnswersWithCount(int experiment, int worker) {
        LocalDateTime limit = LocalDateTime.now().minus(2, ChronoUnit.HOURS);
        Timestamp timestamp = Timestamp.valueOf(limit);
        return create.select(Tables.ANSWER.fields())
                .select(DSL.count(RATING.ID_RATING).as("count"))
                .from(ANSWER)
                .leftJoin(RATING).on(RATING.ANSWER_R.eq(ANSWER.ID_ANSWER)
                        .and(RATING.RATING_.isNotNull().or(RATING.TIMESTAMP.greaterOrEqual(timestamp))))
                .where(ANSWER.WORKER_ID.notEqual(worker))
                .and(ANSWER.EXPERIMENT.eq(experiment))
                .fetch();
    }
}