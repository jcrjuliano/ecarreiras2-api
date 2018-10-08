/*
 * @(#)Period.java 1.0 1 15/08/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.enums;

/**
 * A classe {@link Period}
 *
 * @author Julia
 * @version 1.0 15/08/2018
 */
public enum Period {
	
	/**
	 * Matutino
	 */
	MORNING (0, "Morning"),
	/**
	 * Vespertino
	 */
	AFTERNOON (1, "Afternoon"),
	/**
	 * Noturno
	 */
	NIGHTLY (2, "Nightly"),
	/**
	 * Estudo a distancia
	 */
	EAD (3, "EAD");	
	
	private int cod;
	
	private String description;
	
	private Period(int cod, String description){
		this.cod = cod;
		this.description = description;
	}
	
	public int getCod(){
		return cod;
	}
	
	public String getDescription(){
		return description;
	}
	
	public static Period toEnum(Integer cod){
		if(cod == null){
			return null;
		}
		for (Period x : Period.values()){
			if(cod.equals(x.getCod())){
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido! Id: " + cod);
	}
}
