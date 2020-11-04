package com.demo.service;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.EmployeeDAO;
import com.demo.model.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class DemoService {
	
	private final ObjectMapper objMapper = new ObjectMapper();
	
	@Autowired
	private EmployeeDAO empDAO;

	public Employee create(final String request) throws IOException {
	
		Employee emp = objMapper.readValue(request, Employee.class);
		empDAO.addEmployee(emp);
		
		return emp;
	}
	
	public Employee fetch(final String name) throws JsonProcessingException {
	  
		return empDAO.fetchEmployee(name);
	}
	
	public List<Employee> fetchAll() throws JsonProcessingException {
	  
		return empDAO.fetchAllEmployee();
	}
	
}
