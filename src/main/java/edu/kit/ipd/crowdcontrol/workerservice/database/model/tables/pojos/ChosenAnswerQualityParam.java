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
public class ChosenAnswerQualityParam implements java.io.Serializable {

	private static final long serialVersionUID = -1977681577;

	private java.lang.Integer idAlgorithmAnswerQualityParamChosen;
	private java.lang.String  value;
	private java.lang.Integer experiment;
	private java.lang.Integer param;

	public ChosenAnswerQualityParam() {}

	public ChosenAnswerQualityParam(
		java.lang.Integer idAlgorithmAnswerQualityParamChosen,
		java.lang.String  value,
		java.lang.Integer experiment,
		java.lang.Integer param
	) {
		this.idAlgorithmAnswerQualityParamChosen = idAlgorithmAnswerQualityParamChosen;
		this.value = value;
		this.experiment = experiment;
		this.param = param;
	}

	public java.lang.Integer getIdAlgorithmAnswerQualityParamChosen() {
		return this.idAlgorithmAnswerQualityParamChosen;
	}

	public void setIdAlgorithmAnswerQualityParamChosen(java.lang.Integer idAlgorithmAnswerQualityParamChosen) {
		this.idAlgorithmAnswerQualityParamChosen = idAlgorithmAnswerQualityParamChosen;
	}

	public java.lang.String getValue() {
		return this.value;
	}

	public void setValue(java.lang.String value) {
		this.value = value;
	}

	public java.lang.Integer getExperiment() {
		return this.experiment;
	}

	public void setExperiment(java.lang.Integer experiment) {
		this.experiment = experiment;
	}

	public java.lang.Integer getParam() {
		return this.param;
	}

	public void setParam(java.lang.Integer param) {
		this.param = param;
	}
}