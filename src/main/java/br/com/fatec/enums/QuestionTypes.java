/*
 * @(#)Roles.java 1.0 1 19/08/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.enums;

/**
 * A classe {@link QuestionTypes}
 *
 * @author Julia
 * @version 1.0 19/08/2018
 */
public enum QuestionTypes {
	
	FREETEXT(0, "Free Text Question"),
	
	SINGLECHOICE(1, "Single Choice Question"),
	
	MULTIPLECHOICE(2, "Multiple Choice Question");
		
	private int cod;
	
	private String description;
	
	private QuestionTypes(int cod, String description){
		this.cod = cod;
		this.description = description;
	}
	
	public int getCod(){
		return cod;
	}
	
	public String getDescription(){
		return description;
	}
	
	public static QuestionTypes toEnum(Integer cod){
		if(cod == null){
			return null;
		}
		for (QuestionTypes x : QuestionTypes.values()){
			if(cod.equals(x.getCod())){
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido! Id: " + cod);
	}
	

}
