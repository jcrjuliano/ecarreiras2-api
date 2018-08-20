/*
 * @(#)Roles.java 1.0 1 19/08/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.model;

/**
 * A classe {@link Roles}
 *
 * @author Julia
 * @version 1.0 19/08/2018
 */
public enum Roles {
	
	ADMINISTRATOR,
	
	MENTOR,
	
	STUDENT,
	
	COMPANY;
	
	public boolean isAdmin(){
		return this.equals(ADMINISTRATOR);
	}

}
