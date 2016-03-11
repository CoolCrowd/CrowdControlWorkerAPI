/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.workerservice.database.model.tables;


import edu.kit.ipd.crowdcontrol.workerservice.database.model.Crowdcontrol;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.Keys;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.RatingConstraintRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class RatingConstraint extends TableImpl<RatingConstraintRecord> {

	private static final long serialVersionUID = 112247837;

	/**
	 * The reference instance of <code>crowdcontrol.Rating_Constraint</code>
	 */
	public static final RatingConstraint RATING_CONSTRAINT = new RatingConstraint();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<RatingConstraintRecord> getRecordType() {
		return RatingConstraintRecord.class;
	}

	/**
	 * The column <code>crowdcontrol.Rating_Constraint.id_rating_Constraints</code>.
	 */
	public final TableField<RatingConstraintRecord, Integer> ID_RATING_CONSTRAINTS = createField("id_rating_Constraints", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Rating_Constraint.ref_rating</code>.
	 */
	public final TableField<RatingConstraintRecord, Integer> REF_RATING = createField("ref_rating", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Rating_Constraint.off_constraint</code>.
	 */
	public final TableField<RatingConstraintRecord, Integer> OFF_CONSTRAINT = createField("off_constraint", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>crowdcontrol.Rating_Constraint</code> table reference
	 */
	public RatingConstraint() {
		this("Rating_Constraint", null);
	}

	/**
	 * Create an aliased <code>crowdcontrol.Rating_Constraint</code> table reference
	 */
	public RatingConstraint(String alias) {
		this(alias, RATING_CONSTRAINT);
	}

	private RatingConstraint(String alias, Table<RatingConstraintRecord> aliased) {
		this(alias, aliased, null);
	}

	private RatingConstraint(String alias, Table<RatingConstraintRecord> aliased, Field<?>[] parameters) {
		super(alias, Crowdcontrol.CROWDCONTROL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<RatingConstraintRecord, Integer> getIdentity() {
		return Keys.IDENTITY_RATING_CONSTRAINT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<RatingConstraintRecord> getPrimaryKey() {
		return Keys.KEY_RATING_CONSTRAINT_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<RatingConstraintRecord>> getKeys() {
		return Arrays.<UniqueKey<RatingConstraintRecord>>asList(Keys.KEY_RATING_CONSTRAINT_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<RatingConstraintRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<RatingConstraintRecord, ?>>asList(Keys.REFERENCED_RATING, Keys.ROFFENDED_CONSTRAINT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RatingConstraint as(String alias) {
		return new RatingConstraint(alias, this);
	}

	/**
	 * Rename this table
	 */
	public RatingConstraint rename(String name) {
		return new RatingConstraint(name, null);
	}
}