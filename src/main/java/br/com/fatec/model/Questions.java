/*
 * @(#)Questoes.java 1.0 1 25/09/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * A classe {@link Questions}
 *
 * @author Julia
 * @version 1.0 25/09/2018
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Questions implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private Boolean active;
	
	private String question;
	
	//private Integer questionType;
	
	/**
	 * @param id
	 * @param active
	 * @param question
	 * @param questionType
	 */
	public Questions(Long id, Boolean active, String question) {
		super();
		this.id = id;
		this.active = active;
		this.question = question;
		//this.questionType = questionType.getCod();
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
	 * @return the active
	 */
	public Boolean getActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(Boolean active) {
		this.active = active;
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

	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}
	
	/**
	 * @return the questionType
	
	public QuestionTypes getQuestionType() {
		return QuestionTypes.toEnum(questionType);
	} */
	
	/**
	 * @param questionType the questionType to set
	
	public void setQuestionType(QuestionTypes questionType) {
		this.questionType = questionType.getCod();
	}
 */


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
		Questions other = (Questions) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
