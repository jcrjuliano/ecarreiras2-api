/*
 * @(#)JobSubscription.java 1.0 1 23/08/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * A classe {@link JobSubscription}
 *
 * @author Julia
 * @version 1.0 23/08/2018
 */
@Entity
@Table(name="JOB_SUBSCRIPTION")
public class JobSubscription {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="ID_USER")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private User user;
	
	@ManyToOne
	@JoinColumn(name="ID_JOB_OPPORTUNITY")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private JobOpportunity jobOpportunity;
	
	@Column(name="CREATION_DATE")
	private Date creationDate;

	/**
	 * @param id
	 * @param user
	 * @param jobOpportunity
	 * @param creationDate
	 */
	public JobSubscription(Long id, User user, JobOpportunity jobOpportunity, Date creationDate) {
		super();
		this.id = id;
		this.user = user;
		this.jobOpportunity = jobOpportunity;
		this.creationDate = creationDate;
	}

	/**
	 * 
	 */
	public JobSubscription() {
		super();
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
	 * @return the jobOpportunity
	 */
	public JobOpportunity getJobOpportunity() {
		return jobOpportunity;
	}

	/**
	 * @param jobOpportunity the jobOpportunity to set
	 */
	public void setJobOpportunity(JobOpportunity jobOpportunity) {
		this.jobOpportunity = jobOpportunity;
	}

	/**
	 * @return the creationDate
	 */
	public Date getCreationDate() {
		return creationDate;
	}

	/**
	 * @param creationDate the creationDate to set
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	

}
