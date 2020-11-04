package com.demo.service;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Employee;
import com.demo.repository.EmployeeRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class DemoService {
	
	private final ObjectMapper objMapper = new ObjectMapper();
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public Response create(final String request) throws IOException {
	
		Employee emp = objMapper.readValue(request, Employee.class);
		employeeRepository.save(emp);
		
		return Response.status(Status.OK).type(MediaType.APPLICATION_JSON).entity("Successfully added employee").build();
	}
	
	public Employee fetch(final String name) throws JsonProcessingException {
	  
		return employeeRepository.fetchByName(name);
	}
	
	public List<Employee> fetchAll() throws JsonProcessingException {
	  
		return (List<Employee>) employeeRepository.findAll();
	}
	
}
