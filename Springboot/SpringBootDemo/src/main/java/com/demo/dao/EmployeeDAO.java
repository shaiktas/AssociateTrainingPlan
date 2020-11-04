package com.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.model.Employee;

@Repository
public interface EmployeeDAO {

  public void addEmployee(Employee emp);
  
  public Employee fetchEmployee(String name);
  
  public List<Employee> fetchAllEmployee();
}
