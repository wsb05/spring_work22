package com.dgsw.ex01_springboot.config;

import com.dgsw.ex01_springboot.components.B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class MyConfig {
    // alt + enter 빠른 에러처리
    @Bean
    public B b() {
        return new B();
    }

    @Bean
    public DriverManagerDataSource

}
