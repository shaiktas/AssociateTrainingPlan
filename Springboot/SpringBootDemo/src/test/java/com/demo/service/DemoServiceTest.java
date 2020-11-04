package com.demo.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.dao.EmployeeDAO;
import com.demo.main.DemoApplication;
import com.demo.model.Employee;
import com.demo.service.DemoService;


@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = DemoApplication.class)
public class DemoServiceTest {
  
  @Autowired
  private DemoService demoService;
  
  @MockBean
  private EmployeeDAO empDAO;
  
  @Test
  public void registerEmployeeTest() throws IOException {
    String request = "{\"name\": \"testUser\", \"age\" : 20, \"salary\" :16000}";
    Employee emp = new Employee().setName("testUser").setAge(20).setSalary(16000);
    
    assertEquals(emp, demoService.create(request));
    
  }
  
  @Test
  public void fetchEmployeeTest() throws IOException {
    String name = "testUser";
    Employee emp = new Employee().setName("testUser").setAge(20).setSalary(16000);
    when(empDAO.fetchEmployee(name)).thenReturn(emp);
    
    assertEquals(emp, demoService.fetch(name));
  }

  @Test
  public void fetchAllEmployeeTest() throws IOException {

    Employee emp1 = new Employee().setName("testUser1").setAge(20).setSalary(16000);
    Employee emp2 = new Employee().setName("testUser1").setAge(20).setSalary(16000);
    when(empDAO.fetchAllEmployee()).thenReturn(Stream.of(emp1,emp2).collect(Collectors.toList()));
    
    assertEquals(2, demoService.fetchAll().size());
  }
  
}
