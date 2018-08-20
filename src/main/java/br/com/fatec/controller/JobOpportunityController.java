/*
 * @(#)JobOpportunityController.java 1.0 1 19/08/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fatec.dao.JobOpportunityDAO;
import br.com.fatec.model.JobOpportunity;
import br.com.fatec.model.JobOpportunityStatus;

/**
 * A classe {@link JobOpportunityController}
 *
 * @author Julia
 * @version 1.0 19/08/2018
 */
@RestController
@RequestMapping("/ecarreiras")
public class JobOpportunityController {
	
	@Autowired
	JobOpportunityDAO jobOpportunityDAO;
	
	// save job
	@PostMapping("/jobs")
	public JobOpportunity createJobOpportunity(@Valid @RequestBody JobOpportunity job){
		return jobOpportunityDAO.save(job); 
	}
	
	/* find all jobs */
	@GetMapping("/jobs")
	public List<JobOpportunity> getAllJobs(){
		return jobOpportunityDAO.findAll();
	}
	
	/* Find JobOpportunity by id*/
	@GetMapping("/jobs/{id}")
	public ResponseEntity<JobOpportunity> getJobOpportunityById(@PathVariable(value="id") Long jobId){
		JobOpportunity jobOpportunity = jobOpportunityDAO.findOne(jobId);
		if(jobOpportunity == null){
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(jobOpportunity);
	}
	
	/* Delete JobOpportunity */
	@CrossOrigin
	@DeleteMapping("/jobs/{id}")
	public ResponseEntity<JobOpportunity> deleteJobOpportunity(@PathVariable(value="id") Long jobId){
		JobOpportunity jobOpportunity = jobOpportunityDAO.findOne(jobId);
		if(jobOpportunity == null){
			return ResponseEntity.notFound().build();
		}
		
		jobOpportunity.delete();
		jobOpportunityDAO.save(jobOpportunity);
		
		return ResponseEntity.ok().build();
	}
	
	// Get JobOpportunity By Status
	@GetMapping("/jobs/status/{status}")
	public List<JobOpportunity> getByStatus(@PathVariable(value="status") JobOpportunityStatus status){
		return jobOpportunityDAO.getByStatus(status);
		
	}



}
