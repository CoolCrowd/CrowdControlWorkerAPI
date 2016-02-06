/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NotificationRecord extends org.jooq.impl.UpdatableRecordImpl<edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.NotificationRecord> implements org.jooq.Record7<java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.sql.Timestamp> {

	private static final long serialVersionUID = 1561467903;

	/**
	 * Setter for <code>crowdcontrol.Notification.id_notification</code>.
	 */
	public void setIdNotification(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Notification.id_notification</code>.
	 */
	public java.lang.Integer getIdNotification() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>crowdcontrol.Notification.name</code>.
	 */
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Notification.name</code>.
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>crowdcontrol.Notification.description</code>.
	 */
	public void setDescription(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Notification.description</code>.
	 */
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>crowdcontrol.Notification.checkPeriod</code>.
	 */
	public void setCheckperiod(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Notification.checkPeriod</code>.
	 */
	public java.lang.Integer getCheckperiod() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>crowdcontrol.Notification.sendThreshold</code>.
	 */
	public void setSendthreshold(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Notification.sendThreshold</code>.
	 */
	public java.lang.Integer getSendthreshold() {
		return (java.lang.Integer) getValue(4);
	}

	/**
	 * Setter for <code>crowdcontrol.Notification.query</code>.
	 */
	public void setQuery(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Notification.query</code>.
	 */
	public java.lang.String getQuery() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>crowdcontrol.Notification.lastSent</code>.
	 */
	public void setLastsent(java.sql.Timestamp value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Notification.lastSent</code>.
	 */
	public java.sql.Timestamp getLastsent() {
		return (java.sql.Timestamp) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Notification.NOTIFICATION.ID_NOTIFICATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Notification.NOTIFICATION.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Notification.NOTIFICATION.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Notification.NOTIFICATION.CHECKPERIOD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Notification.NOTIFICATION.SENDTHRESHOLD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Notification.NOTIFICATION.QUERY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field7() {
		return edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Notification.NOTIFICATION.LASTSENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getIdNotification();
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
	public java.lang.String value3() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getCheckperiod();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getSendthreshold();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getQuery();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value7() {
		return getLastsent();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NotificationRecord value1(java.lang.Integer value) {
		setIdNotification(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NotificationRecord value2(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NotificationRecord value3(java.lang.String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NotificationRecord value4(java.lang.Integer value) {
		setCheckperiod(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NotificationRecord value5(java.lang.Integer value) {
		setSendthreshold(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NotificationRecord value6(java.lang.String value) {
		setQuery(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NotificationRecord value7(java.sql.Timestamp value) {
		setLastsent(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NotificationRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.String value3, java.lang.Integer value4, java.lang.Integer value5, java.lang.String value6, java.sql.Timestamp value7) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached NotificationRecord
	 */
	public NotificationRecord() {
		super(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Notification.NOTIFICATION);
	}

	/**
	 * Create a detached, initialised NotificationRecord
	 */
	public NotificationRecord(java.lang.Integer idNotification, java.lang.String name, java.lang.String description, java.lang.Integer checkperiod, java.lang.Integer sendthreshold, java.lang.String query, java.sql.Timestamp lastsent) {
		super(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Notification.NOTIFICATION);

		setValue(0, idNotification);
		setValue(1, name);
		setValue(2, description);
		setValue(3, checkperiod);
		setValue(4, sendthreshold);
		setValue(5, query);
		setValue(6, lastsent);
	}
}