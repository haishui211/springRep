package com.navy.core.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.ObjectPostProcessor;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
				.anyRequest()
					.authenticated().and().httpBasic();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	@Autowired
	private CustomerDetailsService customerDetailsService;
	
	@Autowired
	private CustomAccessDecisionManager customAccessDecisionManager;
	
	@Autowired
	private CustomFilterSecurityMetadataSource customFilterSecurityMetadataSource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(this.customerDetailsService)
			.passwordEncoder(this.passwordEncoder())
			.withObjectPostProcessor(new ObjectPostProcessor<FilterSecurityInterceptor>() {
	        public <O extends FilterSecurityInterceptor> O postProcess(O fsi) {
	            fsi.setAccessDecisionManager(customAccessDecisionManager);
	            fsi.setSecurityMetadataSource(customFilterSecurityMetadataSource);
	            return fsi;
	        }});
	}
}
