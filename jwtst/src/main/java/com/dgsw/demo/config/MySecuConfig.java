package com.dgsw.demo.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class MySecuConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) {

        http.formLogin();
        http.csrf().disable();
        http.logout();

        http.addFilterBefore( api)

    }

}
