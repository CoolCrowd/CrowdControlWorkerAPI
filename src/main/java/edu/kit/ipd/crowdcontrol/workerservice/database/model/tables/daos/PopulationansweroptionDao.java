/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.daos;

import edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.pojos.Populationansweroption;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.PopulationansweroptionRecord;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PopulationansweroptionDao extends org.jooq.impl.DAOImpl<PopulationansweroptionRecord, Populationansweroption, java.lang.Integer> {

	/**
	 * Create a new PopulationansweroptionDao without any configuration
	 */
	public PopulationansweroptionDao() {
		super(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Populationansweroption.POPULATIONANSWEROPTION, Populationansweroption.class);
	}

	/**
	 * Create a new PopulationansweroptionDao with an attached configuration
	 */
	public PopulationansweroptionDao(org.jooq.Configuration configuration) {
		super(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Populationansweroption.POPULATIONANSWEROPTION, Populationansweroption.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(Populationansweroption object) {
		return object.getIdpopulationansweroption();
	}

	/**
	 * Fetch records that have <code>idPopulationAnswerOption IN (values)</code>
	 */
	public java.util.List<Populationansweroption> fetchByIdpopulationansweroption(java.lang.Integer... values) {
		return fetch(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Populationansweroption.POPULATIONANSWEROPTION.IDPOPULATIONANSWEROPTION, values);
	}

	/**
	 * Fetch a unique record that has <code>idPopulationAnswerOption = value</code>
	 */
	public Populationansweroption fetchOneByIdpopulationansweroption(java.lang.Integer value) {
		return fetchOne(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Populationansweroption.POPULATIONANSWEROPTION.IDPOPULATIONANSWEROPTION, value);
	}

	/**
	 * Fetch records that have <code>population IN (values)</code>
	 */
	public java.util.List<Populationansweroption> fetchByPopulation(java.lang.Integer... values) {
		return fetch(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Populationansweroption.POPULATIONANSWEROPTION.POPULATION, values);
	}

	/**
	 * Fetch records that have <code>answer IN (values)</code>
	 */
	public java.util.List<Populationansweroption> fetchByAnswer(java.lang.String... values) {
		return fetch(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Populationansweroption.POPULATIONANSWEROPTION.ANSWER, values);
	}
}
