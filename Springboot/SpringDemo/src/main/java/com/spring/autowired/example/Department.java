package com.spring.autowired.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Department {

  @SuppressWarnings("resource")
  public static void main(String[] args) {
    
    ApplicationContext context = new ClassPathXmlApplicationContext("subjectAutowiredbeans.xml");
    Subject sub1 = context.getBean("computer", Subject.class);
    sub1.showSubjectAndTeacher();
    
    Subject sub2 = context.getBean("electronics", Subject.class);
    sub2.showSubjectAndTeacher();
  }
  
}
