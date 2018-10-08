/*
 * @(#)Administrator.java 1.0 1 24/09/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.model;

import javax.persistence.Entity;

import br.com.fatec.enums.Roles;

/**
 * A classe {@link Administrator}
 *
 * @author Julia
 * @version 1.0 24/09/2018
 */
@Entity
public class Administrator extends User {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public Administrator() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param username
	 * @param password
	 * @param role
	 */
	public Administrator(Long id, String username, String password) {
		super(id, username, password, Roles.ADMINISTRATOR);
		// TODO Auto-generated constructor stub
	}

}
