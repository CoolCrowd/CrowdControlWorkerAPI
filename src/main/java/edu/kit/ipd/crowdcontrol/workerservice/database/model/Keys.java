/**
 * This class is generated by jOOQ
 */
package edu.kit.ipd.crowdcontrol.workerservice.database.model;

import edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.*;
import edu.kit.ipd.crowdcontrol.workerservice.database.model.tables.records.*;

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

	public static final org.jooq.UniqueKey<AnswerRecord> KEY_ANSWER_PRIMARY = UniqueKeys0.KEY_ANSWER_PRIMARY;
	public static final org.jooq.UniqueKey<ConstraintRecord> KEY_CONSTRAINT_PRIMARY = UniqueKeys0.KEY_CONSTRAINT_PRIMARY;
	public static final org.jooq.UniqueKey<ExperimentRecord> KEY_EXPERIMENT_PRIMARY = UniqueKeys0.KEY_EXPERIMENT_PRIMARY;
	public static final org.jooq.UniqueKey<ExperimentspopulationRecord> KEY_EXPERIMENTSPOPULATION_PRIMARY = UniqueKeys0.KEY_EXPERIMENTSPOPULATION_PRIMARY;
	public static final org.jooq.UniqueKey<GiftcodeRecord> KEY_GIFTCODE_PRIMARY = UniqueKeys0.KEY_GIFTCODE_PRIMARY;
	public static final org.jooq.UniqueKey<NotificationRecord> KEY_NOTIFICATION_PRIMARY = UniqueKeys0.KEY_NOTIFICATION_PRIMARY;
	public static final org.jooq.UniqueKey<PaymentRecord> KEY_PAYMENT_PRIMARY = UniqueKeys0.KEY_PAYMENT_PRIMARY;
	public static final org.jooq.UniqueKey<PlatformRecord> KEY_PLATFORM_PRIMARY = UniqueKeys0.KEY_PLATFORM_PRIMARY;
	public static final org.jooq.UniqueKey<PlatformRecord> KEY_PLATFORM_IDPLATFORM_UNIQUE = UniqueKeys0.KEY_PLATFORM_IDPLATFORM_UNIQUE;
	public static final org.jooq.UniqueKey<PopulationRecord> KEY_POPULATION_PRIMARY = UniqueKeys0.KEY_POPULATION_PRIMARY;
	public static final org.jooq.UniqueKey<PopulationRecord> KEY_POPULATION_EXPERIMENT_UNIQUE = UniqueKeys0.KEY_POPULATION_EXPERIMENT_UNIQUE;
	public static final org.jooq.UniqueKey<PopulationansweroptionRecord> KEY_POPULATIONANSWEROPTION_PRIMARY = UniqueKeys0.KEY_POPULATIONANSWEROPTION_PRIMARY;
	public static final org.jooq.UniqueKey<PopulationresultRecord> KEY_POPULATIONRESULT_PRIMARY = UniqueKeys0.KEY_POPULATIONRESULT_PRIMARY;
	public static final org.jooq.UniqueKey<RatingRecord> KEY_RATING_PRIMARY = UniqueKeys0.KEY_RATING_PRIMARY;
	public static final org.jooq.UniqueKey<TagRecord> KEY_TAG_PRIMARY = UniqueKeys0.KEY_TAG_PRIMARY;
	public static final org.jooq.UniqueKey<TaskRecord> KEY_TASK_PRIMARY = UniqueKeys0.KEY_TASK_PRIMARY;
	public static final org.jooq.UniqueKey<TemplateRecord> KEY_TEMPLATE_PRIMARY = UniqueKeys0.KEY_TEMPLATE_PRIMARY;
	public static final org.jooq.UniqueKey<WorkerRecord> KEY_WORKER_PRIMARY = UniqueKeys0.KEY_WORKER_PRIMARY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.ForeignKey<AnswerRecord, TaskRecord> IDHITANSWERS = ForeignKeys0.IDHITANSWERS;
	public static final org.jooq.ForeignKey<AnswerRecord, WorkerRecord> WORKERANSWERED = ForeignKeys0.WORKERANSWERED;
	public static final org.jooq.ForeignKey<ConstraintRecord, ExperimentRecord> CONSTRAINEDEXPERIMENT = ForeignKeys0.CONSTRAINEDEXPERIMENT;
	public static final org.jooq.ForeignKey<ExperimentRecord, TemplateRecord> USEDTEMPLATE = ForeignKeys0.USEDTEMPLATE;
	public static final org.jooq.ForeignKey<ExperimentspopulationRecord, ExperimentRecord> POPULATIONUSER = ForeignKeys0.POPULATIONUSER;
	public static final org.jooq.ForeignKey<ExperimentspopulationRecord, PopulationansweroptionRecord> REFERENCEDANSWER = ForeignKeys0.REFERENCEDANSWER;
	public static final org.jooq.ForeignKey<ExperimentspopulationRecord, PlatformRecord> REFERENCEDPLATFORM = ForeignKeys0.REFERENCEDPLATFORM;
	public static final org.jooq.ForeignKey<PaymentRecord, WorkerRecord> PAYEDWORKER = ForeignKeys0.PAYEDWORKER;
	public static final org.jooq.ForeignKey<PaymentRecord, ExperimentRecord> PAYEDEXPERIMENT = ForeignKeys0.PAYEDEXPERIMENT;
	public static final org.jooq.ForeignKey<PaymentRecord, GiftcodeRecord> USEDGIFTCODE = ForeignKeys0.USEDGIFTCODE;
	public static final org.jooq.ForeignKey<PopulationRecord, ExperimentRecord> PARTICIPATEDIN = ForeignKeys0.PARTICIPATEDIN;
	public static final org.jooq.ForeignKey<PopulationansweroptionRecord, PopulationRecord> POPULATIONANSWER = ForeignKeys0.POPULATIONANSWER;
	public static final org.jooq.ForeignKey<PopulationresultRecord, WorkerRecord> REFERENCEDWORKER = ForeignKeys0.REFERENCEDWORKER;
	public static final org.jooq.ForeignKey<PopulationresultRecord, PopulationansweroptionRecord> CHOSENANSWER = ForeignKeys0.CHOSENANSWER;
	public static final org.jooq.ForeignKey<RatingRecord, TaskRecord> IDHITRATING = ForeignKeys0.IDHITRATING;
	public static final org.jooq.ForeignKey<RatingRecord, AnswerRecord> IDANSWERSRATINS = ForeignKeys0.IDANSWERSRATINS;
	public static final org.jooq.ForeignKey<RatingRecord, WorkerRecord> WORKERRATED = ForeignKeys0.WORKERRATED;
	public static final org.jooq.ForeignKey<TagRecord, ExperimentRecord> IDEXPERIMENTTAGS = ForeignKeys0.IDEXPERIMENTTAGS;
	public static final org.jooq.ForeignKey<TaskRecord, ExperimentRecord> IDEXPERIMENTHIT = ForeignKeys0.IDEXPERIMENTHIT;
	public static final org.jooq.ForeignKey<TaskRecord, PlatformRecord> RUNNINGONPLATTFORM = ForeignKeys0.RUNNINGONPLATTFORM;
	public static final org.jooq.ForeignKey<WorkerRecord, PlatformRecord> WORKERORIGIN = ForeignKeys0.WORKERORIGIN;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<AnswerRecord> KEY_ANSWER_PRIMARY = createUniqueKey(Answer.ANSWER, Answer.ANSWER.IDANSWER);
		public static final org.jooq.UniqueKey<ConstraintRecord> KEY_CONSTRAINT_PRIMARY = createUniqueKey(Constraint.CONSTRAINT, Constraint.CONSTRAINT.IDCONSTRAINT);
		public static final org.jooq.UniqueKey<ExperimentRecord> KEY_EXPERIMENT_PRIMARY = createUniqueKey(Experiment.EXPERIMENT, Experiment.EXPERIMENT.IDEXPERIMENT);
		public static final org.jooq.UniqueKey<ExperimentspopulationRecord> KEY_EXPERIMENTSPOPULATION_PRIMARY = createUniqueKey(Experimentspopulation.EXPERIMENTSPOPULATION, Experimentspopulation.EXPERIMENTSPOPULATION.IDEXPERIMENTSPOPULATION);
		public static final org.jooq.UniqueKey<GiftcodeRecord> KEY_GIFTCODE_PRIMARY = createUniqueKey(Giftcode.GIFTCODE, Giftcode.GIFTCODE.IDGIFTCODE);
		public static final org.jooq.UniqueKey<NotificationRecord> KEY_NOTIFICATION_PRIMARY = createUniqueKey(Notification.NOTIFICATION, Notification.NOTIFICATION.IDNOTIFICATION);
		public static final org.jooq.UniqueKey<PaymentRecord> KEY_PAYMENT_PRIMARY = createUniqueKey(Payment.PAYMENT, Payment.PAYMENT.IDPAYMENT);
		public static final org.jooq.UniqueKey<PlatformRecord> KEY_PLATFORM_PRIMARY = createUniqueKey(Platform.PLATFORM, Platform.PLATFORM.IDPLATFORM);
		public static final org.jooq.UniqueKey<PlatformRecord> KEY_PLATFORM_IDPLATFORM_UNIQUE = createUniqueKey(Platform.PLATFORM, Platform.PLATFORM.IDPLATFORM);
		public static final org.jooq.UniqueKey<PopulationRecord> KEY_POPULATION_PRIMARY = createUniqueKey(Population.POPULATION, Population.POPULATION.IDPOPULATION);
		public static final org.jooq.UniqueKey<PopulationRecord> KEY_POPULATION_EXPERIMENT_UNIQUE = createUniqueKey(Population.POPULATION, Population.POPULATION.EXPERIMENT);
		public static final org.jooq.UniqueKey<PopulationansweroptionRecord> KEY_POPULATIONANSWEROPTION_PRIMARY = createUniqueKey(Populationansweroption.POPULATIONANSWEROPTION, Populationansweroption.POPULATIONANSWEROPTION.IDPOPULATIONANSWEROPTION);
		public static final org.jooq.UniqueKey<PopulationresultRecord> KEY_POPULATIONRESULT_PRIMARY = createUniqueKey(Populationresult.POPULATIONRESULT, Populationresult.POPULATIONRESULT.IDPOPULATIONRESULT);
		public static final org.jooq.UniqueKey<RatingRecord> KEY_RATING_PRIMARY = createUniqueKey(Rating.RATING, Rating.RATING.IDRATING);
		public static final org.jooq.UniqueKey<TagRecord> KEY_TAG_PRIMARY = createUniqueKey(Tag.TAG, Tag.TAG.IDTAG);
		public static final org.jooq.UniqueKey<TaskRecord> KEY_TASK_PRIMARY = createUniqueKey(Task.TASK, Task.TASK.IDTASK);
		public static final org.jooq.UniqueKey<TemplateRecord> KEY_TEMPLATE_PRIMARY = createUniqueKey(Template.TEMPLATE, Template.TEMPLATE.IDTEMPLATE);
		public static final org.jooq.UniqueKey<WorkerRecord> KEY_WORKER_PRIMARY = createUniqueKey(Worker.WORKER, Worker.WORKER.IDWORKER);
	}

	private static class ForeignKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.ForeignKey<AnswerRecord, TaskRecord> IDHITANSWERS = createForeignKey(Keys.KEY_TASK_PRIMARY, Answer.ANSWER, Answer.ANSWER.TASK);
		public static final org.jooq.ForeignKey<AnswerRecord, WorkerRecord> WORKERANSWERED = createForeignKey(Keys.KEY_WORKER_PRIMARY, Answer.ANSWER, Answer.ANSWER.WORKER_ID);
		public static final org.jooq.ForeignKey<ConstraintRecord, ExperimentRecord> CONSTRAINEDEXPERIMENT = createForeignKey(Keys.KEY_EXPERIMENT_PRIMARY, Constraint.CONSTRAINT, Constraint.CONSTRAINT.EXPERIMENT);
		public static final org.jooq.ForeignKey<ExperimentRecord, TemplateRecord> USEDTEMPLATE = createForeignKey(Keys.KEY_TEMPLATE_PRIMARY, Experiment.EXPERIMENT, Experiment.EXPERIMENT.TEMPLATE);
		public static final org.jooq.ForeignKey<ExperimentspopulationRecord, ExperimentRecord> POPULATIONUSER = createForeignKey(Keys.KEY_EXPERIMENT_PRIMARY, Experimentspopulation.EXPERIMENTSPOPULATION, Experimentspopulation.EXPERIMENTSPOPULATION.POPULATION_USER);
		public static final org.jooq.ForeignKey<ExperimentspopulationRecord, PopulationansweroptionRecord> REFERENCEDANSWER = createForeignKey(Keys.KEY_POPULATIONANSWEROPTION_PRIMARY, Experimentspopulation.EXPERIMENTSPOPULATION, Experimentspopulation.EXPERIMENTSPOPULATION.ANSWER);
		public static final org.jooq.ForeignKey<ExperimentspopulationRecord, PlatformRecord> REFERENCEDPLATFORM = createForeignKey(Keys.KEY_PLATFORM_PRIMARY, Experimentspopulation.EXPERIMENTSPOPULATION, Experimentspopulation.EXPERIMENTSPOPULATION.REFERENCED_PLATFORM);
		public static final org.jooq.ForeignKey<PaymentRecord, WorkerRecord> PAYEDWORKER = createForeignKey(Keys.KEY_WORKER_PRIMARY, Payment.PAYMENT, Payment.PAYMENT.WORKER_ID);
		public static final org.jooq.ForeignKey<PaymentRecord, ExperimentRecord> PAYEDEXPERIMENT = createForeignKey(Keys.KEY_EXPERIMENT_PRIMARY, Payment.PAYMENT, Payment.PAYMENT.EXPERIMENT_ID);
		public static final org.jooq.ForeignKey<PaymentRecord, GiftcodeRecord> USEDGIFTCODE = createForeignKey(Keys.KEY_GIFTCODE_PRIMARY, Payment.PAYMENT, Payment.PAYMENT.GIFTCODE);
		public static final org.jooq.ForeignKey<PopulationRecord, ExperimentRecord> PARTICIPATEDIN = createForeignKey(Keys.KEY_EXPERIMENT_PRIMARY, Population.POPULATION, Population.POPULATION.EXPERIMENT);
		public static final org.jooq.ForeignKey<PopulationansweroptionRecord, PopulationRecord> POPULATIONANSWER = createForeignKey(Keys.KEY_POPULATION_PRIMARY, Populationansweroption.POPULATIONANSWEROPTION, Populationansweroption.POPULATIONANSWEROPTION.POPULATION);
		public static final org.jooq.ForeignKey<PopulationresultRecord, WorkerRecord> REFERENCEDWORKER = createForeignKey(Keys.KEY_WORKER_PRIMARY, Populationresult.POPULATIONRESULT, Populationresult.POPULATIONRESULT.WORKER);
		public static final org.jooq.ForeignKey<PopulationresultRecord, PopulationansweroptionRecord> CHOSENANSWER = createForeignKey(Keys.KEY_POPULATIONANSWEROPTION_PRIMARY, Populationresult.POPULATIONRESULT, Populationresult.POPULATIONRESULT.ANSWER);
		public static final org.jooq.ForeignKey<RatingRecord, TaskRecord> IDHITRATING = createForeignKey(Keys.KEY_TASK_PRIMARY, Rating.RATING, Rating.RATING.TASK);
		public static final org.jooq.ForeignKey<RatingRecord, AnswerRecord> IDANSWERSRATINS = createForeignKey(Keys.KEY_ANSWER_PRIMARY, Rating.RATING, Rating.RATING.ANSWER_R);
		public static final org.jooq.ForeignKey<RatingRecord, WorkerRecord> WORKERRATED = createForeignKey(Keys.KEY_WORKER_PRIMARY, Rating.RATING, Rating.RATING.WORKER_ID);
		public static final org.jooq.ForeignKey<TagRecord, ExperimentRecord> IDEXPERIMENTTAGS = createForeignKey(Keys.KEY_EXPERIMENT_PRIMARY, Tag.TAG, Tag.TAG.EXPERIMENT);
		public static final org.jooq.ForeignKey<TaskRecord, ExperimentRecord> IDEXPERIMENTHIT = createForeignKey(Keys.KEY_EXPERIMENT_PRIMARY, Task.TASK, Task.TASK.EXPERIMENT);
		public static final org.jooq.ForeignKey<TaskRecord, PlatformRecord> RUNNINGONPLATTFORM = createForeignKey(Keys.KEY_PLATFORM_PRIMARY, Task.TASK, Task.TASK.CROWD_PLATFORM);
		public static final org.jooq.ForeignKey<WorkerRecord, PlatformRecord> WORKERORIGIN = createForeignKey(Keys.KEY_PLATFORM_PRIMARY, Worker.WORKER, Worker.WORKER.PLATFORM);
	}
}