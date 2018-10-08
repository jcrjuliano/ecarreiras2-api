/*
 * @(#)PDI.java 1.0 1 25/09/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * A classe {@link PDI}
 *
 * @author Julia
 * @version 1.0 25/09/2018
 */
@Entity
public class PDI implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private Date dataCriacao;
	
	@OneToMany
	private List<Questions> questions;
	
	private Boolean active;
	
	public PDI(){
		
	}

	/**
	 * @param id
	 * @param dataCriacao
	 * @param questions
	 * @param active
	 */
	public PDI(Long id, Date dataCriacao, List<Questions> questions, Boolean active) {
		super();
		this.id = id;
		this.dataCriacao = dataCriacao;
		this.questions = questions;
		this.active = active;
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
	 * @return the dataCriacao
	 */
	public Date getDataCriacao() {
		return dataCriacao;
	}

	/**
	 * @param dataCriacao the dataCriacao to set
	 */
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	/**
	 * @return the questions
	 */
	public List<Questions> getQuestions() {
		return questions;
	}

	/**
	 * @param questions the questions to set
	 */
	public void setQuestions(List<Questions> questions) {
		this.questions = questions;
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
}
