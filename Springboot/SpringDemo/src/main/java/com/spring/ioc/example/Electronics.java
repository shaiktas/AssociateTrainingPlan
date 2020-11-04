package com.spring.ioc.example;

public class Electronics implements Subject{

  private Teacher teacher;
  private String name;

  
  public void setTeacher(Teacher teacher) {
    this.teacher = teacher;
  }
  
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void showSubjectAndTeacher() {
    System.out.println("Subject name is "+ name + " and teacher name is " + teacher.getName() + " Mob: " + teacher.getMobileNo());
  }
}
