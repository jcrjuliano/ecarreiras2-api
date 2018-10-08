/*
 * @(#)JobOpportunity.java 1.0 1 19/08/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fatec.enums.JobOpportunityStatus;
import br.com.fatec.model.JobOpportunity;
import br.com.fatec.repositories.JobOpportunityRepository;

/**
 * A classe {@link JobOpportunityDAO}
 *
 * @author Julia
 * @version 1.0 19/08/2018
 */
@Service
public class JobOpportunityDAO {
	@Autowired
	JobOpportunityRepository jobOpportunityRepository; 
	
	//SAVE Job Oportunity
	public JobOpportunity save(JobOpportunity job){
		return jobOpportunityRepository.save(job);
	}
	
	// Get All Job Oportunity
	public List<JobOpportunity> findAll(){
		return jobOpportunityRepository.findAll();
	}
	
	// Get Job Opportunity by Id
	public JobOpportunity findOne(Long id){
		return jobOpportunityRepository.findOne(id);
	}
	
	// Delete Job Oportunity
	
	public void delete(JobOpportunity job){
		jobOpportunityRepository.delete(job);
	}
	
	public List<JobOpportunity> getByStatus(JobOpportunityStatus status){
		return jobOpportunityRepository.getByStatus(status);
	}
	

}
