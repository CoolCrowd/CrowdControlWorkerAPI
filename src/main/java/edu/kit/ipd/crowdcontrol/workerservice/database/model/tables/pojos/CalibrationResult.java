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
public class CalibrationResult implements java.io.Serializable {

	private static final long serialVersionUID = 324784434;

	private java.lang.Integer idCalibrationResult;
	private java.lang.Integer worker;
	private java.lang.Integer answer;

	public CalibrationResult() {}

	public CalibrationResult(
		java.lang.Integer idCalibrationResult,
		java.lang.Integer worker,
		java.lang.Integer answer
	) {
		this.idCalibrationResult = idCalibrationResult;
		this.worker = worker;
		this.answer = answer;
	}

	public java.lang.Integer getIdCalibrationResult() {
		return this.idCalibrationResult;
	}

	public void setIdCalibrationResult(java.lang.Integer idCalibrationResult) {
		this.idCalibrationResult = idCalibrationResult;
	}

	public java.lang.Integer getWorker() {
		return this.worker;
	}

	public void setWorker(java.lang.Integer worker) {
		this.worker = worker;
	}

	public java.lang.Integer getAnswer() {
		return this.answer;
	}

	public void setAnswer(java.lang.Integer answer) {
		this.answer = answer;
	}
}