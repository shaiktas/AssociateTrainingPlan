package com.spring.annotation.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Department {

  public static void main(String[] args) {
    
    @SuppressWarnings("resource")
    ApplicationContext context = new AnnotationConfigApplicationContext(DepartmentConfig.class);
    Subject sub1 = context.getBean("comp", Subject.class);
    sub1.showSubjectAndTeacher();
    
    Subject sub2 = context.getBean("electronics", Subject.class);
    sub2.showSubjectAndTeacher();
  }
  
}
