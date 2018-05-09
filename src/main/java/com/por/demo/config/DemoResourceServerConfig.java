package com.por.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class DemoResourceServerConfig extends ResourceServerConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/h2/**","/h2","/login").permitAll()
                .antMatchers("/stylesheet/**","/stylesheet").permitAll()
                .antMatchers("/header","/header/**").permitAll()
                .antMatchers("/tables","/tables/**").permitAll()
                .antMatchers("/help","/help/**").permitAll()
                .antMatchers("/favicon","/favicon/**").permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                .and()
                .httpBasic();
    }
}
