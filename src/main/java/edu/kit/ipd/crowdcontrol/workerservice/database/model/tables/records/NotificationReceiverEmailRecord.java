/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records;


import edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.NotificationReceiverEmail;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NotificationReceiverEmailRecord extends UpdatableRecordImpl<NotificationReceiverEmailRecord> implements Record3<Integer, Integer, String> {

	private static final long serialVersionUID = -1924998867;

	/**
	 * Setter for <code>crowdcontrol.Notification_Receiver_Email.id_notification_receiver_email</code>.
	 */
	public void setIdNotificationReceiverEmail(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Notification_Receiver_Email.id_notification_receiver_email</code>.
	 */
	public Integer getIdNotificationReceiverEmail() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>crowdcontrol.Notification_Receiver_Email.notification</code>.
	 */
	public void setNotification(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Notification_Receiver_Email.notification</code>.
	 */
	public Integer getNotification() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>crowdcontrol.Notification_Receiver_Email.email</code>.
	 */
	public void setEmail(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Notification_Receiver_Email.email</code>.
	 */
	public String getEmail() {
		return (String) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, Integer, String> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, Integer, String> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return NotificationReceiverEmail.NOTIFICATION_RECEIVER_EMAIL.ID_NOTIFICATION_RECEIVER_EMAIL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return NotificationReceiverEmail.NOTIFICATION_RECEIVER_EMAIL.NOTIFICATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return NotificationReceiverEmail.NOTIFICATION_RECEIVER_EMAIL.EMAIL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getIdNotificationReceiverEmail();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getNotification();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getEmail();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NotificationReceiverEmailRecord value1(Integer value) {
		setIdNotificationReceiverEmail(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NotificationReceiverEmailRecord value2(Integer value) {
		setNotification(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NotificationReceiverEmailRecord value3(String value) {
		setEmail(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public NotificationReceiverEmailRecord values(Integer value1, Integer value2, String value3) {
		value1(value1);
		value2(value2);
		value3(value3);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached NotificationReceiverEmailRecord
	 */
	public NotificationReceiverEmailRecord() {
		super(NotificationReceiverEmail.NOTIFICATION_RECEIVER_EMAIL);
	}

	/**
	 * Create a detached, initialised NotificationReceiverEmailRecord
	 */
	public NotificationReceiverEmailRecord(Integer idNotificationReceiverEmail, Integer notification, String email) {
		super(NotificationReceiverEmail.NOTIFICATION_RECEIVER_EMAIL);

		setValue(0, idNotificationReceiverEmail);
		setValue(1, notification);
		setValue(2, email);
	}
}