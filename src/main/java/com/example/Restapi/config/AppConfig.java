package com.example.Restapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.services.Services;

@Configuration
public class AppConfig {
    @Bean
    public Services services() {
        return new Services();
    }
}

