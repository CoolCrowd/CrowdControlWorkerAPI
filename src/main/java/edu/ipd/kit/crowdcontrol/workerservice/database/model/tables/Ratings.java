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
public class Ratings extends org.jooq.impl.TableImpl<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.RatingsRecord> {

	private static final long serialVersionUID = 1780453655;

	/**
	 * The singleton instance of <code>crowdcontrol.Ratings</code>
	 */
	public static final edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Ratings RATINGS = new edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Ratings();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.RatingsRecord> getRecordType() {
		return edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.RatingsRecord.class;
	}

	/**
	 * The column <code>crowdcontrol.Ratings.idRatings</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.RatingsRecord, java.lang.Integer> IDRATINGS = createField("idRatings", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Ratings.task</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.RatingsRecord, java.lang.Integer> TASK = createField("task", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Ratings.answer_r</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.RatingsRecord, java.lang.Integer> ANSWER_R = createField("answer_r", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Ratings.timestamp</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.RatingsRecord, java.sql.Timestamp> TIMESTAMP = createField("timestamp", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>crowdcontrol.Ratings.rating</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.RatingsRecord, java.lang.Integer> RATING = createField("rating", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>crowdcontrol.Ratings.worker_id</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.RatingsRecord, java.lang.Integer> WORKER_ID = createField("worker_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Ratings.quality</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.RatingsRecord, java.lang.Integer> QUALITY = createField("quality", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>crowdcontrol.Ratings</code> table reference
	 */
	public Ratings() {
		this("Ratings", null);
	}

	/**
	 * Create an aliased <code>crowdcontrol.Ratings</code> table reference
	 */
	public Ratings(java.lang.String alias) {
		this(alias, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Ratings.RATINGS);
	}

	private Ratings(java.lang.String alias, org.jooq.Table<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.RatingsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Ratings(java.lang.String alias, org.jooq.Table<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.RatingsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, edu.ipd.kit.crowdcontrol.workerservice.database.model.Crowdcontrol.CROWDCONTROL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.RatingsRecord> getPrimaryKey() {
		return edu.ipd.kit.crowdcontrol.workerservice.database.model.Keys.KEY_RATINGS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.RatingsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.RatingsRecord>>asList(edu.ipd.kit.crowdcontrol.workerservice.database.model.Keys.KEY_RATINGS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.RatingsRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.RatingsRecord, ?>>asList(edu.ipd.kit.crowdcontrol.workerservice.database.model.Keys.IDHITRATING, edu.ipd.kit.crowdcontrol.workerservice.database.model.Keys.IDANSWERSRATINS, edu.ipd.kit.crowdcontrol.workerservice.database.model.Keys.WORKERRATED);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Ratings as(java.lang.String alias) {
		return new edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Ratings(alias, this);
	}

	/**
	 * Rename this table
	 */
	public edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Ratings rename(java.lang.String name) {
		return new edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Ratings(name, null);
	}
}
