package com.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity 
@Table(name = "emp")
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Integer id;
  
  @Column(name = "name")
	private String name;
  
  @Column(name = "age")
	private Integer age;
  
  @Column(name = "salary")
	private Integer salary;
	
	public Employee() {
    super();
  }
	
  public Employee(String name, Integer age, Integer salary) {
    super();
    this.name = name;
    this.age = age;
    this.salary = salary;
  }



  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Integer getSalary() {
		return salary;
	}
	
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
}
