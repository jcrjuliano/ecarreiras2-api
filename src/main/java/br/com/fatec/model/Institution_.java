package br.com.fatec.model;

import br.com.fatec.enums.InstitutionLevel;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Institution.class)
public abstract class Institution_ {

	public static volatile SingularAttribute<Institution, String> code;
	public static volatile SingularAttribute<Institution, InstitutionLevel> level;
	public static volatile SingularAttribute<Institution, String> city;
	public static volatile SingularAttribute<Institution, String> company;
	public static volatile SingularAttribute<Institution, Long> id;
	public static volatile SingularAttribute<Institution, String> cnpj;

}

