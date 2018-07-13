package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SuppressWarnings("deprecation")
@Configuration
public class CustomCorsConfiguration2 extends WebMvcConfigurerAdapter {
  
 @Override
 public void addCorsMappings(CorsRegistry registry) {
  registry.addMapping("/api/**").allowedOrigins("http://172.17.10.226:8080");
 }
}
 