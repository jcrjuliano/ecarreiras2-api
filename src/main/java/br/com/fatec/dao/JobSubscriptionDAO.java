/*
 * @(#)JobSubscriptionDAO.java 1.0 1 23/08/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fatec.model.JobOpportunity;
import br.com.fatec.model.JobSubscription;
import br.com.fatec.model.User;
import br.com.fatec.repository.JobOpportunityRepository;
import br.com.fatec.repository.JobSubscriptionRepository;

/**
 * A classe {@link JobSubscriptionDAO}
 *
 * @author Julia
 * @version 1.0 23/08/2018
 */

@Service
public class JobSubscriptionDAO {
	
	@Autowired
	JobSubscriptionRepository jobSubcriptionRepository;
	
	@Autowired
	JobOpportunityRepository jobOpportunityRepository;
	
	//Save Job Subscription
	public JobSubscription save(JobSubscription jobSubs){
		return jobSubcriptionRepository.save(jobSubs);
		
	}
	
	//List All
	public List<JobSubscription> findAll(){
		return jobSubcriptionRepository.findAll();
	}
	
	//Find one By Id
	public JobSubscription findOne(Long id){
		return jobSubcriptionRepository.findOne(id);
	}
	
	//Search by User
	public List<JobSubscription> getByUser(User user){
		return jobSubcriptionRepository.getByUser(user);
	}
	
	//Search by Job Opportunity
	public List<JobSubscription> getByJobOpportunity(Long jobOpportunityId){
		return jobSubcriptionRepository.getByJobOpportunity(jobOpportunityRepository.getOne(jobOpportunityId));
	}
	
	//Search by Job Opportunity and User
	public List<JobSubscription> getByUserAndJobOpportunity(User user, JobOpportunity jobOpportunity){
		return jobSubcriptionRepository.getByUserAndJobOpportunity(user, jobOpportunity);
	}	
	
	//Delete Job Subscription
	public void delete(JobSubscription jobSubs){
		jobSubcriptionRepository.delete(jobSubs);
	}

}
