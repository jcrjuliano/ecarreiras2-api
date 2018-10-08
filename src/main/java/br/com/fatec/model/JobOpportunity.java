/*
 * @(#)JobOpportunity.java 1.0 1 19/08/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.fatec.enums.JobOpportunityStatus;

/**
 * A classe {@link JobOpportunity}
 *
 * @author Julia
 * @version 1.0 19/08/2018
 */
@Entity
public class JobOpportunity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "ID_COMPANY")
	private Company company;
	
	private String location;
	
	private String title;
	
	private String activity;
	
	private String requisites;
	
	private String details;
	
	@Column(name = "LIMIT_DATE")
	private Date limitDate;
	
	@Column(name = "IS_PRIVATE")
	private Boolean isPrivate;
	
	@Column(name = "CREATION_DATE")
	private Date creationDate;
	
	@Column(name = "UPDATE_DATE")
	private Date updateDate;
	
	private Double salary;
	
	@Enumerated(EnumType.ORDINAL)
	private JobOpportunityStatus status;

	public JobOpportunity(){
		
	}
	/**
	 * @return the status
	 */
	public JobOpportunityStatus getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(JobOpportunityStatus status) {
		this.status = status;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 * @param company
	 * @param location
	 * @param title
	 * @param activity
	 * @param requisites
	 * @param details
	 * @param limitDate
	 * @param isPrivate
	 * @param creationDate
	 * @param updateDate
	 * @param active
	 * @param salary
	 * @param status
	 */
	public JobOpportunity(long id, Company company, String location, String title, String activity, String requisites,
			String details, Date limitDate, Boolean isPrivate, Date creationDate, Date updateDate,
			Double salary, JobOpportunityStatus status) {
		super();
		this.id = id;
		this.company = company;
		this.location = location;
		this.title = title;
		this.activity = activity;
		this.requisites = requisites;
		this.details = details;
		this.limitDate = limitDate;
		this.isPrivate = isPrivate;
		this.creationDate = creationDate;
		this.updateDate = updateDate;
		this.salary = salary;
		this.status = status;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the company
	 */
	public Company getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(Company company) {
		this.company = company;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the activity
	 */
	public String getActivity() {
		return activity;
	}

	/**
	 * @param activity the activity to set
	 */
	public void setActivity(String activity) {
		this.activity = activity;
	}

	/**
	 * @return the requisites
	 */
	public String getRequisites() {
		return requisites;
	}

	/**
	 * @param requisites the requisites to set
	 */
	public void setRequisites(String requisites) {
		this.requisites = requisites;
	}

	/**
	 * @return the details
	 */
	public String getDetails() {
		return details;
	}

	/**
	 * @param details the details to set
	 */
	public void setDetails(String details) {
		this.details = details;
	}

	/**
	 * @return the limitDate
	 */
	public Date getLimitDate() {
		return limitDate;
	}

	/**
	 * @param limitDate the limitDate to set
	 */
	public void setLimitDate(Date limitDate) {
		this.limitDate = limitDate;
	}

	/**
	 * @return the isPrivate
	 */
	public Boolean getIsPrivate() {
		return isPrivate;
	}

	/**
	 * @param isPrivate the isPrivate to set
	 */
	public void setIsPrivate(Boolean isPrivate) {
		this.isPrivate = isPrivate;
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

	/**
	 * @return the updateDate
	 */
	public Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * @param updateDate the updateDate to set
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * @return the salary
	 */
	public Double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void delete(){
		this.setStatus(JobOpportunityStatus.DELETED);
	}
	
	public void undelete(JobOpportunityStatus status){
		this.setStatus(status);
	}
	

}
