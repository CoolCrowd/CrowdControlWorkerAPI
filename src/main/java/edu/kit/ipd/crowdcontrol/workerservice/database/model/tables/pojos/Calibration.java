/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Calibration implements java.io.Serializable {

	private static final long serialVersionUID = 1404189813;

	private java.lang.Integer idCalibration;
	private java.lang.String  property;
	private java.lang.String  name;
	private java.lang.Integer experiment;

	public Calibration() {}

	public Calibration(
		java.lang.Integer idCalibration,
		java.lang.String  property,
		java.lang.String  name,
		java.lang.Integer experiment
	) {
		this.idCalibration = idCalibration;
		this.property = property;
		this.name = name;
		this.experiment = experiment;
	}

	public java.lang.Integer getIdCalibration() {
		return this.idCalibration;
	}

	public void setIdCalibration(java.lang.Integer idCalibration) {
		this.idCalibration = idCalibration;
	}

	public java.lang.String getProperty() {
		return this.property;
	}

	public void setProperty(java.lang.String property) {
		this.property = property;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.Integer getExperiment() {
		return this.experiment;
	}

	public void setExperiment(java.lang.Integer experiment) {
		this.experiment = experiment;
	}
}