/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records;


import com.google.gson.JsonElement;

import edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.ExperimentsPlatform;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


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
public class ExperimentsPlatformRecord extends UpdatableRecordImpl<ExperimentsPlatformRecord> implements Record5<Integer, Integer, String, JsonElement, String> {

	private static final long serialVersionUID = -407962335;

	/**
	 * Setter for <code>crowdcontrol.Experiments_Platform.idExperiments_Platforms</code>.
	 */
	public void setIdexperimentsPlatforms(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Experiments_Platform.idExperiments_Platforms</code>.
	 */
	public Integer getIdexperimentsPlatforms() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>crowdcontrol.Experiments_Platform.experiment</code>.
	 */
	public void setExperiment(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Experiments_Platform.experiment</code>.
	 */
	public Integer getExperiment() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>crowdcontrol.Experiments_Platform.platform</code>.
	 */
	public void setPlatform(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Experiments_Platform.platform</code>.
	 */
	public String getPlatform() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>crowdcontrol.Experiments_Platform.platform_data</code>.
	 */
	public void setPlatformData(JsonElement value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Experiments_Platform.platform_data</code>.
	 */
	public JsonElement getPlatformData() {
		return (JsonElement) getValue(3);
	}

	/**
	 * Setter for <code>crowdcontrol.Experiments_Platform.identification</code>.
	 */
	public void setIdentification(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>crowdcontrol.Experiments_Platform.identification</code>.
	 */
	public String getIdentification() {
		return (String) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Integer, Integer, String, JsonElement, String> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Integer, Integer, String, JsonElement, String> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return ExperimentsPlatform.EXPERIMENTS_PLATFORM.IDEXPERIMENTS_PLATFORMS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return ExperimentsPlatform.EXPERIMENTS_PLATFORM.EXPERIMENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return ExperimentsPlatform.EXPERIMENTS_PLATFORM.PLATFORM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<JsonElement> field4() {
		return ExperimentsPlatform.EXPERIMENTS_PLATFORM.PLATFORM_DATA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return ExperimentsPlatform.EXPERIMENTS_PLATFORM.IDENTIFICATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getIdexperimentsPlatforms();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getExperiment();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getPlatform();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JsonElement value4() {
		return getPlatformData();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getIdentification();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentsPlatformRecord value1(Integer value) {
		setIdexperimentsPlatforms(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentsPlatformRecord value2(Integer value) {
		setExperiment(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentsPlatformRecord value3(String value) {
		setPlatform(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentsPlatformRecord value4(JsonElement value) {
		setPlatformData(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentsPlatformRecord value5(String value) {
		setIdentification(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ExperimentsPlatformRecord values(Integer value1, Integer value2, String value3, JsonElement value4, String value5) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ExperimentsPlatformRecord
	 */
	public ExperimentsPlatformRecord() {
		super(ExperimentsPlatform.EXPERIMENTS_PLATFORM);
	}

	/**
	 * Create a detached, initialised ExperimentsPlatformRecord
	 */
	public ExperimentsPlatformRecord(Integer idexperimentsPlatforms, Integer experiment, String platform, JsonElement platformData, String identification) {
		super(ExperimentsPlatform.EXPERIMENTS_PLATFORM);

		setValue(0, idexperimentsPlatforms);
		setValue(1, experiment);
		setValue(2, platform);
		setValue(3, platformData);
		setValue(4, identification);
	}
}