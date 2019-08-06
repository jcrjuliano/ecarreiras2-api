package br.com.fatec.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(JobSubscription.class)
public abstract class JobSubscription_ {

	public static volatile SingularAttribute<JobSubscription, Long> id;
	public static volatile SingularAttribute<JobSubscription, Date> creationDate;
	public static volatile SingularAttribute<JobSubscription, Usuario> user;
	public static volatile SingularAttribute<JobSubscription, JobOpportunity> jobOpportunity;

}

