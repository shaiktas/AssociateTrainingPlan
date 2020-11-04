package com.spring.annotation.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.spring.annotation.example")
public class DepartmentConfig {
  
  @Bean
  public Teacher computerScienceTeacher() {
    return new Teacher()
              .setName("Mr. Coreman")
              .setMobileNo("666 222 1111");
  }

  @Bean
  public Teacher electronicsTeacher() {
    return new Teacher()
              .setName("Mr. Theraja")
              .setMobileNo("666 333 4444");
  }
  
}
