package com.minhaLojadeGames.LojaGames.seguranca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

// CLASSE DE CONFIGURAÇÃO = DEFINI ALGUMAS CONFIG DE SEGURANÇA DO NOSSO PROJETO
@EnableWebSecurity // INDICA QUE A CLASSE SE TRATA DE UMA CLASSE DE CONFIG DE SEGURANÇA DO SPRING
public class BasicSecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private UserDetailsService userDetailsService;

	@Override													//TRATATIVA DE ERROS
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService);
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	// LIBERAR ENDPOINTS DENTRO DO CONTROLLER PARA QUE O CLIENT TENHA ACESSO SEM PASSAR UMA CHAVE TOKEN
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/usuarios/login").permitAll()
		.antMatchers("/usuarios/cadastro").permitAll()
		.anyRequest().authenticated()
		.and().httpBasic()
		.and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
		.and().cors()
		.and().csrf().disable();
	}
}
