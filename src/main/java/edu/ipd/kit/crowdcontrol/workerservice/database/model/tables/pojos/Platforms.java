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
public class Platforms implements java.io.Serializable {

	private static final long serialVersionUID = 1919867047;

	private java.lang.Integer idplatforms;
	private java.lang.String  name;
	private java.lang.Boolean nativeQualifications;
	private java.lang.Boolean nativePayment;
	private java.lang.Boolean needsEmail;

	public Platforms() {}

	public Platforms(
		java.lang.Integer idplatforms,
		java.lang.String  name,
		java.lang.Boolean nativeQualifications,
		java.lang.Boolean nativePayment,
		java.lang.Boolean needsEmail
	) {
		this.idplatforms = idplatforms;
		this.name = name;
		this.nativeQualifications = nativeQualifications;
		this.nativePayment = nativePayment;
		this.needsEmail = needsEmail;
	}

	public java.lang.Integer getIdplatforms() {
		return this.idplatforms;
	}

	public void setIdplatforms(java.lang.Integer idplatforms) {
		this.idplatforms = idplatforms;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.Boolean getNativeQualifications() {
		return this.nativeQualifications;
	}

	public void setNativeQualifications(java.lang.Boolean nativeQualifications) {
		this.nativeQualifications = nativeQualifications;
	}

	public java.lang.Boolean getNativePayment() {
		return this.nativePayment;
	}

	public void setNativePayment(java.lang.Boolean nativePayment) {
		this.nativePayment = nativePayment;
	}

	public java.lang.Boolean getNeedsEmail() {
		return this.needsEmail;
	}

	public void setNeedsEmail(java.lang.Boolean needsEmail) {
		this.needsEmail = needsEmail;
	}
}
