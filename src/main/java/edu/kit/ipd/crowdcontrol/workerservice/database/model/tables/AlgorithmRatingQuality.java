/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.workerservice.database.model.tables;


import edu.kit.ipd.crowdcontrol.workerservice.database.model.Crowdcontrol;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.Keys;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.AlgorithmRatingQualityRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
public class AlgorithmRatingQuality extends TableImpl<AlgorithmRatingQualityRecord> {

	private static final long serialVersionUID = 735377532;

	/**
	 * The reference instance of <code>crowdcontrol.Algorithm_Rating_Quality</code>
	 */
	public static final AlgorithmRatingQuality ALGORITHM_RATING_QUALITY = new AlgorithmRatingQuality();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<AlgorithmRatingQualityRecord> getRecordType() {
		return AlgorithmRatingQualityRecord.class;
	}

	/**
	 * The column <code>crowdcontrol.Algorithm_Rating_Quality.id_Algorithm_Rating_Quality</code>.
	 */
	public final TableField<AlgorithmRatingQualityRecord, String> ID_ALGORITHM_RATING_QUALITY = createField("id_Algorithm_Rating_Quality", org.jooq.impl.SQLDataType.VARCHAR.length(191).nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Algorithm_Rating_Quality.description</code>.
	 */
	public final TableField<AlgorithmRatingQualityRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

	/**
	 * Create a <code>crowdcontrol.Algorithm_Rating_Quality</code> table reference
	 */
	public AlgorithmRatingQuality() {
		this("Algorithm_Rating_Quality", null);
	}

	/**
	 * Create an aliased <code>crowdcontrol.Algorithm_Rating_Quality</code> table reference
	 */
	public AlgorithmRatingQuality(String alias) {
		this(alias, ALGORITHM_RATING_QUALITY);
	}

	private AlgorithmRatingQuality(String alias, Table<AlgorithmRatingQualityRecord> aliased) {
		this(alias, aliased, null);
	}

	private AlgorithmRatingQuality(String alias, Table<AlgorithmRatingQualityRecord> aliased, Field<?>[] parameters) {
		super(alias, Crowdcontrol.CROWDCONTROL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<AlgorithmRatingQualityRecord> getPrimaryKey() {
		return Keys.KEY_ALGORITHM_RATING_QUALITY_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<AlgorithmRatingQualityRecord>> getKeys() {
		return Arrays.<UniqueKey<AlgorithmRatingQualityRecord>>asList(Keys.KEY_ALGORITHM_RATING_QUALITY_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AlgorithmRatingQuality as(String alias) {
		return new AlgorithmRatingQuality(alias, this);
	}

	/**
	 * Rename this table
	 */
	public AlgorithmRatingQuality rename(String name) {
		return new AlgorithmRatingQuality(name, null);
	}
}