/*
 * @(#)JobSubscriptionController.java 1.0 1 23/08/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fatec.dao.JobSubscriptionDAO;
import br.com.fatec.model.JobSubscription;

/**
 * A classe {@link JobSubscriptionController}
 *
 * @author Julia
 * @version 1.0 23/08/2018
 */

@RestController
@RequestMapping("/ecarreiras")
public class JobSubscriptionController {
	
	@Autowired
	JobSubscriptionDAO jobSubscriptionDAO;
	
	@GetMapping("/jobsubscription/{jobOpportunityId}")
	public ResponseEntity<List<JobSubscription>> getJobSubscriptionByOpportunity(@PathVariable(value="jobOpportunityId") Long jobOpportunityId){
		List<JobSubscription> subscriptions = jobSubscriptionDAO.getByJobOpportunity(jobOpportunityId);
		
		if(subscriptions == null){
			return ResponseEntity.notFound().build(); 
		}
		
		return ResponseEntity.ok().body(subscriptions);
	}
	
	@GetMapping("/jobsubscription")
	public List<JobSubscription> findAll(){
		return jobSubscriptionDAO.findAll();
	}

}
