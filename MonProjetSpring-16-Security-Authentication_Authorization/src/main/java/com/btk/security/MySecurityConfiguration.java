package com.btk.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class MySecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Bean

	public BCryptPasswordEncoder encoder() {

		return new BCryptPasswordEncoder();

	}

	// regles de l'authentification

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		// enable in memory based authentication with a user named "user" and "admin"
		auth.inMemoryAuthentication()

				.withUser("salah").password(encoder().encode("password")).roles("USER").
				and()
				.withUser("kamel").password(encoder().encode("password")).roles("USER", "ADMIN")
				.and().withUser("nizar").password(encoder().encode("password")).roles("USER")

				.and().withUser("boukthir").password(encoder().encode("password")).roles("VISITEUR")

		;
	}

	// regles de l'autorisation

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/public/**").hasRole("USER").antMatchers("/secret/**").hasRole("ADMIN")
				.and()
				// Possibly more configuration ...
				//.formLogin() // enable form based log in
				// set permitAll for all URLs associated with Form Login
				//.permitAll();
				.httpBasic();
	}

	// Possibly more overridden methods ...
}
