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
public class ExperimentRecord extends org.jooq.impl.UpdatableRecordImpl<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ExperimentRecord> implements org.jooq.Record13<java.lang.Integer, java.lang.Object, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String> {

	private static final long serialVersionUID = 1786001022;

	/**
	 * Setter for <code>crowdcontrol.Experiment.idexperiment</code>.
	 */
	public void setIdexperiment(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Experiment.idexperiment</code>.
	 */
	public java.lang.Integer getIdexperiment() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>crowdcontrol.Experiment.rating_options</code>.
	 */
	public void setRatingOptions(java.lang.Object value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Experiment.rating_options</code>.
	 */
	public java.lang.Object getRatingOptions() {
		return (java.lang.Object) getValue(1);
	}

	/**
	 * Setter for <code>crowdcontrol.Experiment.titel</code>.
	 */
	public void setTitel(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Experiment.titel</code>.
	 */
	public java.lang.String getTitel() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>crowdcontrol.Experiment.answer_description</code>.
	 */
	public void setAnswerDescription(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Experiment.answer_description</code>.
	 */
	public java.lang.String getAnswerDescription() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>crowdcontrol.Experiment.rating_description</code>.
	 */
	public void setRatingDescription(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Experiment.rating_description</code>.
	 */
	public java.lang.String getRatingDescription() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>crowdcontrol.Experiment.ratings_per_answer</code>.
	 */
	public void setRatingsPerAnswer(java.lang.Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Experiment.ratings_per_answer</code>.
	 */
	public java.lang.Integer getRatingsPerAnswer() {
		return (java.lang.Integer) getValue(5);
	}

	/**
	 * Setter for <code>crowdcontrol.Experiment.algorithm_task_chooser</code>.
	 */
	public void setAlgorithmTaskChooser(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Experiment.algorithm_task_chooser</code>.
	 */
	public java.lang.String getAlgorithmTaskChooser() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>crowdcontrol.Experiment.algorithm_quality_answer</code>.
	 */
	public void setAlgorithmQualityAnswer(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Experiment.algorithm_quality_answer</code>.
	 */
	public java.lang.String getAlgorithmQualityAnswer() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>crowdcontrol.Experiment.algorithm_quality_rating</code>.
	 */
	public void setAlgorithmQualityRating(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Experiment.algorithm_quality_rating</code>.
	 */
	public java.lang.String getAlgorithmQualityRating() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>crowdcontrol.Experiment.base_payment</code>.
	 */
	public void setBasePayment(java.lang.Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Experiment.base_payment</code>.
	 */
	public java.lang.Integer getBasePayment() {
		return (java.lang.Integer) getValue(9);
	}

	/**
	 * Setter for <code>crowdcontrol.Experiment.bonus_answer</code>.
	 */
	public void setBonusAnswer(java.lang.Integer value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Experiment.bonus_answer</code>.
	 */
	public java.lang.Integer getBonusAnswer() {
		return (java.lang.Integer) getValue(10);
	}

	/**
	 * Setter for <code>crowdcontrol.Experiment.bonus_rating</code>.
	 */
	public void setBonusRating(java.lang.Integer value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Experiment.bonus_rating</code>.
	 */
	public java.lang.Integer getBonusRating() {
		return (java.lang.Integer) getValue(11);
	}

	/**
	 * Setter for <code>crowdcontrol.Experiment.template_data</code>.
	 */
	public void setTemplateData(java.lang.String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Experiment.template_data</code>.
	 */
	public java.lang.String getTemplateData() {
		return (java.lang.String) getValue(12);
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
	// Record13 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row13<java.lang.Integer, java.lang.Object, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String> fieldsRow() {
		return (org.jooq.Row13) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row13<java.lang.Integer, java.lang.Object, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String> valuesRow() {
		return (org.jooq.Row13) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Experiment.EXPERIMENT.IDEXPERIMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field2() {
		return edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Experiment.EXPERIMENT.RATING_OPTIONS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Experiment.EXPERIMENT.TITEL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Experiment.EXPERIMENT.ANSWER_DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Experiment.EXPERIMENT.RATING_DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Experiment.EXPERIMENT.RATINGS_PER_ANSWER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Experiment.EXPERIMENT.ALGORITHM_TASK_CHOOSER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Experiment.EXPERIMENT.ALGORITHM_QUALITY_ANSWER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Experiment.EXPERIMENT.ALGORITHM_QUALITY_RATING;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field10() {
		return edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Experiment.EXPERIMENT.BASE_PAYMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field11() {
		return edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Experiment.EXPERIMENT.BONUS_ANSWER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field12() {
		return edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Experiment.EXPERIMENT.BONUS_RATING;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field13() {
		return edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Experiment.EXPERIMENT.TEMPLATE_DATA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getIdexperiment();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value2() {
		return getRatingOptions();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getTitel();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getAnswerDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getRatingDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getRatingsPerAnswer();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getAlgorithmTaskChooser();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getAlgorithmQualityAnswer();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getAlgorithmQualityRating();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value10() {
		return getBasePayment();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value11() {
		return getBonusAnswer();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value12() {
		return getBonusRating();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value13() {
		return getTemplateData();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord value1(java.lang.Integer value) {
		setIdexperiment(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord value2(java.lang.Object value) {
		setRatingOptions(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord value3(java.lang.String value) {
		setTitel(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord value4(java.lang.String value) {
		setAnswerDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord value5(java.lang.String value) {
		setRatingDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord value6(java.lang.Integer value) {
		setRatingsPerAnswer(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord value7(java.lang.String value) {
		setAlgorithmTaskChooser(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord value8(java.lang.String value) {
		setAlgorithmQualityAnswer(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord value9(java.lang.String value) {
		setAlgorithmQualityRating(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord value10(java.lang.Integer value) {
		setBasePayment(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord value11(java.lang.Integer value) {
		setBonusAnswer(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord value12(java.lang.Integer value) {
		setBonusRating(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord value13(java.lang.String value) {
		setTemplateData(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentRecord values(java.lang.Integer value1, java.lang.Object value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.Integer value6, java.lang.String value7, java.lang.String value8, java.lang.String value9, java.lang.Integer value10, java.lang.Integer value11, java.lang.Integer value12, java.lang.String value13) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ExperimentRecord
	 */
	public ExperimentRecord() {
		super(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Experiment.EXPERIMENT);
	}

	/**
	 * Create a detached, initialised ExperimentRecord
	 */
	public ExperimentRecord(java.lang.Integer idexperiment, java.lang.Object ratingOptions, java.lang.String titel, java.lang.String answerDescription, java.lang.String ratingDescription, java.lang.Integer ratingsPerAnswer, java.lang.String algorithmTaskChooser, java.lang.String algorithmQualityAnswer, java.lang.String algorithmQualityRating, java.lang.Integer basePayment, java.lang.Integer bonusAnswer, java.lang.Integer bonusRating, java.lang.String templateData) {
		super(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Experiment.EXPERIMENT);

		setValue(0, idexperiment);
		setValue(1, ratingOptions);
		setValue(2, titel);
		setValue(3, answerDescription);
		setValue(4, ratingDescription);
		setValue(5, ratingsPerAnswer);
		setValue(6, algorithmTaskChooser);
		setValue(7, algorithmQualityAnswer);
		setValue(8, algorithmQualityRating);
		setValue(9, basePayment);
		setValue(10, bonusAnswer);
		setValue(11, bonusRating);
		setValue(12, templateData);
	}
}
