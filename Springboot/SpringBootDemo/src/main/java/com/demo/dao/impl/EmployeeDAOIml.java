package com.demo.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.dao.EmployeeDAO;
import com.demo.model.Employee;

@Repository
public class EmployeeDAOIml implements EmployeeDAO{

  @Autowired
  public NamedParameterJdbcTemplate jdbcTemplate;
  
  private static final String INSERT_EMPLOYEE_SQL = "INSERT INTO EMPLOYEE(name,age,salary) VALUES (:name, :age, :salary) ";
  
  private static final String FETCH_EMPLOYEE_SQL = "SELECT * FROM EMPLOYEE WHERE name = :name ";
  
  private static final String FETCH_ALL_EMPLOYEE_SQL = "SELECT * FROM EMPLOYEE";

  
  @Override
  public void addEmployee(Employee emp) {
    jdbcTemplate.update(INSERT_EMPLOYEE_SQL, new BeanPropertySqlParameterSource(emp));
    
  }

  @Override
  public Employee fetchEmployee(String name) {
    MapSqlParameterSource params = new MapSqlParameterSource();
    params.addValue("name", name);
    Employee emp = jdbcTemplate.queryForObject(FETCH_EMPLOYEE_SQL, params, new BeanPropertyRowMapper<>(Employee.class));
    
    return emp;
  }

  @Override
  public List<Employee> fetchAllEmployee() {
    List<Employee> result = jdbcTemplate.query(FETCH_ALL_EMPLOYEE_SQL, new BeanPropertyRowMapper<>(Employee.class));
    
    System.out.println("Total employee from DB " + result);
    
    return result;
  }

}
