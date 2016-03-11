/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records;


import edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.AlgorithmTaskChooser;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class AlgorithmTaskChooserRecord extends UpdatableRecordImpl<AlgorithmTaskChooserRecord> implements Record2<String, String> {

	private static final long serialVersionUID = -1972785448;

	/**
	 * Setter for <code>crowdcontrol.Algorithm_Task_Chooser.id_task_chooser</code>.
	 */
	public void setIdTaskChooser(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Algorithm_Task_Chooser.id_task_chooser</code>.
	 */
	public String getIdTaskChooser() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>crowdcontrol.Algorithm_Task_Chooser.description</code>.
	 */
	public void setDescription(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Algorithm_Task_Chooser.description</code>.
	 */
	public String getDescription() {
		return (String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<String> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<String, String> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<String, String> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return AlgorithmTaskChooser.ALGORITHM_TASK_CHOOSER.ID_TASK_CHOOSER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return AlgorithmTaskChooser.ALGORITHM_TASK_CHOOSER.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getIdTaskChooser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlgorithmTaskChooserRecord value1(String value) {
		setIdTaskChooser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlgorithmTaskChooserRecord value2(String value) {
		setDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlgorithmTaskChooserRecord values(String value1, String value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AlgorithmTaskChooserRecord
	 */
	public AlgorithmTaskChooserRecord() {
		super(AlgorithmTaskChooser.ALGORITHM_TASK_CHOOSER);
	}

	/**
	 * Create a detached, initialised AlgorithmTaskChooserRecord
	 */
	public AlgorithmTaskChooserRecord(String idTaskChooser, String description) {
		super(AlgorithmTaskChooser.ALGORITHM_TASK_CHOOSER);

		setValue(0, idTaskChooser);
		setValue(1, description);
	}
}