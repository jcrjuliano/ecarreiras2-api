/*
 * @(#)Answer.java 1.0 1 25/09/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * A classe {@link Answer}
 *
 * @author Julia
 * @version 1.0 25/09/2018
 */
@Entity
public class Answer implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private Date answerDate;
	
	@OneToOne
	private Student student;
	
	@ManyToOne
	private PDI pdi;
	
	public Answer(){
		
	}

	/**
	 * @param id
	 * @param answerDate
	 * @param student
	 * @param pdi
	 */
	public Answer(Long id, Date answerDate, Student student, PDI pdi) {
		super();
		this.id = id;
		this.setAnswerDate(answerDate);
		this.student = student;
		this.pdi = pdi;
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
	 * @return the answerDate
	 */
	public Date getAnswerDate() {
		return answerDate;
	}

	/**
	 * @param answerDate the answerDate to set
	 */
	public void setAnswerDate(Date answerDate) {
		this.answerDate = answerDate;
	}

	/**
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}

	/**
	 * @param student the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}

	/**
	 * @return the pdi
	 */
	public PDI getPdi() {
		return pdi;
	}

	/**
	 * @param pdi the pdi to set
	 */
	public void setPdi(PDI pdi) {
		this.pdi = pdi;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Answer other = (Answer) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}



}
