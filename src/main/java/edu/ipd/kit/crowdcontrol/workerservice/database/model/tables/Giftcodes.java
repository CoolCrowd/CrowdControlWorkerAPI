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
public class Giftcodes extends org.jooq.impl.TableImpl<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.GiftcodesRecord> {

	private static final long serialVersionUID = -228105558;

	/**
	 * The singleton instance of <code>crowdcontrol.GiftCodes</code>
	 */
	public static final edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Giftcodes GIFTCODES = new edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Giftcodes();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.GiftcodesRecord> getRecordType() {
		return edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.GiftcodesRecord.class;
	}

	/**
	 * The column <code>crowdcontrol.GiftCodes.idGiftCodes</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.GiftcodesRecord, java.lang.Integer> IDGIFTCODES = createField("idGiftCodes", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.GiftCodes.code</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.GiftcodesRecord, java.lang.String> CODE = createField("code", org.jooq.impl.SQLDataType.CLOB.length(16777215).nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.GiftCodes.amount</code>.
	 */
	public final org.jooq.TableField<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.GiftcodesRecord, java.lang.Integer> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>crowdcontrol.GiftCodes</code> table reference
	 */
	public Giftcodes() {
		this("GiftCodes", null);
	}

	/**
	 * Create an aliased <code>crowdcontrol.GiftCodes</code> table reference
	 */
	public Giftcodes(java.lang.String alias) {
		this(alias, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Giftcodes.GIFTCODES);
	}

	private Giftcodes(java.lang.String alias, org.jooq.Table<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.GiftcodesRecord> aliased) {
		this(alias, aliased, null);
	}

	private Giftcodes(java.lang.String alias, org.jooq.Table<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.GiftcodesRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, edu.ipd.kit.crowdcontrol.workerservice.database.model.Crowdcontrol.CROWDCONTROL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.GiftcodesRecord> getPrimaryKey() {
		return edu.ipd.kit.crowdcontrol.workerservice.database.model.Keys.KEY_GIFTCODES_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.GiftcodesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.GiftcodesRecord>>asList(edu.ipd.kit.crowdcontrol.workerservice.database.model.Keys.KEY_GIFTCODES_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Giftcodes as(java.lang.String alias) {
		return new edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Giftcodes(alias, this);
	}

	/**
	 * Rename this table
	 */
	public edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Giftcodes rename(java.lang.String name) {
		return new edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Giftcodes(name, null);
	}
}
