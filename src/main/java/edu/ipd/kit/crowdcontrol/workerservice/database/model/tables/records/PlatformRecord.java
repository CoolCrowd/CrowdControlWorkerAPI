/**
 * This class is generated by jOOQ
 */
package edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PlatformRecord extends org.jooq.impl.UpdatableRecordImpl<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PlatformRecord> implements org.jooq.Record4<java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean> {

	private static final long serialVersionUID = 753463279;

	/**
	 * Setter for <code>crowdcontrol.Platform.idPlatform</code>.
	 */
	public void setIdplatform(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Platform.idPlatform</code>.
	 */
	public java.lang.String getIdplatform() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>crowdcontrol.Platform.name</code>.
	 */
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Platform.name</code>.
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>crowdcontrol.Platform.render_calibrations</code>.
	 */
	public void setRenderCalibrations(java.lang.Boolean value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Platform.render_calibrations</code>.
	 */
	public java.lang.Boolean getRenderCalibrations() {
		return (java.lang.Boolean) getValue(2);
	}

	/**
	 * Setter for <code>crowdcontrol.Platform.needs_email</code>.
	 */
	public void setNeedsEmail(java.lang.Boolean value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Platform.needs_email</code>.
	 */
	public java.lang.Boolean getNeedsEmail() {
		return (java.lang.Boolean) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.String> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Platform.PLATFORM.IDPLATFORM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Platform.PLATFORM.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field3() {
		return edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Platform.PLATFORM.RENDER_CALIBRATIONS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field4() {
		return edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Platform.PLATFORM.NEEDS_EMAIL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getIdplatform();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value3() {
		return getRenderCalibrations();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value4() {
		return getNeedsEmail();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlatformRecord value1(java.lang.String value) {
		setIdplatform(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlatformRecord value2(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlatformRecord value3(java.lang.Boolean value) {
		setRenderCalibrations(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlatformRecord value4(java.lang.Boolean value) {
		setNeedsEmail(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PlatformRecord values(java.lang.String value1, java.lang.String value2, java.lang.Boolean value3, java.lang.Boolean value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PlatformRecord
	 */
	public PlatformRecord() {
		super(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Platform.PLATFORM);
	}

	/**
	 * Create a detached, initialised PlatformRecord
	 */
	public PlatformRecord(java.lang.String idplatform, java.lang.String name, java.lang.Boolean renderCalibrations, java.lang.Boolean needsEmail) {
		super(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Platform.PLATFORM);

		setValue(0, idplatform);
		setValue(1, name);
		setValue(2, renderCalibrations);
		setValue(3, needsEmail);
	}
}
