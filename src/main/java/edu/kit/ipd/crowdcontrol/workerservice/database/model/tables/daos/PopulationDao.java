/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.daos;

import edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.pojos.Population;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.PopulationRecord;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PopulationDao extends org.jooq.impl.DAOImpl<PopulationRecord, Population, java.lang.Integer> {

	/**
	 * Create a new PopulationDao without any configuration
	 */
	public PopulationDao() {
		super(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Population.POPULATION, Population.class);
	}

	/**
	 * Create a new PopulationDao with an attached configuration
	 */
	public PopulationDao(org.jooq.Configuration configuration) {
		super(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Population.POPULATION, Population.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(Population object) {
		return object.getIdpopulation();
	}

	/**
	 * Fetch records that have <code>idPopulation IN (values)</code>
	 */
	public java.util.List<Population> fetchByIdpopulation(java.lang.Integer... values) {
		return fetch(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Population.POPULATION.IDPOPULATION, values);
	}

	/**
	 * Fetch a unique record that has <code>idPopulation = value</code>
	 */
	public Population fetchOneByIdpopulation(java.lang.Integer value) {
		return fetchOne(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Population.POPULATION.IDPOPULATION, value);
	}

	/**
	 * Fetch records that have <code>property IN (values)</code>
	 */
	public java.util.List<Population> fetchByProperty(java.lang.String... values) {
		return fetch(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Population.POPULATION.PROPERTY, values);
	}

	/**
	 * Fetch records that have <code>description IN (values)</code>
	 */
	public java.util.List<Population> fetchByDescription(java.lang.String... values) {
		return fetch(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Population.POPULATION.DESCRIPTION, values);
	}

	/**
	 * Fetch records that have <code>name IN (values)</code>
	 */
	public java.util.List<Population> fetchByName(java.lang.String... values) {
		return fetch(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Population.POPULATION.NAME, values);
	}

	/**
	 * Fetch records that have <code>experiment IN (values)</code>
	 */
	public java.util.List<Population> fetchByExperiment(java.lang.Integer... values) {
		return fetch(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Population.POPULATION.EXPERIMENT, values);
	}

	/**
	 * Fetch a unique record that has <code>experiment = value</code>
	 */
	public Population fetchOneByExperiment(java.lang.Integer value) {
		return fetchOne(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Population.POPULATION.EXPERIMENT, value);
	}
}
