/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.workerservice.database.model.tables;

import edu.kit.ipd.crowdcontrol.workerservice.database.model.Crowdcontrol;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.Keys;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.NotificationRecord;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Notification extends org.jooq.impl.TableImpl<NotificationRecord> {

	private static final long serialVersionUID = 1752320493;

	/**
	 * The singleton instance of <code>crowdcontrol.Notification</code>
	 */
	public static final Notification NOTIFICATION = new Notification();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<NotificationRecord> getRecordType() {
		return NotificationRecord.class;
	}

	/**
	 * The column <code>crowdcontrol.Notification.idNotification</code>.
	 */
	public final org.jooq.TableField<NotificationRecord, java.lang.Integer> IDNOTIFICATION = createField("idNotification", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Notification.name</code>.
	 */
	public final org.jooq.TableField<NotificationRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Notification.description</code>.
	 */
	public final org.jooq.TableField<NotificationRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Notification.checkPeriod</code>.
	 */
	public final org.jooq.TableField<NotificationRecord, java.lang.Integer> CHECKPERIOD = createField("checkPeriod", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Notification.sendThreshold</code>.
	 */
	public final org.jooq.TableField<NotificationRecord, java.lang.Integer> SENDTHRESHOLD = createField("sendThreshold", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Notification.query</code>.
	 */
	public final org.jooq.TableField<NotificationRecord, java.lang.String> QUERY = createField("query", org.jooq.impl.SQLDataType.CLOB.length(16777215).nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Notification.lastSent</code>.
	 */
	public final org.jooq.TableField<NotificationRecord, java.sql.Timestamp> LASTSENT = createField("lastSent", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * Create a <code>crowdcontrol.Notification</code> table reference
	 */
	public Notification() {
		this("Notification", null);
	}

	/**
	 * Create an aliased <code>crowdcontrol.Notification</code> table reference
	 */
	public Notification(java.lang.String alias) {
		this(alias, Notification.NOTIFICATION);
	}

	private Notification(java.lang.String alias, org.jooq.Table<NotificationRecord> aliased) {
		this(alias, aliased, null);
	}

	private Notification(java.lang.String alias, org.jooq.Table<NotificationRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, Crowdcontrol.CROWDCONTROL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<NotificationRecord> getPrimaryKey() {
		return Keys.KEY_NOTIFICATION_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<NotificationRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<NotificationRecord>>asList(Keys.KEY_NOTIFICATION_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Notification as(java.lang.String alias) {
		return new Notification(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Notification rename(java.lang.String name) {
		return new Notification(name, null);
	}
}
