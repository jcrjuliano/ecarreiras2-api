/*
 * @(#)InstitutionLevel.java 1.0 1 20/08/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.enums;

import org.springframework.util.StringUtils;


/**
 * A classe {@link InstitutionLevel}
 *
 * @author Julia
 * @version 1.0 20/08/2018
 */
public enum InstitutionLevel {
	TECHNICAL(0, "Technical"), 
	SUPERIOR(1, "Superior");
	
	private int cod;
	
	private String description;
	
	private InstitutionLevel(int cod, String description){
		this.cod = cod;
		this.description = description;
	}
	
	public int getCod(){
		return cod;
	}
	
	public String getDescription(){
		return description;
	}
	
	public static InstitutionLevel toEnum(Integer cod){
		if(cod == null){
			return null;
		}
		for (InstitutionLevel il : InstitutionLevel.values()){
			if(cod.equals(il.getCod())){
				return il;
			}
		}
		throw new IllegalArgumentException("Id inválido! Id: " + cod);
	}
	
	public boolean isSuperior() {
		return this.equals(InstitutionLevel.SUPERIOR);
	}
	
	public static InstitutionLevel withLevel(final String level) {
		return StringUtils.isEmpty(level) ? null : valueOf(level.toUpperCase());
	}	
}
