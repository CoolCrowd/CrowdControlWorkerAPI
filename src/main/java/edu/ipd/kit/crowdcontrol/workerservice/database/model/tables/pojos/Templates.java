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
public class Templates implements java.io.Serializable {

	private static final long serialVersionUID = -1274722412;

	private java.lang.Integer idtemplates;
	private java.lang.String  template;
	private java.lang.String  titel;

	public Templates() {}

	public Templates(
		java.lang.Integer idtemplates,
		java.lang.String  template,
		java.lang.String  titel
	) {
		this.idtemplates = idtemplates;
		this.template = template;
		this.titel = titel;
	}

	public java.lang.Integer getIdtemplates() {
		return this.idtemplates;
	}

	public void setIdtemplates(java.lang.Integer idtemplates) {
		this.idtemplates = idtemplates;
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
}
