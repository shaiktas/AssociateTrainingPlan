package com.spring.jdbc.model;


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
  public String toString() {
    return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
  }
	
}
