/*
 * @(#)Company.java 1.0 1 19/08/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.fatec.enums.Roles;

/**
 * A classe {@link Company}
 *
 * @author Julia
 * @version 1.0 19/08/2018
 */
@Entity
@Table(name="company")
public class Company extends Usuario{
	private static final long serialVersionUID = 1L;

	@Column(name = "COMPANY_NAME")
	private String companyName;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "PHONE")
	private String phone;
	
	@Column(name = "CONTACT_NAME")
	private String contactName;
	
	public Company(){
	}

	/**
	 * @param id
	 * @param username
	 * @param password
	 * @param role
	 */
	public Company(Long id, String username, String password, 
			String companyName, String email, String phone, String contactName) {
		super(id, username, password, Roles.COMPANY);
		// TODO Auto-generated constructor stub
		this.companyName = companyName;
		this.email = email;
		this.phone = phone;
		this.contactName = contactName;
	}

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the contactName
	 */
	public String getContactName() {
		return contactName;
	}

	/**
	 * @param contactName the contactName to set
	 */
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", email=" + email + ", phone=" + phone + ", contactName="
				+ contactName + "]";
	}
}
