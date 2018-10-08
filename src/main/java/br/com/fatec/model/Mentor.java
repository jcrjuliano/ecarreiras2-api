/*
 * @(#)mentor.java 1.0 1 13/08/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.fatec.enums.Roles;

/**
 * A classe {@link Mentor}
 *
 * @author Julia
 * @version 1.0 13/08/2018
 */
@Entity
@Table(name="Mentor")
public class Mentor extends User{
	private static final long serialVersionUID = 1L;
	
	@OneToOne
	@JoinColumn(name="institution_id")
	@MapsId
	private Institution institution;
	
	private String name;
	
	public Mentor(){
	}

	/**
	 * @param id
	 * @param username
	 * @param password
	 * @param role
	 */
	public Mentor(Long id, String username, String password, Institution institution, String name) {
		super(id, username, password, Roles.MENTOR);
		this.institution = institution;
		this.name = name;		
	}

	/**
	 * @return the institution
	 */
	public Institution getInstitution() {
		return institution;
	}

	/**
	 * @param institution the institution to set
	 */
	public void setInstitution(Institution institution) {
		this.institution = institution;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
