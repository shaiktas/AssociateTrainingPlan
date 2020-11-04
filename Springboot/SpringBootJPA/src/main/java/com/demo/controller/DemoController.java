package com.demo.controller;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Employee;
import com.demo.service.DemoService;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
public class DemoController {

	@Autowired
	private DemoService demoService;

	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public Object registerEmployee(@RequestBody String request) throws IOException {

		return demoService.create(request).getEntity();
	}

	@RequestMapping(value = "/employee/{name}", method = RequestMethod.GET)
	public Object getEmployee(@PathVariable("name") String name) throws JsonProcessingException {

	  Employee result = demoService.fetch(name);
		return Response.status(Status.OK).type(MediaType.APPLICATION_JSON).entity(result).build().getEntity();
	}

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Object getAllEmployee() throws JsonProcessingException {

		List<Employee> result = demoService.fetchAll();
		return Response.status(Status.OK).type(MediaType.APPLICATION_JSON).entity(result).build().getEntity();
	}

}
