/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.workerservice.database.model.tables;

import edu.kit.ipd.crowdcontrol.workerservice.database.model.Crowdcontrol;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.Keys;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.ExperimentRecord;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Experiment extends org.jooq.impl.TableImpl<ExperimentRecord> {

	private static final long serialVersionUID = 85777317;

	/**
	 * The singleton instance of <code>crowdcontrol.Experiment</code>
	 */
	public static final Experiment EXPERIMENT = new Experiment();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<ExperimentRecord> getRecordType() {
		return ExperimentRecord.class;
	}

	/**
	 * The column <code>crowdcontrol.Experiment.idexperiment</code>.
	 */
	public final org.jooq.TableField<ExperimentRecord, java.lang.Integer> IDEXPERIMENT = createField("idexperiment", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Experiment.rating_options</code>.
	 */
	public final org.jooq.TableField<ExperimentRecord, java.lang.Object> RATING_OPTIONS = createField("rating_options", org.jooq.impl.DefaultDataType.getDefaultDataType("json"), this, "");

	/**
	 * The column <code>crowdcontrol.Experiment.titel</code>.
	 */
	public final org.jooq.TableField<ExperimentRecord, java.lang.String> TITEL = createField("titel", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>crowdcontrol.Experiment.answer_description</code>.
	 */
	public final org.jooq.TableField<ExperimentRecord, java.lang.String> ANSWER_DESCRIPTION = createField("answer_description", org.jooq.impl.SQLDataType.CLOB.length(65535), this, "");

	/**
	 * The column <code>crowdcontrol.Experiment.ratings_per_answer</code>.
	 */
	public final org.jooq.TableField<ExperimentRecord, java.lang.Integer> RATINGS_PER_ANSWER = createField("ratings_per_answer", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>crowdcontrol.Experiment.algorithm_task_chooser</code>.
	 */
	public final org.jooq.TableField<ExperimentRecord, java.lang.String> ALGORITHM_TASK_CHOOSER = createField("algorithm_task_chooser", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>crowdcontrol.Experiment.algorithm_quality_answer</code>.
	 */
	public final org.jooq.TableField<ExperimentRecord, java.lang.String> ALGORITHM_QUALITY_ANSWER = createField("algorithm_quality_answer", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>crowdcontrol.Experiment.algorithm_quality_rating</code>.
	 */
	public final org.jooq.TableField<ExperimentRecord, java.lang.String> ALGORITHM_QUALITY_RATING = createField("algorithm_quality_rating", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>crowdcontrol.Experiment.base_payment</code>.
	 */
	public final org.jooq.TableField<ExperimentRecord, java.lang.Integer> BASE_PAYMENT = createField("base_payment", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>crowdcontrol.Experiment.bonus_answer</code>.
	 */
	public final org.jooq.TableField<ExperimentRecord, java.lang.Integer> BONUS_ANSWER = createField("bonus_answer", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>crowdcontrol.Experiment.bonus_rating</code>.
	 */
	public final org.jooq.TableField<ExperimentRecord, java.lang.Integer> BONUS_RATING = createField("bonus_rating", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>crowdcontrol.Experiment.template_data</code>.
	 */
	public final org.jooq.TableField<ExperimentRecord, java.lang.String> TEMPLATE_DATA = createField("template_data", org.jooq.impl.SQLDataType.CLOB.length(16777215), this, "");

	/**
	 * The column <code>crowdcontrol.Experiment.template</code>.
	 */
	public final org.jooq.TableField<ExperimentRecord, java.lang.Integer> TEMPLATE = createField("template", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>crowdcontrol.Experiment.answer_type</code>.
	 */
	public final org.jooq.TableField<ExperimentRecord, java.lang.String> ANSWER_TYPE = createField("answer_type", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

	/**
	 * Create a <code>crowdcontrol.Experiment</code> table reference
	 */
	public Experiment() {
		this("Experiment", null);
	}

	/**
	 * Create an aliased <code>crowdcontrol.Experiment</code> table reference
	 */
	public Experiment(java.lang.String alias) {
		this(alias, Experiment.EXPERIMENT);
	}

	private Experiment(java.lang.String alias, org.jooq.Table<ExperimentRecord> aliased) {
		this(alias, aliased, null);
	}

	private Experiment(java.lang.String alias, org.jooq.Table<ExperimentRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, Crowdcontrol.CROWDCONTROL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<ExperimentRecord> getPrimaryKey() {
		return Keys.KEY_EXPERIMENT_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<ExperimentRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<ExperimentRecord>>asList(Keys.KEY_EXPERIMENT_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<ExperimentRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<ExperimentRecord, ?>>asList(Keys.USEDTEMPLATE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Experiment as(java.lang.String alias) {
		return new Experiment(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Experiment rename(java.lang.String name) {
		return new Experiment(name, null);
	}
}