/**
 * This class is generated by jOOQ
 */
package edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Template implements java.io.Serializable {

	private static final long serialVersionUID = 354325215;

	private java.lang.Integer idtemplate;
	private java.lang.String  template;
	private java.lang.String  titel;
	private java.lang.String  answerType;

	public Template() {}

	public Template(
		java.lang.Integer idtemplate,
		java.lang.String  template,
		java.lang.String  titel,
		java.lang.String  answerType
	) {
		this.idtemplate = idtemplate;
		this.template = template;
		this.titel = titel;
		this.answerType = answerType;
	}

	public java.lang.Integer getIdtemplate() {
		return this.idtemplate;
	}

	public void setIdtemplate(java.lang.Integer idtemplate) {
		this.idtemplate = idtemplate;
	}

	public java.lang.String getTemplate() {
		return this.template;
	}

	public void setTemplate(java.lang.String template) {
		this.template = template;
	}

	public java.lang.String getTitel() {
		return this.titel;
	}

	public void setTitel(java.lang.String titel) {
		this.titel = titel;
	}

	public java.lang.String getAnswerType() {
		return this.answerType;
	}

	public void setAnswerType(java.lang.String answerType) {
		this.answerType = answerType;
	}
}
