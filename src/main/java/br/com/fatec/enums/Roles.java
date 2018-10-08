/*
 * @(#)Roles.java 1.0 1 19/08/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.enums;

/**
 * A classe {@link Roles}
 *
 * @author Julia
 * @version 1.0 19/08/2018
 */
public enum Roles {
	
	ADMINISTRATOR(0, "ROLE_ADMIN"),
	
	MENTOR(1, "ROLE_MENTOR"),
	
	STUDENT(2, "ROLE_STUDENT"),
	
	COMPANY(3, "ROLE_COMPANY");
	
	private int cod;
	
	private String description;
	
	private Roles(int cod, String description){
		this.cod = cod;
		this.description = description;
	}
	
	public int getCod(){
		return cod;
	}
	
	public String getDescription(){
		return description;
	}
	
	public static Roles toEnum(Integer cod){
		if(cod == null){
			return null;
		}
		for (Roles r : Roles.values()){
			if(cod.equals(r.getCod())){
				return r;
			}
		}
		throw new IllegalArgumentException("Id inválido! Id: " + cod);
	}
	
	public boolean isAdmin(){
		return this.equals(ADMINISTRATOR);
	}

}
