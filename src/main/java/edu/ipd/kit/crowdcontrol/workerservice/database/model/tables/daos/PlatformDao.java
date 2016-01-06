/**
 * This class is generated by jOOQ
 */
package edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PlatformDao extends org.jooq.impl.DAOImpl<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PlatformRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Platform, java.lang.String> {

	/**
	 * Create a new PlatformDao without any configuration
	 */
	public PlatformDao() {
		super(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Platform.PLATFORM, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Platform.class);
	}

	/**
	 * Create a new PlatformDao with an attached configuration
	 */
	public PlatformDao(org.jooq.Configuration configuration) {
		super(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Platform.PLATFORM, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Platform.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.String getId(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Platform object) {
		return object.getIdplatform();
	}

	/**
	 * Fetch records that have <code>idPlatform IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Platform> fetchByIdplatform(java.lang.String... values) {
		return fetch(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Platform.PLATFORM.IDPLATFORM, values);
	}

	/**
	 * Fetch a unique record that has <code>idPlatform = value</code>
	 */
	public edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Platform fetchOneByIdplatform(java.lang.String value) {
		return fetchOne(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Platform.PLATFORM.IDPLATFORM, value);
	}

	/**
	 * Fetch records that have <code>name IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Platform> fetchByName(java.lang.String... values) {
		return fetch(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Platform.PLATFORM.NAME, values);
	}

	/**
	 * Fetch records that have <code>native_qualifications IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Platform> fetchByNativeQualifications(java.lang.Boolean... values) {
		return fetch(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Platform.PLATFORM.NATIVE_QUALIFICATIONS, values);
	}

	/**
	 * Fetch records that have <code>native_payment IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Platform> fetchByNativePayment(java.lang.Boolean... values) {
		return fetch(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Platform.PLATFORM.NATIVE_PAYMENT, values);
	}

	/**
	 * Fetch records that have <code>needs_email IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Platform> fetchByNeedsEmail(java.lang.Boolean... values) {
		return fetch(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Platform.PLATFORM.NEEDS_EMAIL, values);
	}
}
