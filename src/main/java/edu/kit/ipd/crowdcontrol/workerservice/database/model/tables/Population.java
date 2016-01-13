/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.workerservice.database.model.tables;

import edu.kit.ipd.crowdcontrol.workerservice.database.model.Crowdcontrol;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.Keys;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.PopulationRecord;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Population extends org.jooq.impl.TableImpl<PopulationRecord> {

	private static final long serialVersionUID = 272901793;

	/**
	 * The singleton instance of <code>crowdcontrol.Population</code>
	 */
	public static final Population POPULATION = new Population();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<PopulationRecord> getRecordType() {
		return PopulationRecord.class;
	}

	/**
	 * The column <code>crowdcontrol.Population.idPopulation</code>.
	 */
	public final org.jooq.TableField<PopulationRecord, java.lang.Integer> IDPOPULATION = createField("idPopulation", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Population.property</code>.
	 */
	public final org.jooq.TableField<PopulationRecord, java.lang.String> PROPERTY = createField("property", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Population.description</code>.
	 */
	public final org.jooq.TableField<PopulationRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>crowdcontrol.Population.name</code>.
	 */
	public final org.jooq.TableField<PopulationRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>crowdcontrol.Population.experiment</code>.
	 */
	public final org.jooq.TableField<PopulationRecord, java.lang.Integer> EXPERIMENT = createField("experiment", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>crowdcontrol.Population</code> table reference
	 */
	public Population() {
		this("Population", null);
	}

	/**
	 * Create an aliased <code>crowdcontrol.Population</code> table reference
	 */
	public Population(java.lang.String alias) {
		this(alias, Population.POPULATION);
	}

	private Population(java.lang.String alias, org.jooq.Table<PopulationRecord> aliased) {
		this(alias, aliased, null);
	}

	private Population(java.lang.String alias, org.jooq.Table<PopulationRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, Crowdcontrol.CROWDCONTROL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<PopulationRecord> getPrimaryKey() {
		return Keys.KEY_POPULATION_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<PopulationRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<PopulationRecord>>asList(Keys.KEY_POPULATION_PRIMARY, Keys.KEY_POPULATION_EXPERIMENT_UNIQUE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<PopulationRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<PopulationRecord, ?>>asList(Keys.PARTICIPATEDIN);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Population as(java.lang.String alias) {
		return new Population(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Population rename(java.lang.String name) {
		return new Population(name, null);
	}
}
