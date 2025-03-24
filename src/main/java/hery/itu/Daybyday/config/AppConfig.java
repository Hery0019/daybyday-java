package hery.itu.Daybyday.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

import hery.itu.Daybyday.interceptor.LoggingInterceptor;

@Configuration
public class AppConfig {
    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate(
            new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory())
        );
        restTemplate.setInterceptors(Collections.singletonList(new LoggingInterceptor()));
        return restTemplate;
    }
}