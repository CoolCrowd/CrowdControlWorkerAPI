/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ExperimentsPlatformModeDao extends org.jooq.impl.DAOImpl<edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.ExperimentsPlatformModeRecord, edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.pojos.ExperimentsPlatformMode, java.lang.Integer> {

	/**
	 * Create a new ExperimentsPlatformModeDao without any configuration
	 */
	public ExperimentsPlatformModeDao() {
		super(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.ExperimentsPlatformMode.EXPERIMENTS_PLATFORM_MODE, edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.pojos.ExperimentsPlatformMode.class);
	}

	/**
	 * Create a new ExperimentsPlatformModeDao with an attached configuration
	 */
	public ExperimentsPlatformModeDao(org.jooq.Configuration configuration) {
		super(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.ExperimentsPlatformMode.EXPERIMENTS_PLATFORM_MODE, edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.pojos.ExperimentsPlatformMode.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.pojos.ExperimentsPlatformMode object) {
		return object.getIdexperimentsPlatformStopgap();
	}

	/**
	 * Fetch records that have <code>idExperiments_Platform_Stopgap IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.pojos.ExperimentsPlatformMode> fetchByIdexperimentsPlatformStopgap(java.lang.Integer... values) {
		return fetch(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.ExperimentsPlatformMode.EXPERIMENTS_PLATFORM_MODE.IDEXPERIMENTS_PLATFORM_STOPGAP, values);
	}

	/**
	 * Fetch a unique record that has <code>idExperiments_Platform_Stopgap = value</code>
	 */
	public edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.pojos.ExperimentsPlatformMode fetchOneByIdexperimentsPlatformStopgap(java.lang.Integer value) {
		return fetchOne(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.ExperimentsPlatformMode.EXPERIMENTS_PLATFORM_MODE.IDEXPERIMENTS_PLATFORM_STOPGAP, value);
	}

	/**
	 * Fetch records that have <code>experiments_platform IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.pojos.ExperimentsPlatformMode> fetchByExperimentsPlatform(java.lang.Integer... values) {
		return fetch(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.ExperimentsPlatformMode.EXPERIMENTS_PLATFORM_MODE.EXPERIMENTS_PLATFORM, values);
	}

	/**
	 * Fetch records that have <code>stopgap IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.pojos.ExperimentsPlatformMode> fetchByStopgap(edu.kit.ipd.crowdcontrol.workerservice.database.model.enums.ExperimentsPlatformModeStopgap... values) {
		return fetch(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.ExperimentsPlatformMode.EXPERIMENTS_PLATFORM_MODE.STOPGAP, values);
	}

	/**
	 * Fetch records that have <code>timestamp IN (values)</code>
	 */
	public java.util.List<edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.pojos.ExperimentsPlatformMode> fetchByTimestamp(java.sql.Timestamp... values) {
		return fetch(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.ExperimentsPlatformMode.EXPERIMENTS_PLATFORM_MODE.TIMESTAMP, values);
	}
}