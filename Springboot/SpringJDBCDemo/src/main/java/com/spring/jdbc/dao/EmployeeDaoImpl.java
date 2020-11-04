package com.spring.jdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.jdbc.model.Employee;

@Component
public class EmployeeDaoImpl {
  
  @Autowired
  private JdbcTemplate jdbcTemplate ;
  
  public void insert(Employee emp) {
    String query = "INSERT INTO employee(name,age,salary) VALUES (?,?,?)";
    jdbcTemplate.update(query, emp.getName().toString(),Integer.valueOf(emp.getAge()),Integer.valueOf(emp.getSalary()));
    
  }
  
  public Employee fetchEmployee(String name) {
    String query = "SELECT * FROM employee WHERE name = ?";
    Employee emp = jdbcTemplate.queryForObject(query, new Object[]{name}, BeanPropertyRowMapper.newInstance(Employee.class));
    
    return emp;
    
  }
  
}
