/*
 * @(#)SecurityConfig.java 1.0 1 11/09/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.access.expression.method.MethodSecurityExpressionHandler;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.expression.OAuth2MethodSecurityExpressionHandler;

/**
 * A classe {@link ResourceServerConfig}
 *
 * @author Juliano
 * @version 1.0 11/09/2018
 */
@Configuration
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
	
	/*
	 * Caminhos que por padrão não terão autenticação
	 */
	private static final String[] PUBLIC_MATCHERS = {
			//"/h2-console/*",
			"/ecarreiras/institutions/**",
			"/ecarreiras/user/**",
			"/**",
	};
	/*
	 * Rotas GET publica
	 */
	private static final String[] PUBLIC_MATCHERS_GET = {
			"/ecarreiras/jobs/**",
	};
	
	/*
	 * Rotas POST publicas
	 * 
	 */
	private static final String[] PUBLIC_MATCHERS_POST = {
			"/ecarreiras/jobs/**",
	};

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/").permitAll();
		// Libera acesso ao H2 Console:
		http.headers().frameOptions().disable();

		http.cors().and().csrf().disable();
		http.authorizeRequests()
			.antMatchers(HttpMethod.POST, PUBLIC_MATCHERS_POST).permitAll()
			.antMatchers(HttpMethod.GET, PUBLIC_MATCHERS_GET).permitAll()
			.antMatchers(PUBLIC_MATCHERS).permitAll()
			.anyRequest().authenticated()
			.and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}

	@Override
	public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
		resources.stateless(true);
	}
	

	@Bean
	public MethodSecurityExpressionHandler createExpressionHandler() {
		return new OAuth2MethodSecurityExpressionHandler();
	}


}
