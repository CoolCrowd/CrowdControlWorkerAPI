package edu.kit.ipd.crowdcontrol.workerservice.query;

import edu.kit.ipd.crowdcontrol.workerservice.BadRequestException;
import edu.kit.ipd.crowdcontrol.workerservice.InternalServerErrorException;
import edu.kit.ipd.crowdcontrol.workerservice.RequestHelper;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.enums.ExperimentsPlatformModeStopgap;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.CalibrationAnswerOptionRecord;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.CalibrationRecord;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.ExperimentRecord;
import edu.kit.ipd.crowdcontrol.workerservice.database.operations.*;
import edu.kit.ipd.crowdcontrol.workerservice.objectservice.Communication;
import edu.kit.ipd.crowdcontrol.workerservice.proto.View;
import org.jooq.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.Request;
import spark.Response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * The class query is responsible for the query-part of the CQRS-pattern. Therefore it provides the getNext-method used
 * for the /next query and getPreview used for the /preview-query.
 *
 * @author LeanderK
 * @version 1.0
 */
public class Queries implements RequestHelper {
    private static final Logger logger = LoggerFactory.getLogger(Queries.class);
    private final HashMap<String, TaskChooserAlgorithm> strategies = new HashMap<>();
    private final CalibrationsOperations calibrationsOperations;
    private final ExperimentOperations experimentOperations;
    private final PlatformOperations platformOperations;
    private final ExperimentsPlatformOperations experimentsPlatformOperations;
    private final WorkerOperations workerOperations;
    private final Communication communication;
    private final PreviewTaskChooser previewTaskChooser;

    public Queries(CalibrationsOperations calibrationsOperations, ExperimentOperations experimentOperations,
                   PlatformOperations platformOperations, Communication communication, ExperimentsPlatformOperations experimentsPlatformOperations,
                   WorkerOperations workerOperations) {
        this(calibrationsOperations, experimentOperations, platformOperations, communication, experimentsPlatformOperations, workerOperations, false);
    }

    public Queries(CalibrationsOperations calibrationsOperations, ExperimentOperations experimentOperations,
                   PlatformOperations platformOperations, Communication communication, ExperimentsPlatformOperations experimentsPlatformOperations,
                   WorkerOperations workerOperations, boolean disableRegistering) {
        this.calibrationsOperations = calibrationsOperations;
        this.experimentOperations = experimentOperations;
        this.platformOperations = platformOperations;
        this.communication = communication;
        this.experimentsPlatformOperations = experimentsPlatformOperations;
        this.workerOperations = workerOperations;
        previewTaskChooser = new PreviewTaskChooser(experimentOperations, experimentsPlatformOperations);
        if (!disableRegistering) {
            registerTaskChooser(new AntiSpoof(experimentOperations, experimentsPlatformOperations));
        }
    }

    Queries(CalibrationsOperations calibrationsOperations, ExperimentOperations experimentOperations,
            PlatformOperations platformOperations, Communication communication, ExperimentsPlatformOperations experimentsPlatformOperations,
            TaskChooserAlgorithm mockUp, WorkerOperations workerOperations) {
        this(calibrationsOperations, experimentOperations, platformOperations, communication, experimentsPlatformOperations, workerOperations, false);
        if (mockUp != null)
            registerTaskChooser(mockUp);
    }

    /**
     * used to register a new TaskStrategy.
     *
     * @param taskChooserAlgorithm the TaskChooserAlgorithm to register
     */
    private void registerTaskChooser(TaskChooserAlgorithm taskChooserAlgorithm) {
        strategies.put(taskChooserAlgorithm.getName(), taskChooserAlgorithm);
        experimentOperations.insertTaskChooserOrIgnore(taskChooserAlgorithm.getName(), taskChooserAlgorithm.getDescription());
        taskChooserAlgorithm.getParameters()
                .forEach(parameter -> experimentOperations.insertTaskChooserParamOrIgnore(
                        taskChooserAlgorithm.getName(),
                        parameter.getDescription(),
                        parameter.getRegex(),
                        parameter.getData())
                );
    }

    /**
     * this method returns an overview over the assignment, an instance of view, where containing only information
     * about the experiment.
     * @param request the SparkJava-Request
     * @param response the SparkJava-Response
     * @return the JSON-Representation of View
     */
    public String preview(Request request, Response response) {
        int experimentId = assertParameterInt(request, "experiment");
        logger.debug("generating preview for experiment: {}", experimentId);
        return previewTaskChooser.next(View.newBuilder(), request, experimentId, "", false, false)
                .map(view -> transform(request, response, view))
                .orElseThrow(() -> new InternalServerErrorException("Unable to create Preview!"));
    }

