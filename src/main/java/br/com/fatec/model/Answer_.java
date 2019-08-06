package br.com.fatec.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Answer.class)
public abstract class Answer_ {

	public static volatile SingularAttribute<Answer, Date> answerDate;
	public static volatile SingularAttribute<Answer, PDI> pdi;
	public static volatile SingularAttribute<Answer, Student> student;
	public static volatile SingularAttribute<Answer, Long> id;

}

