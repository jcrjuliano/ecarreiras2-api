/*
 * @(#)InstitutionController.java 1.0 1 14/08/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fatec.dao.InstitutionDAO;
import br.com.fatec.model.Institution;

/**
 * A classe {@link InstitutionController}
 *
 * @author Julia
 * @version 1.0 14/08/2018
 */
@RestController
@RequestMapping("/ecarreiras")
public class InstitutionController {
	
	@Autowired
	InstitutionDAO institutionDAO;
	
	/* Save institution */
	@PostMapping("/institutions")
	public Institution createInstitution(@Valid @RequestBody Institution institution){
		return institutionDAO.save(institution);
	}
	
	/* Find all institution */
	@GetMapping("/institutions")
	public List<Institution> getAllInstitutions(){
		return institutionDAO.findAll();
	}
	
	/* Find institution by id*/
	@GetMapping("/institutions/{id}")
	public ResponseEntity<Institution> getInstitutionById(@PathVariable(value="id") Long institutionId){
		Institution inst = institutionDAO.findOne(institutionId);
		if(inst == null){
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(inst);
	}
	
	/* Update institution */
	@PutMapping("/institutions/{id}")
	public ResponseEntity<Institution> updateInstitutionById(@PathVariable(value="id") Long institutionId, @Valid @RequestBody Institution instDetails){
		Institution inst = institutionDAO.findOne(institutionId);
		
		if(inst == null){
			return ResponseEntity.notFound().build();
		}
		inst.update(instDetails);
			
		Institution updateInstitution = institutionDAO.save(inst);
		
		return ResponseEntity.ok().body(updateInstitution);
	}
	
	/* Delete institution */
	@DeleteMapping("/institutions/{id}")
	public ResponseEntity<Institution> deleteInstitution(@PathVariable(value="id") Long institutionId){
		Institution inst = institutionDAO.findOne(institutionId);
		
		if(inst == null){
			return ResponseEntity.notFound().build();
		}
		
		institutionDAO.delete(inst);
		
		return ResponseEntity.ok().build();
		
	}

}
