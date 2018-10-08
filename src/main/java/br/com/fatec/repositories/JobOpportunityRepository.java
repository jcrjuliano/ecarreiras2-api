/*
 * @(#)JobOpportunityRepository.java 1.0 1 19/08/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.fatec.enums.JobOpportunityStatus;
import br.com.fatec.model.JobOpportunity;

/**
 * A classe {@link JobOpportunityRepository}
 *
 * @author Julia
 * @version 1.0 19/08/2018
 */
public interface JobOpportunityRepository extends JpaRepository<JobOpportunity, Long> {

	@Query("SELECT jb from JobOpportunity jb where jb.status = ?1")
	List<JobOpportunity> getByStatus(JobOpportunityStatus status);

}
