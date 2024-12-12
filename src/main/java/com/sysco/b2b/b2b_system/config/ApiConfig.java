package com.sysco.b2b.b2b_system.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import lombok.Getter;

@Configuration
@Getter
public class ApiConfig {
    @Value("${api.base-url:api/v1}")
    private String baseUrl; 
}
