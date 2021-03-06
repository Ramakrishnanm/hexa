package com.hexa.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
    private UserDetailsService userDetailsService;
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            	.antMatchers(HttpMethod.GET, "/css/**", "/js/**","/fonts/**","/**/favicon.ico", "/about").permitAll()
                .antMatchers("/", "/login").permitAll()                
                .anyRequest().authenticated()
                .and()
            .formLogin()
                .loginPage("/login")
                .permitAll()
                .defaultSuccessUrl("/getSkills")
                //.defaultSuccessUrl("/dashboard")
                .and()             
            .logout()
                .permitAll();        
    }
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		
		//BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		PasswordEncoder noEncoder = NoOpPasswordEncoder.getInstance();
		auth.userDetailsService(userDetailsService).passwordEncoder(noEncoder);		
		
	}    
}