    /**
     * this method returns an instance of View, determining what the worker should see next.
     * <p>
     * it is indented to be called when the Router gets an /next-Request.
     *
     * @param request  the SparkJava-Request
     * @param response the SparkJava-Response
     * @return the JSON-Representation of View
     */
    public String getNext(Request request, Response response) {
        boolean skipCreative = false;
        if ("skip".equals(request.queryParams("answer"))) {
            skipCreative = true;
        }
        logger.trace("skipCreative is: {}", skipCreative);
        boolean skipRating = false;
        if ("skip".equals(request.queryParams("rating"))) {
            skipRating = true;
        }
        logger.trace("skipRating is: {}", skipRating);
        View next = getNext(prepareView(request), request, skipCreative, skipRating);
        logger.debug("returning view: {}", next);
        response.status(200);
        return transform(request, response, next);
    }

    /**
     * this method returns an instance of View, determining what the worker should see next.
     *
     * @param builder      the builder of the view containing a workerID or -1 if none provided
     * @param request      the request
     * @param skipCreative whether to skip the Creative-Task
     * @param skipRating   whether to skip the Rating-Task
     * @return an instance of View
     */
    private View getNext(View.Builder builder, Request request, boolean skipCreative, boolean skipRating) {
        if (builder.getWorkerId() == -1) {
            builder = handleNoWorkerID(builder, request);
        }
        Optional<View> email = getEmail(builder, request);
        if (email.isPresent()) {
            if (email.get().getWorkerId() == -1) {
                logger.trace("email without workerid");
                return email.get().toBuilder()
                        .clearWorkerId()
                        .build();
            }
            return email.get();
        }
        if (checkCalibrationAndQuality(builder, request)) {
            logger.debug("worker {} is eligible for working on the assignment", builder.getWorkerId());
            Optional<View> Calibration = getCalibration(builder, request);
            if (Calibration.isPresent()) {
                return Calibration.get();
            }
            Optional<View> strategyStep = getStrategyStep(builder, request, skipCreative, skipRating);
            if (strategyStep.isPresent()) {
                return strategyStep.get();
            }
        } else {
            logger.debug("worker {} is not allowed to work on the assignment", builder.getWorkerId());
        }
        return workerFinished(builder, request);
    }

    /**
     * initializes a new ViewBuilder
     *
     * @param request the Request
     * @return an instance of view with the workerID or -1 if none provided
     */
    private View.Builder prepareView(Request request) {
        View.Builder builder = View.newBuilder();
        String worker = request.queryParams("worker");
        if (worker != null) {
            try {
                builder.setWorkerId(Integer.parseInt(worker));
            } catch (NumberFormatException e) {
                throw new BadRequestException("workerID mus be an Integer");
            }
        } else {
            builder.setWorkerId(-1);
        }
        logger.trace("workerid is: {}", worker);
        return builder;
    }

    /**
     * handles the case where no workerID was provided (workerID = -1).
     * This method just asks the Platform what to ID the worker should have and then calls getNext.
     *
     * @param builder the builder to use
     * @param request the request
     * @return an instance of View.
     */
    private View.Builder handleNoWorkerID(View.Builder builder, Request request) {
        String platformName = assertParameter(request, "platform");
        logger.debug("handling no worker-id");
        return communication.tryGetWorkerID(platformName, request.queryMap().toMap())
                .thenApply(result -> {
                    logger.debug("platform {} returned {}", platformName, result.map(Object::toString).orElse("nothing"));
                    return result;
                })
                .join()
                .map(builder::setWorkerId)
                .orElse(builder);
    }

    /**
     * checks if the worker has submitted the wrong calibration or whether the workers quality is under the
     * threshold.
     *
     * @param builder the builder to use
     * @param request the request
     * @return true if the worker is eligible for working on the assignment
     */
    private boolean checkCalibrationAndQuality(View.Builder builder, Request request) {
        String platformName = assertParameter(request, "platform");
        int experiment = assertParameterInt(request, "experiment");
        ExperimentRecord experimentRecord = experimentOperations.getExperiment(experiment);
        boolean submittedWrongCalibrations = calibrationsOperations.hasSubmittedWrongCalibrations(experiment, platformName, builder.getWorkerId());
        if (submittedWrongCalibrations) {
            logger.debug("worker {} has submitted wrong calibrations", builder.getWorkerId());
            return false;
        }

        boolean underThreshold = workerOperations.isUnderThreshold(experimentRecord.getWorkerQualityThreshold(), builder.getWorkerId());
        if (underThreshold) {
            logger.debug("worker {} is under the quality threshold", builder.getWorkerId());
        }
        return !underThreshold;
    }

