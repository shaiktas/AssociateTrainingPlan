package com.spring.annotation.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Electronics implements Subject{

  @Autowired
  @Qualifier("electronicsTeacher")
  private Teacher teacher;
  
  @Value(value = "Basic Electronics")
  private String name;

  @Override
  public void showSubjectAndTeacher() {
    System.out.println("Subject name is "+ name + " and teacher name is " + teacher.getName() + " Mob: " + teacher.getMobileNo());
  }
}
