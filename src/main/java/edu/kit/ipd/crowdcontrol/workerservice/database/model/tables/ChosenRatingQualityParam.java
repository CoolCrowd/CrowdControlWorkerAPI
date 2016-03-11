/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.workerservice.database.model.tables;


import edu.kit.ipd.crowdcontrol.workerservice.database.model.Crowdcontrol;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.Keys;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.ChosenRatingQualityParamRecord;

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
public class ChosenRatingQualityParam extends TableImpl<ChosenRatingQualityParamRecord> {

	private static final long serialVersionUID = -539392218;

	/**
	 * The reference instance of <code>crowdcontrol.Chosen_Rating_Quality_Param</code>
	 */
	public static final ChosenRatingQualityParam CHOSEN_RATING_QUALITY_PARAM = new ChosenRatingQualityParam();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ChosenRatingQualityParamRecord> getRecordType() {
		return ChosenRatingQualityParamRecord.class;
	}

	/**
	 * The column <code>crowdcontrol.Chosen_Rating_Quality_Param.id_Algorithm_Rating_Quality_Chosen</code>.
	 */
	public final TableField<ChosenRatingQualityParamRecord, Integer> ID_ALGORITHM_RATING_QUALITY_CHOSEN = createField("id_Algorithm_Rating_Quality_Chosen", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Chosen_Rating_Quality_Param.value</code>.
	 */
	public final TableField<ChosenRatingQualityParamRecord, String> VALUE = createField("value", org.jooq.impl.SQLDataType.VARCHAR.length(191).nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Chosen_Rating_Quality_Param.experiment</code>.
	 */
	public final TableField<ChosenRatingQualityParamRecord, Integer> EXPERIMENT = createField("experiment", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Chosen_Rating_Quality_Param.param</code>.
	 */
	public final TableField<ChosenRatingQualityParamRecord, Integer> PARAM = createField("param", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>crowdcontrol.Chosen_Rating_Quality_Param</code> table reference
	 */
	public ChosenRatingQualityParam() {
		this("Chosen_Rating_Quality_Param", null);
	}

	/**
	 * Create an aliased <code>crowdcontrol.Chosen_Rating_Quality_Param</code> table reference
	 */
	public ChosenRatingQualityParam(String alias) {
		this(alias, CHOSEN_RATING_QUALITY_PARAM);
	}

	private ChosenRatingQualityParam(String alias, Table<ChosenRatingQualityParamRecord> aliased) {
		this(alias, aliased, null);
	}

	private ChosenRatingQualityParam(String alias, Table<ChosenRatingQualityParamRecord> aliased, Field<?>[] parameters) {
		super(alias, Crowdcontrol.CROWDCONTROL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<ChosenRatingQualityParamRecord, Integer> getIdentity() {
		return Keys.IDENTITY_CHOSEN_RATING_QUALITY_PARAM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ChosenRatingQualityParamRecord> getPrimaryKey() {
		return Keys.KEY_CHOSEN_RATING_QUALITY_PARAM_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ChosenRatingQualityParamRecord>> getKeys() {
		return Arrays.<UniqueKey<ChosenRatingQualityParamRecord>>asList(Keys.KEY_CHOSEN_RATING_QUALITY_PARAM_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<ChosenRatingQualityParamRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<ChosenRatingQualityParamRecord, ?>>asList(Keys.CHOSENRATINGQUALITYPARAMREFEXPERIMENT, Keys.CHOSENRATINGQUALITYPARAM);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ChosenRatingQualityParam as(String alias) {
		return new ChosenRatingQualityParam(alias, this);
	}

	/**
	 * Rename this table
	 */
	public ChosenRatingQualityParam rename(String name) {
		return new ChosenRatingQualityParam(name, null);
	}
}