/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.daos;

import edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.pojos.Tag;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.TagRecord;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TagDao extends org.jooq.impl.DAOImpl<TagRecord, Tag, java.lang.Integer> {

	/**
	 * Create a new TagDao without any configuration
	 */
	public TagDao() {
		super(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Tag.TAG, Tag.class);
	}

	/**
	 * Create a new TagDao with an attached configuration
	 */
	public TagDao(org.jooq.Configuration configuration) {
		super(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Tag.TAG, Tag.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(Tag object) {
		return object.getIdtag();
	}

	/**
	 * Fetch records that have <code>idTag IN (values)</code>
	 */
	public java.util.List<Tag> fetchByIdtag(java.lang.Integer... values) {
		return fetch(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Tag.TAG.IDTAG, values);
	}

	/**
	 * Fetch a unique record that has <code>idTag = value</code>
	 */
	public Tag fetchOneByIdtag(java.lang.Integer value) {
		return fetchOne(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Tag.TAG.IDTAG, value);
	}

	/**
	 * Fetch records that have <code>tag IN (values)</code>
	 */
	public java.util.List<Tag> fetchByTag(java.lang.String... values) {
		return fetch(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Tag.TAG.TAG_, values);
	}

	/**
	 * Fetch records that have <code>experiment IN (values)</code>
	 */
	public java.util.List<Tag> fetchByExperiment(java.lang.Integer... values) {
		return fetch(edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.Tag.TAG.EXPERIMENT, values);
	}
}
