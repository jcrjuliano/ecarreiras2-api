/*
 * @(#)QuestionsDAO.java 1.0 1 14/08/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fatec.exceptions.ObjectNotFoundException;
import br.com.fatec.model.Questions;
import br.com.fatec.repositories.QuestionsRepository;

/**
 * A classe {@link QuestionsDAO}
 *
 * @author Julia
 * @version 1.0 14/08/2018
 */
@Service
public class QuestionsDAO {
	
	@Autowired
	QuestionsRepository questionRepository;
	
	/* save an question */
	
	public Questions save(Questions question){
		return questionRepository.save(question);
	}
	
	/* search all question */
	
	public List<Questions> findAll(){
		return questionRepository.findAll();
	}
	
	/* get question by id */
	
	public Questions findOne(Long questionId){
		Questions inst = questionRepository.getOne(questionId);
		if (inst == null){
			throw new ObjectNotFoundException("Objeto não encontrado! Id:" + questionId
					+ ", Tipo: " + Questions.class.getName());
		}
		return inst;
	}
	
	/* delete an question */
	public void delete(Questions question){
		questionRepository.delete(question);
	}
}
