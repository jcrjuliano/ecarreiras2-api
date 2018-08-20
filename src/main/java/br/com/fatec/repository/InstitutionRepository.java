/*
 * @(#)InstitutionRepository.java 1.0 1 14/08/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fatec.model.Institution;

/**
 * A classe {@link InstitutionRepository}
 *
 * @author Julia
 * @version 1.0 14/08/2018
 */
public interface InstitutionRepository extends JpaRepository<Institution, Long> {

}
