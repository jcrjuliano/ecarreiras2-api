package br.com.fatec.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Student.class)
public abstract class Student_ {

	public static volatile SingularAttribute<Student, String> code;
	public static volatile SingularAttribute<Student, String> institutionCode;
	public static volatile SingularAttribute<Student, String> courseCode;
	public static volatile SingularAttribute<Student, String> startYear;
	public static volatile SingularAttribute<Student, Usuario> usuario;
	public static volatile SingularAttribute<Student, Long> id;
	public static volatile SingularAttribute<Student, String> ra;
	public static volatile SingularAttribute<Student, String> startSemester;

}