    /**
     * may returns the Calibration if there are needed Calibration left unanswered.
     *
     * @param builder the builder to use
     * @param request the request
     * @return an instance of view if the worker has to fill in some Calibration, or empty if not.
     */
    private Optional<View> getCalibration(View.Builder builder, Request request) {
        String platformName = assertParameter(request, "platform");
        int experiment = assertParameterInt(request, "experiment");
        if (platformOperations.getPlatform(platformName).getRenderCalibrations()) {
            logger.trace("platform {} is able to render calibrations", platformName);
            Map<CalibrationRecord, Result<CalibrationAnswerOptionRecord>> calibrations =
                    calibrationsOperations.getCalibrations(experiment, platformName, builder.getWorkerId());
            logger.trace("worker {} must answer the calibrations {}", builder.getWorkerId(), calibrations);
            if (calibrations.isEmpty()) {
                logger.debug("worker {} must not answer calibrations", builder.getWorkerId());
                return Optional.empty();
            } else {
                logger.debug("worker {} must answer calibrations", builder.getWorkerId());
                return Optional.of(constructCalibrationView(calibrations, builder));
            }
        } else {
            logger.trace("platform {} is not able to render calibrations", platformName);
            return Optional.empty();
        }
    }

    /**
     * constructs the Calibration view from the qualifications-data.
     *
     * @param qualifications the qualifications
     * @param builder        the builder to use
     * @return an instance of View with the Type Calibration and the Calibration set.
     */
    private View constructCalibrationView(Map<CalibrationRecord, Result<CalibrationAnswerOptionRecord>> qualifications,
                                          View.Builder builder) {
        Function<CalibrationAnswerOptionRecord, View.CalibrationAnswerOption> constructAnswerOption = record ->
                View.CalibrationAnswerOption.newBuilder()
                        .setId(record.getIdCalibrationAnswerOption())
                        .setOption(record.getAnswer())
                        .build();

        List<View.Calibration> Calibration = qualifications.entrySet().stream()
                .map(entry -> View.Calibration.newBuilder()
                        .setQuestion(entry.getKey().getProperty())
                        .setId(entry.getKey().getIdCalibration())
                        .addAllAnswerOptions(entry.getValue().map(constructAnswerOption::apply))
                        .build()
                )
                .collect(Collectors.toList());

        return builder.addAllCalibrations(Calibration)
                .setType(View.Type.CALIBRATION)
                .build();
    }

    /**
     * may returns the next TaskView if the worker has not finished the assignment.
     *
     * @param builder      the builder to use
     * @param request      the request
     * @param skipCreative whether to skip the Creative-Task
     * @param skipRating   whether to skip the Rating-Task
     * @return a Task-View filled with the assignment, or empty if finished
     */
    private Optional<View> getStrategyStep(View.Builder builder, Request request, boolean skipCreative, boolean skipRating) {
        int experiment = assertParameterInt(request, "experiment");
        String platformName = assertParameter(request, "platform");
        if (skipCreative && skipRating) {
            logger.debug("worker {} chose to skip everything", builder.getWorkerId());
            return Optional.empty();
        }
        boolean skipCreativeTemp = skipCreative;
        boolean skipRatingTemp = skipRating;
        ExperimentsPlatformModeStopgap mode = experimentsPlatformOperations.getExperimentsPlatformMode(experiment, platformName);
        if (ExperimentsPlatformModeStopgap.answer.equals(mode)) {
            skipRatingTemp = true;
        } else if (ExperimentsPlatformModeStopgap.rating.equals(mode)) {
            skipCreativeTemp = true;
        }
        boolean resultingSkipCreative = skipCreativeTemp;
        boolean resultingSkipRating = skipRatingTemp;
        String algorithmTaskChooser = experimentOperations.getExperiment(experiment).getAlgorithmTaskChooser();
        logger.debug("invoking task-chooser {}", algorithmTaskChooser);
        return Optional.ofNullable(strategies.get(algorithmTaskChooser))
                .flatMap(strategy -> strategy.next(builder, request, experiment, platformName,
                        resultingSkipCreative, resultingSkipRating));
    }

    /**
     * may returns a View with the Type email if the platform needs an email and the user lacks one
     *
     * @param builder the builder to use
     * @param request the request
     * @return an instance of view with the type email or empty
     */
    private Optional<View> getEmail(View.Builder builder, Request request) {
        String platformName = assertParameter(request, "platform");
        if (platformOperations.getPlatform(platformName).getNeedsEmail() && builder.getWorkerId() == -1) {
            return Optional.of(builder.setType(View.Type.EMAIL).build());
        } else if (builder.getWorkerId() == -1) {
            throw new InternalServerErrorException("internal server error: did not get a workerID" +
                    "and the platform does not need an email");
        } else {
            return Optional.empty();
        }
    }

    /**
     * notifies the platform that the worker has finished the assignment and constructs the Finished View
     *
     * @param builder the builder to use
     * @param request the request
     * @return an View with the Type FINISHED
     */
    private View workerFinished(View.Builder builder, Request request) {
        //TODO notify??
        return builder.setType(View.Type.FINISHED)
                .build();
    }
}
