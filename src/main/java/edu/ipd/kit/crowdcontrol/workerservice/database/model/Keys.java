/**
 * This class is generated by jOOQ
 */
package edu.ipd.kit.crowdcontrol.workerservice.database.model;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the <code>crowdcontrol</code> 
 * schema
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.AnswerRecord> KEY_ANSWER_PRIMARY = UniqueKeys0.KEY_ANSWER_PRIMARY;
	public static final org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ConstraintRecord> KEY_CONSTRAINT_PRIMARY = UniqueKeys0.KEY_CONSTRAINT_PRIMARY;
	public static final org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ExperimentRecord> KEY_EXPERIMENT_PRIMARY = UniqueKeys0.KEY_EXPERIMENT_PRIMARY;
	public static final org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ExperimentspopulationRecord> KEY_EXPERIMENTSPOPULATION_PRIMARY = UniqueKeys0.KEY_EXPERIMENTSPOPULATION_PRIMARY;
	public static final org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.GiftcodeRecord> KEY_GIFTCODE_PRIMARY = UniqueKeys0.KEY_GIFTCODE_PRIMARY;
	public static final org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PaymentRecord> KEY_PAYMENT_PRIMARY = UniqueKeys0.KEY_PAYMENT_PRIMARY;
	public static final org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PlatformRecord> KEY_PLATFORM_PRIMARY = UniqueKeys0.KEY_PLATFORM_PRIMARY;
	public static final org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PlatformRecord> KEY_PLATFORM_IDPLATFORM_UNIQUE = UniqueKeys0.KEY_PLATFORM_IDPLATFORM_UNIQUE;
	public static final org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PopulationRecord> KEY_POPULATION_PRIMARY = UniqueKeys0.KEY_POPULATION_PRIMARY;
	public static final org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PopulationansweroptionRecord> KEY_POPULATIONANSWEROPTION_PRIMARY = UniqueKeys0.KEY_POPULATIONANSWEROPTION_PRIMARY;
	public static final org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PopulationresultRecord> KEY_POPULATIONRESULT_PRIMARY = UniqueKeys0.KEY_POPULATIONRESULT_PRIMARY;
	public static final org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.RatingRecord> KEY_RATING_PRIMARY = UniqueKeys0.KEY_RATING_PRIMARY;
	public static final org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.TagRecord> KEY_TAG_PRIMARY = UniqueKeys0.KEY_TAG_PRIMARY;
	public static final org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.TaskRecord> KEY_TASK_PRIMARY = UniqueKeys0.KEY_TASK_PRIMARY;
	public static final org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.TemplateRecord> KEY_TEMPLATE_PRIMARY = UniqueKeys0.KEY_TEMPLATE_PRIMARY;
	public static final org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.WorkerRecord> KEY_WORKER_PRIMARY = UniqueKeys0.KEY_WORKER_PRIMARY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.AnswerRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.TaskRecord> IDHITANSWERS = ForeignKeys0.IDHITANSWERS;
	public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.AnswerRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.WorkerRecord> WORKERANSWERED = ForeignKeys0.WORKERANSWERED;
	public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ConstraintRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ExperimentRecord> CONSTRAINEDEXPERIMENT = ForeignKeys0.CONSTRAINEDEXPERIMENT;
	public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ExperimentRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.TemplateRecord> USEDTEMPLATE = ForeignKeys0.USEDTEMPLATE;
	public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ExperimentspopulationRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ExperimentRecord> POPULATIONUSER = ForeignKeys0.POPULATIONUSER;
	public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ExperimentspopulationRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PopulationRecord> REFERENCEDPOPULATION = ForeignKeys0.REFERENCEDPOPULATION;
	public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ExperimentspopulationRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PlatformRecord> REFERENCEDPLATFORM = ForeignKeys0.REFERENCEDPLATFORM;
	public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PaymentRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.WorkerRecord> PAYEDWORKER = ForeignKeys0.PAYEDWORKER;
	public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PaymentRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ExperimentRecord> PAYEDEXPERIMENT = ForeignKeys0.PAYEDEXPERIMENT;
	public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PaymentRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.GiftcodeRecord> USEDGIFTCODE = ForeignKeys0.USEDGIFTCODE;
	public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PopulationansweroptionRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PopulationRecord> POPULATIONANSWER = ForeignKeys0.POPULATIONANSWER;
	public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PopulationresultRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.WorkerRecord> REFERENCEDWORKER = ForeignKeys0.REFERENCEDWORKER;
	public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PopulationresultRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PopulationansweroptionRecord> REFERENCEDANSWER = ForeignKeys0.REFERENCEDANSWER;
	public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.RatingRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.TaskRecord> IDHITRATING = ForeignKeys0.IDHITRATING;
	public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.RatingRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.AnswerRecord> IDANSWERSRATINS = ForeignKeys0.IDANSWERSRATINS;
	public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.RatingRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.WorkerRecord> WORKERRATED = ForeignKeys0.WORKERRATED;
	public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.TagRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ExperimentRecord> IDEXPERIMENTTAGS = ForeignKeys0.IDEXPERIMENTTAGS;
	public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.TaskRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ExperimentRecord> IDEXPERIMENTHIT = ForeignKeys0.IDEXPERIMENTHIT;
	public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.TaskRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PlatformRecord> RUNNINGONPLATTFORM = ForeignKeys0.RUNNINGONPLATTFORM;
	public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.WorkerRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PlatformRecord> WORKERORIGIN = ForeignKeys0.WORKERORIGIN;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.AnswerRecord> KEY_ANSWER_PRIMARY = createUniqueKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Answer.ANSWER, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Answer.ANSWER.IDANSWER);
		public static final org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ConstraintRecord> KEY_CONSTRAINT_PRIMARY = createUniqueKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Constraint.CONSTRAINT, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Constraint.CONSTRAINT.IDCONSTRAINT);
		public static final org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ExperimentRecord> KEY_EXPERIMENT_PRIMARY = createUniqueKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Experiment.EXPERIMENT, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Experiment.EXPERIMENT.IDEXPERIMENT);
		public static final org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ExperimentspopulationRecord> KEY_EXPERIMENTSPOPULATION_PRIMARY = createUniqueKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Experimentspopulation.EXPERIMENTSPOPULATION, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Experimentspopulation.EXPERIMENTSPOPULATION.IDEXPERIMENTSPOPULATION);
		public static final org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.GiftcodeRecord> KEY_GIFTCODE_PRIMARY = createUniqueKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Giftcode.GIFTCODE, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Giftcode.GIFTCODE.IDGIFTCODE);
		public static final org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PaymentRecord> KEY_PAYMENT_PRIMARY = createUniqueKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Payment.PAYMENT, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Payment.PAYMENT.IDPAYMENT);
		public static final org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PlatformRecord> KEY_PLATFORM_PRIMARY = createUniqueKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Platform.PLATFORM, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Platform.PLATFORM.IDPLATFORM);
		public static final org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PlatformRecord> KEY_PLATFORM_IDPLATFORM_UNIQUE = createUniqueKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Platform.PLATFORM, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Platform.PLATFORM.IDPLATFORM);
		public static final org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PopulationRecord> KEY_POPULATION_PRIMARY = createUniqueKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Population.POPULATION, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Population.POPULATION.IDPOPULATION);
		public static final org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PopulationansweroptionRecord> KEY_POPULATIONANSWEROPTION_PRIMARY = createUniqueKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Populationansweroption.POPULATIONANSWEROPTION, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Populationansweroption.POPULATIONANSWEROPTION.IDPOPULATIONANSWEROPTION);
		public static final org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PopulationresultRecord> KEY_POPULATIONRESULT_PRIMARY = createUniqueKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Populationresult.POPULATIONRESULT, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Populationresult.POPULATIONRESULT.IDPOPULATIONRESULT);
		public static final org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.RatingRecord> KEY_RATING_PRIMARY = createUniqueKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Rating.RATING, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Rating.RATING.IDRATING);
		public static final org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.TagRecord> KEY_TAG_PRIMARY = createUniqueKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Tag.TAG, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Tag.TAG.IDTAG);
		public static final org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.TaskRecord> KEY_TASK_PRIMARY = createUniqueKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Task.TASK, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Task.TASK.IDTASK);
		public static final org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.TemplateRecord> KEY_TEMPLATE_PRIMARY = createUniqueKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Template.TEMPLATE, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Template.TEMPLATE.IDTEMPLATE);
		public static final org.jooq.UniqueKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.WorkerRecord> KEY_WORKER_PRIMARY = createUniqueKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Worker.WORKER, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Worker.WORKER.IDWORKER);
	}

	private static class ForeignKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.AnswerRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.TaskRecord> IDHITANSWERS = createForeignKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.Keys.KEY_TASK_PRIMARY, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Answer.ANSWER, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Answer.ANSWER.TASK);
		public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.AnswerRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.WorkerRecord> WORKERANSWERED = createForeignKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.Keys.KEY_WORKER_PRIMARY, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Answer.ANSWER, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Answer.ANSWER.WORKER_ID);
		public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ConstraintRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ExperimentRecord> CONSTRAINEDEXPERIMENT = createForeignKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.Keys.KEY_EXPERIMENT_PRIMARY, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Constraint.CONSTRAINT, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Constraint.CONSTRAINT.EXPERIMENT);
		public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ExperimentRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.TemplateRecord> USEDTEMPLATE = createForeignKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.Keys.KEY_TEMPLATE_PRIMARY, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Experiment.EXPERIMENT, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Experiment.EXPERIMENT.TEMPLATE);
		public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ExperimentspopulationRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ExperimentRecord> POPULATIONUSER = createForeignKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.Keys.KEY_EXPERIMENT_PRIMARY, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Experimentspopulation.EXPERIMENTSPOPULATION, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Experimentspopulation.EXPERIMENTSPOPULATION.POPULATION_USER);
		public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ExperimentspopulationRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PopulationRecord> REFERENCEDPOPULATION = createForeignKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.Keys.KEY_POPULATION_PRIMARY, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Experimentspopulation.EXPERIMENTSPOPULATION, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Experimentspopulation.EXPERIMENTSPOPULATION.REFERENCED_POPULATION);
		public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ExperimentspopulationRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PlatformRecord> REFERENCEDPLATFORM = createForeignKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.Keys.KEY_PLATFORM_PRIMARY, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Experimentspopulation.EXPERIMENTSPOPULATION, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Experimentspopulation.EXPERIMENTSPOPULATION.REFERENCED_PLATFORM);
		public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PaymentRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.WorkerRecord> PAYEDWORKER = createForeignKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.Keys.KEY_WORKER_PRIMARY, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Payment.PAYMENT, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Payment.PAYMENT.WORKER_ID);
		public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PaymentRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ExperimentRecord> PAYEDEXPERIMENT = createForeignKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.Keys.KEY_EXPERIMENT_PRIMARY, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Payment.PAYMENT, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Payment.PAYMENT.EXPERIMENT_ID);
		public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PaymentRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.GiftcodeRecord> USEDGIFTCODE = createForeignKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.Keys.KEY_GIFTCODE_PRIMARY, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Payment.PAYMENT, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Payment.PAYMENT.GIFTCODE);
		public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PopulationansweroptionRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PopulationRecord> POPULATIONANSWER = createForeignKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.Keys.KEY_POPULATION_PRIMARY, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Populationansweroption.POPULATIONANSWEROPTION, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Populationansweroption.POPULATIONANSWEROPTION.POPULATION);
		public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PopulationresultRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.WorkerRecord> REFERENCEDWORKER = createForeignKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.Keys.KEY_WORKER_PRIMARY, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Populationresult.POPULATIONRESULT, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Populationresult.POPULATIONRESULT.WORKER);
		public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PopulationresultRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PopulationansweroptionRecord> REFERENCEDANSWER = createForeignKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.Keys.KEY_POPULATIONANSWEROPTION_PRIMARY, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Populationresult.POPULATIONRESULT, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Populationresult.POPULATIONRESULT.ANSWER);
		public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.RatingRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.TaskRecord> IDHITRATING = createForeignKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.Keys.KEY_TASK_PRIMARY, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Rating.RATING, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Rating.RATING.TASK);
		public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.RatingRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.AnswerRecord> IDANSWERSRATINS = createForeignKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.Keys.KEY_ANSWER_PRIMARY, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Rating.RATING, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Rating.RATING.ANSWER_R);
		public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.RatingRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.WorkerRecord> WORKERRATED = createForeignKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.Keys.KEY_WORKER_PRIMARY, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Rating.RATING, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Rating.RATING.WORKER_ID);
		public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.TagRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ExperimentRecord> IDEXPERIMENTTAGS = createForeignKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.Keys.KEY_EXPERIMENT_PRIMARY, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Tag.TAG, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Tag.TAG.EXPERIMENT);
		public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.TaskRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.ExperimentRecord> IDEXPERIMENTHIT = createForeignKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.Keys.KEY_EXPERIMENT_PRIMARY, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Task.TASK, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Task.TASK.EXPERIMENT);
		public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.TaskRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PlatformRecord> RUNNINGONPLATTFORM = createForeignKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.Keys.KEY_PLATFORM_PRIMARY, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Task.TASK, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Task.TASK.CROWD_PLATFORM);
		public static final org.jooq.ForeignKey<edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.WorkerRecord, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.records.PlatformRecord> WORKERORIGIN = createForeignKey(edu.ipd.kit.crowdcontrol.workerservice.database.model.Keys.KEY_PLATFORM_PRIMARY, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Worker.WORKER, edu.ipd.kit.crowdcontrol.workerservice.database.model.tables.Worker.WORKER.PLATFORM);
	}
}
