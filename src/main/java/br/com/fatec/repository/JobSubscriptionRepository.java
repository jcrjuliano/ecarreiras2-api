/*
 * @(#)JobSubscriptionRepository.java 1.0 1 23/08/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.fatec.model.JobOpportunity;
import br.com.fatec.model.JobSubscription;
import br.com.fatec.model.User;

/**
 * A classe {@link JobSubscriptionRepository}
 *
 * @author Julia
 * @version 1.0 23/08/2018
 */
public interface JobSubscriptionRepository extends JpaRepository<JobSubscription, Long>{
	
	//search by user
	@Query("SELECT js from JobSubscription js where js.user = ?1")
	List<JobSubscription> getByUser(User user);
	
	//search by job opportunity
	@Query("SELECT js from JobSubscription js where js.jobOpportunity = ?1")
	List<JobSubscription> getByJobOpportunity(JobOpportunity jobOpportunity);
	
	//search by user and job opportunity
	@Query("SELECT js from JobSubscription js where js.user = ?1 and js.jobOpportunity = ?2")
	List<JobSubscription> getByUserAndJobOpportunity(User user, JobOpportunity jobOpportunity);
}
