/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.workerservice.database.model.tables;

import edu.kit.ipd.crowdcontrol.workerservice.database.model.Crowdcontrol;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.Keys;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.TagRecord;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tag extends org.jooq.impl.TableImpl<TagRecord> {

	private static final long serialVersionUID = 417987238;

	/**
	 * The singleton instance of <code>crowdcontrol.Tag</code>
	 */
	public static final Tag TAG = new Tag();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<TagRecord> getRecordType() {
		return TagRecord.class;
	}

	/**
	 * The column <code>crowdcontrol.Tag.idTag</code>.
	 */
	public final org.jooq.TableField<TagRecord, java.lang.Integer> IDTAG = createField("idTag", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Tag.tag</code>.
	 */
	public final org.jooq.TableField<TagRecord, java.lang.String> TAG_ = createField("tag", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Tag.experiment</code>.
	 */
	public final org.jooq.TableField<TagRecord, java.lang.Integer> EXPERIMENT = createField("experiment", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>crowdcontrol.Tag</code> table reference
	 */
	public Tag() {
		this("Tag", null);
	}

	/**
	 * Create an aliased <code>crowdcontrol.Tag</code> table reference
	 */
	public Tag(java.lang.String alias) {
		this(alias, Tag.TAG);
	}

	private Tag(java.lang.String alias, org.jooq.Table<TagRecord> aliased) {
		this(alias, aliased, null);
	}

	private Tag(java.lang.String alias, org.jooq.Table<TagRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, Crowdcontrol.CROWDCONTROL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<TagRecord> getPrimaryKey() {
		return Keys.KEY_TAG_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<TagRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<TagRecord>>asList(Keys.KEY_TAG_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<TagRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<TagRecord, ?>>asList(Keys.IDEXPERIMENTTAGS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Tag as(java.lang.String alias) {
		return new Tag(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Tag rename(java.lang.String name) {
		return new Tag(name, null);
	}
}