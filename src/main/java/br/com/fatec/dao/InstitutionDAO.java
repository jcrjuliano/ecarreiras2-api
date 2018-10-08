/*
 * @(#)InstitutionDAO.java 1.0 1 14/08/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fatec.exceptions.ObjectNotFoundException;
import br.com.fatec.model.Institution;
import br.com.fatec.repositories.InstitutionRepository;

/**
 * A classe {@link InstitutionDAO}
 *
 * @author Julia
 * @version 1.0 14/08/2018
 */
@Service
public class InstitutionDAO {
	
	@Autowired
	InstitutionRepository institutionRepository;
	
	/* save an institution */
	
	public Institution save(Institution institution){
		return institutionRepository.save(institution);
	}
	
	/* search all institution */
	
	public List<Institution> findAll(){
		return institutionRepository.findAll();
	}
	
	/* get institution by id */
	
	public Institution findOne(Long institutionId){
		Institution inst = institutionRepository.getOne(institutionId);
		if (inst == null){
			throw new ObjectNotFoundException("Objeto não encontrado! Id:" + institutionId
					+ ", Tipo: " + Institution.class.getName());
		}
		return inst;
	}
	
	/* delete an institution */
	public void delete(Institution institution){
		institutionRepository.delete(institution);
	}
}
