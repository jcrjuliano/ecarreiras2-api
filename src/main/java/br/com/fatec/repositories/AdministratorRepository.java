/*
 * @(#)AdministratorRepository.java 1.0 1 24/09/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fatec.model.Administrator;

/**
 * A classe {@link AdministratorRepository}
 *
 * @author Julia
 * @version 1.0 24/09/2018
 */
public interface AdministratorRepository extends JpaRepository<Administrator, Long>{

}
