/*
 * @(#)EcarreirasApplication.java 1.0 1 14/08/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * A classe {@link EcarreirasApplication}
 *
 * @author Julia
 * @version 1.0 14/08/2018
 */
@SpringBootApplication
@EnableJpaAuditing
public class EcarreirasApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EcarreirasApplication.class, args);
	}

}
