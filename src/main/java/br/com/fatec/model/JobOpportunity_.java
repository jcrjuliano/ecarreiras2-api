package br.com.fatec.model;

import br.com.fatec.enums.JobOpportunityStatus;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(JobOpportunity.class)
public abstract class JobOpportunity_ {

	public static volatile SingularAttribute<JobOpportunity, Date> updateDate;
	public static volatile SingularAttribute<JobOpportunity, String> activity;
	public static volatile SingularAttribute<JobOpportunity, Boolean> isPrivate;
	public static volatile SingularAttribute<JobOpportunity, String> title;
	public static volatile SingularAttribute<JobOpportunity, Date> creationDate;
	public static volatile SingularAttribute<JobOpportunity, Double> salary;
	public static volatile SingularAttribute<JobOpportunity, Date> limitDate;
	public static volatile SingularAttribute<JobOpportunity, String> company;
	public static volatile SingularAttribute<JobOpportunity, String> location;
	public static volatile SingularAttribute<JobOpportunity, String> details;
	public static volatile SingularAttribute<JobOpportunity, Long> id;
	public static volatile SingularAttribute<JobOpportunity, String> companyContact;
	public static volatile SingularAttribute<JobOpportunity, String> requisites;
	public static volatile SingularAttribute<JobOpportunity, JobOpportunityStatus> status;

}

