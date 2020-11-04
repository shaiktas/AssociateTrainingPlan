package com.spring.annotation.example;


public class Teacher {

  private String name;
  private String mobileNo;

  public String getName() {
    return name;
  }

  public Teacher setName(String name) {
    this.name = name;
    return this;
  }

  public String getMobileNo() {
    return mobileNo;
  }

  public Teacher setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
    return this;
  }
  
}
