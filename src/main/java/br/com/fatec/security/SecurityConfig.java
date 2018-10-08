/*
 * @(#)SecurityConfig.java 1.0 1 11/09/2018
 *
 * Copyright (c) 2017, Fatec-Jessen Vidal. All rights reserved.
 * Fatec-Jessen Vidal proprietary/confidential. Use is subject to license terms.
 */

package br.com.fatec.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

/**
 * A classe {@link SecurityConfig}
 *
 * @author Julia
 * @version 1.0 11/09/2018
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	/*
	 * Caminhos que por padrão não terão autenticação
	 */
	private static final String[] PUBLIC_MATCHERS = {
			"/h2-console/*",
			"/ecarreiras/institutions/**",
			"/ecarreiras/user/**",
			"/**",
	};
	private static final String[] PUBLIC_MATCHERS_GET = {
			"/ecarreiras/jobs/**",
	};
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		// Libera acesso ao H2 Console:
		http.headers().frameOptions().disable();
		

		http.cors().and().csrf().disable();
		http.authorizeRequests()
			.antMatchers(HttpMethod.GET, PUBLIC_MATCHERS_GET).permitAll()
			.antMatchers(PUBLIC_MATCHERS).permitAll()
			.anyRequest().authenticated();
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		
		
	}
	
	@Bean
	CorsConfigurationSource corsConfigurationSource(){
		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", new CorsConfiguration().applyPermitDefaultValues());
		return source;
	}
	
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder(){
		return new BCryptPasswordEncoder();
	}
	
	
	
}
