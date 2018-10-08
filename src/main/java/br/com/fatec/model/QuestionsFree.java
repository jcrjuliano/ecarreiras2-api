/*
 * @(#)QuestionsFree.java 1.0 1 25/09/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.model;

import javax.persistence.Entity;

/**
 * A classe {@link QuestionsFree}
 *
 * @author Julia
 * @version 1.0 25/09/2018
 */
@Entity
public class QuestionsFree extends Questions{
	private static final long serialVersionUID = 1L;
	
	private String answer;

	/**
	 * @param id
	 * @param active
	 * @param question
	 */
	public QuestionsFree(Long id, Boolean active, String question, String answer) {
		super(id, active, question);
		// TODO Auto-generated constructor stub
		this.answer = answer;
	}

	/**
	 * @return the answer
	 */
	public String getAnswer() {
		return answer;
	}

	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
	

}
