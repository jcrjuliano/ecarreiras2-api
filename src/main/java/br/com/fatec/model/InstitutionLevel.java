/*
 * @(#)InstitutionLevel.java 1.0 1 20/08/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.model;

import org.springframework.util.StringUtils;


/**
 * A classe {@link InstitutionLevel}
 *
 * @author Julia
 * @version 1.0 20/08/2018
 */
public enum InstitutionLevel {
	TECHNICAL, SUPERIOR;
	
	public boolean isSuperior() {
		return this.equals(InstitutionLevel.SUPERIOR);
	}
	
	public static InstitutionLevel withLevel(final String level) {
		return StringUtils.isEmpty(level) ? null : valueOf(level.toUpperCase());
	}	
}
