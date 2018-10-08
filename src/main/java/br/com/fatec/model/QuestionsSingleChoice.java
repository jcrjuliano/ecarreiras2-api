/*
 * @(#)QuestionsSelectSingle.java 1.0 1 25/09/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;

import br.com.fatec.enums.QuestionTypes;

/**
 * A classe {@link QuestionsSingleChoice}
 *
 * @author Julia
 * @version 1.0 25/09/2018
 */

public class QuestionsSingleChoice extends Questions{
	private static final long serialVersionUID = 1L;
	
	@ElementCollection
	@CollectionTable(name="ALTERNATIVES")
	private Set<String> alternatives = new HashSet<>();
	
	private String selected;


	/**
	 * @param id
	 * @param active
	 * @param question
	 * @param questionType
	 */
	public QuestionsSingleChoice(Long id, Boolean active, String question, QuestionTypes questionType, String selected) {
		super(id, active, question);
		// TODO Auto-generated constructor stub
		this.selected = selected;
	}


	/**
	 * @return the alternatives
	 */
	public Set<String> getAlternatives() {
		return alternatives;
	}


	/**
	 * @param alternatives the alternatives to set
	 */
	public void setAlternatives(Set<String> alternatives) {
		this.alternatives = alternatives;
	}


	/**
	 * @return the selected
	 */
	public String getSelected() {
		return selected;
	}


	/**
	 * @param selected the selected to set
	 */
	public void setSelected(String selected) {
		this.selected = selected;
	}
}
