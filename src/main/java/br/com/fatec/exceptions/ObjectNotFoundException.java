/*
 * @(#)ObjectNotFoundException.java 1.0 1 17/09/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.exceptions;

/**
 * A classe {@link ObjectNotFoundException}
 *
 * @author Julia
 * @version 1.0 17/09/2018
 */
public class ObjectNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String msg){
		super(msg);
	}
	
	public ObjectNotFoundException(String msg, Throwable cause){
		super(msg, cause);
	}
}
