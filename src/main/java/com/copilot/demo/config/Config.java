package com.copilot.demo.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {

    //Add bean for RestTemplate and return new RestTemplate()
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    //Add mapper bean for ObjectMapper and return new ObjectMapper()
    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }

    // Add bean for threadPoolTaskExecutor and return new ThreadPoolTaskExecutor()
    // Set corePoolSize to 10
    // Set maxPoolSize to 100
    @Bean
    public ThreadPoolTaskExecutor threadPoolTaskExecutor() {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setCorePoolSize(10);
        threadPoolTaskExecutor.setMaxPoolSize(100);
        return threadPoolTaskExecutor;
    }

}
