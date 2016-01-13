package edu.kit.ipd.crowdcontrol.workerservice.database.operations;

import edu.kit.ipd.crowdcontrol.workerservice.database.model.Tables;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.PopulationRecord;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.impl.DSL;

import java.util.List;
import java.util.Map;

/**
 * PopulationsOperations contains queries which are concerned with populations.
 * @author LeanderK
 * @version 1.0
 */
public class PopulationsOperations extends AbstractOperation {

    /**
     * creates a new instance of PopulationsOperations
     * @param create the context used to communicate with the database
     */
    public PopulationsOperations(DSLContext create) {
        super(create);
    }

    /**
     * returns all the open Calibrations needed from the worker
     * @param experimentID the experiment
     * @param platformID the id of the platform
     * @param worker the worker
     * @return a map where the keys are the detailed population the worker may belong to and the values are the answerOptions
     */
    public Map<PopulationRecord, List<String>> getCalibrations(int experimentID, String platformID, int worker) {
        List<Integer> answeredCalibrations = DSL.select()
                .from(Tables.POPULATIONRESULT)
                .join(Tables.POPULATIONANSWEROPTION).onKey()
                .where(Tables.POPULATIONRESULT.WORKER.eq(worker))
                .fetch(Tables.POPULATIONANSWEROPTION.POPULATION);

        List<Integer> populationIDs = create.selectFrom(Tables.EXPERIMENTSPOPULATION)
                .where(Tables.EXPERIMENTSPOPULATION.POPULATION_USER.eq(experimentID))
                .and(Tables.EXPERIMENTSPOPULATION.REFERENCED_PLATFORM.eq(platformID))
                .and(Tables.EXPERIMENTSPOPULATION.REFERENCED_POPULATION.notIn(answeredCalibrations))
                .fetch(Tables.EXPERIMENTSPOPULATION.REFERENCED_POPULATION);

        Map<PopulationRecord, Result<Record>> populationAndAnswers = create.select()
                .from(Tables.POPULATION)
                .join(Tables.POPULATIONANSWEROPTION).onKey()
                .where(Tables.POPULATION.IDPOPULATION.in(populationIDs))
                .fetchGroups(Tables.POPULATION);

        return mapMap(populationAndAnswers, record -> record.getValues(Tables.POPULATIONANSWEROPTION.ANSWER));
    }
}