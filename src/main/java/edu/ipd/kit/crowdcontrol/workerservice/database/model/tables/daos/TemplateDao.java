/**
 * This class is generated by jOOQ
 */
package edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TemplateDao extends org.jooq.impl.DAOImpl<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.TemplateRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Template, java.lang.Integer> {

	/**
	 * Create a new TemplateDao without any configuration
	 */
	public TemplateDao() {
		super(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Template.TEMPLATE, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Template.class);
	}

	/**
	 * Create a new TemplateDao with an attached configuration
	 */
	public TemplateDao(org.jooq.Configuration configuration) {
		super(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Template.TEMPLATE, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Template.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Template object) {
		return object.getIdtemplate();
	}

	/**
	 * Fetch records that have <code>idTemplate IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Template> fetchByIdtemplate(java.lang.Integer... values) {
		return fetch(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Template.TEMPLATE.IDTEMPLATE, values);
	}

	/**
	 * Fetch a unique record that has <code>idTemplate = value</code>
	 */
	public edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Template fetchOneByIdtemplate(java.lang.Integer value) {
		return fetchOne(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Template.TEMPLATE.IDTEMPLATE, value);
	}

	/**
	 * Fetch records that have <code>template IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Template> fetchByTemplate(java.lang.String... values) {
		return fetch(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Template.TEMPLATE.TEMPLATE_, values);
	}

	/**
	 * Fetch records that have <code>titel IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Template> fetchByTitel(java.lang.String... values) {
		return fetch(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Template.TEMPLATE.TITEL, values);
	}

	/**
	 * Fetch records that have <code>answer_type IN (values)</code>
	 */
	public java.util.List<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos.Template> fetchByAnswerType(java.lang.String... values) {
		return fetch(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Template.TEMPLATE.ANSWER_TYPE, values);
	}
}
