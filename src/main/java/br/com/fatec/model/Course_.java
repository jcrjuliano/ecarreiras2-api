package br.com.fatec.model;

import br.com.fatec.enums.Period;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Course.class)
public abstract class Course_ {

	public static volatile SingularAttribute<Course, Institution> institution;
	public static volatile SingularAttribute<Course, Period> period;
	public static volatile SingularAttribute<Course, String> code;
	public static volatile SingularAttribute<Course, String> name;
	public static volatile SingularAttribute<Course, Long> id;

}

