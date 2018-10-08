/*
 * @(#)JobOpportunityStatus.java 1.0 1 20/08/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.enums;

/**
 * A classe {@link JobOpportunityStatus}
 *
 * @author Julia
 * @version 1.0 20/08/2018
 */
public enum JobOpportunityStatus {
	
	DRAFT (0, "Draft"),
	APPROVAL (1, "Approval"),
	REVIEW (2, "Review"),
	PUBLISHED (3, "Published"),
	DELETED (4, "Deleted");
	
	private int cod;
	
	private String description;
	
	private JobOpportunityStatus(int cod, String description){
		this.cod = cod;
		this.description = description;
	}
	
	public int getCod(){
		return cod;
	}
	
	public String getDescription(){
		return description;
	}
	
	public static JobOpportunityStatus toEnum(Integer cod){
		if(cod == null){
			return null;
		}
		for (JobOpportunityStatus x : JobOpportunityStatus.values()){
			if(cod.equals(x.getCod())){
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido! Id: " + cod);
	}
}
