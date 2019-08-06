package br.com.fatec.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PDI.class)
public abstract class PDI_ {

	public static volatile ListAttribute<PDI, Questions> questions;
	public static volatile SingularAttribute<PDI, Boolean> active;
	public static volatile SingularAttribute<PDI, Long> id;
	public static volatile SingularAttribute<PDI, Date> dataCriacao;

}

