/*
 * @(#)institution.java 1.0 1 13/08/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


/**
 * A classe {@link Institution}
 *
 * @author Julia
 * @version 1.0 13/08/2018
 */
@Entity
@Table(name="Institution")
@EntityListeners(AuditingEntityListener.class)
public class Institution {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@NotBlank
	private String code;
	
	@NotBlank
	private String cnpj;
	
	@NotBlank
	private String company;
	
	@Enumerated
	private InstitutionLevel level;
	
	@NotBlank
	private String city;
	
	public Institution (){
		
	}
	
	public Institution (final String code, final String cnpj, final String company,
			final InstitutionLevel level, final String city) {
		this.code = code;
		this.cnpj = cnpj;
		this.company = company;
		this.level = level;
		this.city = city;
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
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}


	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	public void update (Institution institution){
		this.setCity(institution.getCity());
		this.setCnpj(institution.getCnpj());
		this.setCode(institution.getCode());
		this.setCompany(institution.getCompany());
		this.setLevel(institution.getLevel());
	}

	/**
	 * @return the level
	 */
	public InstitutionLevel getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(InstitutionLevel level) {
		this.level = level;
	}
	

}
