/*
 * @(#)Company.java 1.0 1 19/08/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * A classe {@link Company}
 *
 * @author Julia
 * @version 1.0 19/08/2018
 */
@Entity
@Table(name="company")
public class Company {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@OneToOne
	@JoinColumn(name = "ID_USER")
	private User user;
	
	@Column(name = "COMPANY_NAME")
	private String companyName;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "PHONE")
	private String phone;
	
	@Column(name = "CONTACT_NAME")
	private String contactName;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
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

	/**
	 * @param id
	 * @param user
	 * @param companyName
	 * @param email
	 * @param phone
	 * @param contactName
	 */
	public Company(long id, User user, String companyName, String email, String phone, String contactName) {
		super();
		this.id = id;
		this.user = user;
		this.companyName = companyName;
		this.email = email;
		this.phone = phone;
		this.contactName = contactName;
	}
	
	public Company(){
		
	}
	

}
