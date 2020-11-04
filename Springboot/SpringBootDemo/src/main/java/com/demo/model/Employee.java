package com.demo.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Employee {

	private String name;
	private int age;
	private int salary;
	
	
	public String getName() {
		return name;
	}
	
	public Employee setName(String name) {
		this.name = name;
		return this;
	}
	
	public int getAge() {
		return age;
	}
	
	public Employee setAge(int age) {
		this.age = age;
		return this;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public Employee setSalary(int salary) {
		this.salary = salary;
		return this;
	}
	
	@Override
  public boolean equals(Object obj) {
    if (obj == null)
      return false;
    if(obj == this) 
      return true; 
    if (!(this.getClass().isAssignableFrom(obj.getClass())))
      return false;

    Employee emp = (Employee) obj;
    return new EqualsBuilder()
        .append(this.getName(), emp.getName())
        .append(this.getAge(), emp.getAge())
        .append(this.salary, emp.salary)
        .isEquals();
  }
	
	
	 @Override
	  public int hashCode() {
	    return new HashCodeBuilder(23, 11)
	        .append(this.name)
	        .append(this.age)
	        .append(this.salary)
	        .toHashCode();
	  }
	
}
