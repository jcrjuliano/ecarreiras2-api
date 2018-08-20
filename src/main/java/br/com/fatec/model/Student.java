/*
 * @(#)student.java 1.0 1 13/08/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

/**
 * A classe {@link Student}
 *
 * @author Julia
 * @version 1.0 13/08/2018
 */
@Entity
@Table(name="Student")
@EntityListeners(AuditingEntityListener.class)
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	

}
