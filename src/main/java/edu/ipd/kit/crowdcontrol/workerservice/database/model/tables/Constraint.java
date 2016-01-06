/**
 * This class is generated by jOOQ
 */
package edu.ipd.kit.crowdcontrol.workerservice.database.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Constraint extends org.jooq.impl.TableImpl<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ConstraintRecord> {

	private static final long serialVersionUID = 1251423741;

	/**
	 * The singleton instance of <code>crowdcontrol.Constraint</code>
	 */
	public static final edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Constraint CONSTRAINT = new edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Constraint();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ConstraintRecord> getRecordType() {
		return edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ConstraintRecord.class;
	}

	/**
	 * The column <code>crowdcontrol.Constraint.idConstraint</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ConstraintRecord, java.lang.Integer> IDCONSTRAINT = createField("idConstraint", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Constraint.constraint</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ConstraintRecord, java.lang.String> CONSTRAINT_ = createField("constraint", org.jooq.impl.SQLDataType.VARCHAR.length(45).nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Constraint.experiment</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ConstraintRecord, java.lang.Integer> EXPERIMENT = createField("experiment", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>crowdcontrol.Constraint</code> table reference
	 */
	public Constraint() {
		this("Constraint", null);
	}

	/**
	 * Create an aliased <code>crowdcontrol.Constraint</code> table reference
	 */
	public Constraint(java.lang.String alias) {
		this(alias, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Constraint.CONSTRAINT);
	}

	private Constraint(java.lang.String alias, org.jooq.Table<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ConstraintRecord> aliased) {
		this(alias, aliased, null);
	}

	private Constraint(java.lang.String alias, org.jooq.Table<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ConstraintRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, edu.ipd.kit.crowdcontrol.workerservice.database.model.Crowdcontrol.CROWDCONTROL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ConstraintRecord> getPrimaryKey() {
		return edu.ipd.kit.crowdcontrol.workerservice.database.model.Keys.KEY_CONSTRAINT_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ConstraintRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ConstraintRecord>>asList(edu.ipd.kit.crowdcontrol.workerservice.database.model.Keys.KEY_CONSTRAINT_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ConstraintRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ConstraintRecord, ?>>asList(edu.ipd.kit.crowdcontrol.workerservice.database.model.Keys.CONSTRAINEDEXPERIMENT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Constraint as(java.lang.String alias) {
		return new edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Constraint(alias, this);
	}

	/**
	 * Rename this table
	 */
	public edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Constraint rename(java.lang.String name) {
		return new edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Constraint(name, null);
	}
}
