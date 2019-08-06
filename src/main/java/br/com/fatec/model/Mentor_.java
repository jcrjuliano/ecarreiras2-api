package br.com.fatec.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Mentor.class)
public abstract class Mentor_ {

	public static volatile SingularAttribute<Mentor, Institution> institution;
	public static volatile SingularAttribute<Mentor, String> name;
	public static volatile SingularAttribute<Mentor, Usuario> usuario;
	public static volatile SingularAttribute<Mentor, Long> id;

}

