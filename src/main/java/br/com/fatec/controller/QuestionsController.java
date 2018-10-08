/*
 * @(#)QuestionsController.java 1.0 1 14/08/2018
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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fatec.dao.QuestionsDAO;
import br.com.fatec.model.Questions;

/**
 * A classe {@link QuestionsController}
 *
 * @author Julia
 * @version 1.0 14/08/2018
 */
@RestController
@RequestMapping("/ecarreiras")
public class QuestionsController {
	
	@Autowired
	QuestionsDAO questionDAO;
	
	/* Save question */
	@PostMapping("/questions")
	public Questions createQuestions(@Valid @RequestBody Questions question){
		return questionDAO.save(question);
	}
	
	/* Find all question */
	@GetMapping("/questions")
	public List<Questions> getAllQuestionss(){
		return questionDAO.findAll();
	}
	
	/* Find question by id*/
	@GetMapping("/questions/{id}")
	public ResponseEntity<Questions> getQuestionsById(@PathVariable(value="id") Long questionId){
		Questions inst = questionDAO.findOne(questionId);
		if(inst == null){
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(inst);
	}
	
	/* Update question 
	@PutMapping("/questions/{id}")
	public ResponseEntity<Questions> updateQuestionsById(@PathVariable(value="id") Long questionId, @Valid @RequestBody Questions instDetails){
		Questions quest = questionDAO.findOne(questionId);
		
		if(quest == null){
			return ResponseEntity.notFound().build();
		}
		quest.update(instDetails);
			
		Questions updateQuestions = questionDAO.save(inst);
		
		return ResponseEntity.ok().body(updateQuestions);
	}*/
	
	/* Delete question */
	@DeleteMapping("/questions/{id}")
	public ResponseEntity<Questions> deleteQuestions(@PathVariable(value="id") Long questionId){
		Questions inst = questionDAO.findOne(questionId);
		
		if(inst == null){
			return ResponseEntity.notFound().build();
		}
		
		questionDAO.delete(inst);
		
		return ResponseEntity.ok().build();
		
	}

}
