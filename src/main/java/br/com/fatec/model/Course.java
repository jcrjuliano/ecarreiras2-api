/*
 * @(#)course.java 1.0 1 13/08/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import br.com.fatec.enums.Period;



/**
 * A classe {@link Course}
 *
 * @author Julia
 * @version 1.0 13/08/2018
 */
@Entity
@Table(name="Course")
@EntityListeners(AuditingEntityListener.class)
public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column(name = "CODE")
	private String code;
	
	@Column(name = "NAME")
	private String name;
	
	@Enumerated
	@Column(name = "PERIOD")
	private Period period;
	
	@ManyToOne
	@JoinColumn(name = "ID_INSTITUTION")
	private Institution institution;
	
	@SuppressWarnings("unused")
	private Course() {
		this(null, null, null, null);
	}
	
	public Course(final String code, final String name, final Period period,
			final Institution institution) {
		this.code = code;
		this.name = name;
		this.period = period;
		this.institution = institution;
	}
	
	public String getNamePeriod() {
		return period.name();
	}
	
	public String getInstitutionCode() {
		return institution.getCode();
	}

	public void update(final Course updateCourse) {
		this.code = updateCourse.getCode();
		this.name = updateCourse.getName();
		this.period = updateCourse.getPeriod();
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the period
	 */
	public Period getPeriod() {
		return period;
	}

	/**
	 * @return the institution
	 */
	public Institution getInstitution() {
		return institution;
	}
	
	
}
