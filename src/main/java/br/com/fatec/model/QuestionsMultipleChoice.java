/*
 * @(#)QuestionsMultipleChoice.java 1.0 1 25/09/2018
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
 * A classe {@link QuestionsMultipleChoice}
 *
 * @author Julia
 * @version 1.0 25/09/2018
 */

public class QuestionsMultipleChoice extends Questions{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ElementCollection
	@CollectionTable(name="OPTIONS")
	private Set<String> options = new HashSet<>();
	@ElementCollection
	@CollectionTable(name="SELECTED_OPTIONS")
	private Set<String> selectedOptions = new HashSet<>();
	
	/**
	 * @param id
	 * @param active
	 * @param question
	 * @param questionType
	 */
	public QuestionsMultipleChoice(Long id, Boolean active, String question, QuestionTypes questionType) {
		super(id, active, question);
		// TODO Auto-generated constructor stub
		
	}

	/**
	 * @return the options
	 */
	public Set<String> getOptions() {
		return options;
	}

	/**
	 * @param options the options to set
	 */
	public void setOptions(Set<String> options) {
		this.options = options;
	}

	/**
	 * @return the selectedOptions
	 */
	public Set<String> getSelectedOptions() {
		return selectedOptions;
	}

	/**
	 * @param selectedOptions the selectedOptions to set
	 */
	public void setSelectedOptions(Set<String> selectedOptions) {
		this.selectedOptions = selectedOptions;
	}	

}
