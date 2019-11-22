package com.clj.monitoria.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.mysql.cj.x.protobuf.MysqlxSession.AuthenticateContinueOrBuilder;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class security extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.anyRequest().authenticated()
		.and()
		.httpBasic();
	}
	@Autowired
	public void configure(AuthenticationManagerBuilder auto) throws Exception {
		auto.inMemoryAuthentication()
			.withUser("pedro").password("caju").roles("USER")
			.and()
			.withUser("admin").password("admin").roles("USER" , "ADMIN");
	}
}
