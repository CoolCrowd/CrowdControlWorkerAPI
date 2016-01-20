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
public class PopulationAnswerOptionRecord extends org.jooq.impl.UpdatableRecordImpl<edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.PopulationAnswerOptionRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.String> {

	private static final long serialVersionUID = 414924672;

	/**
	 * Setter for <code>crowdcontrol.Population_answer_option.id_population_answer_option</code>.
	 */
	public void setIdPopulationAnswerOption(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Population_answer_option.id_population_answer_option</code>.
	 */
	public java.lang.Integer getIdPopulationAnswerOption() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>crowdcontrol.Population_answer_option.population</code>.
	 */
	public void setPopulation(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Population_answer_option.population</code>.
	 */
	public java.lang.Integer getPopulation() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>crowdcontrol.Population_answer_option.answer</code>.
	 */
	public void setAnswer(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Population_answer_option.answer</code>.
	 */
	public java.lang.String getAnswer() {
		return (java.lang.String) getValue(2);
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
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.String> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.String> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.PopulationAnswerOption.POPULATION_ANSWER_OPTION.ID_POPULATION_ANSWER_OPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.PopulationAnswerOption.POPULATION_ANSWER_OPTION.POPULATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.PopulationAnswerOption.POPULATION_ANSWER_OPTION.ANSWER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getIdPopulationAnswerOption();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getPopulation();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getAnswer();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PopulationAnswerOptionRecord value1(java.lang.Integer value) {
		setIdPopulationAnswerOption(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PopulationAnswerOptionRecord value2(java.lang.Integer value) {
		setPopulation(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PopulationAnswerOptionRecord value3(java.lang.String value) {
		setAnswer(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public PopulationAnswerOptionRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.String value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached PopulationAnswerOptionRecord
	 */
	public PopulationAnswerOptionRecord() {
		super(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.PopulationAnswerOption.POPULATION_ANSWER_OPTION);
	}

	/**
	 * Create a detached, initialised PopulationAnswerOptionRecord
	 */
	public PopulationAnswerOptionRecord(java.lang.Integer idPopulationAnswerOption, java.lang.Integer population, java.lang.String answer) {
		super(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.PopulationAnswerOption.POPULATION_ANSWER_OPTION);

		setValue(0, idPopulationAnswerOption);
		setValue(1, population);
		setValue(2, answer);
	}
}