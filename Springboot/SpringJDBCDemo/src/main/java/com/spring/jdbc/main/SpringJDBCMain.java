package com.spring.jdbc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.EmployeeDaoImpl;
import com.spring.jdbc.model.Employee;

public class SpringJDBCMain {
  
  @SuppressWarnings("unused")
  public static void main(String[] args) {
    
    ApplicationContext context = new ClassPathXmlApplicationContext("springjdbc.xml");
    EmployeeDaoImpl empDaoImpl = context.getBean("employeeDaoImpl", EmployeeDaoImpl.class);
    
    Employee emp = new Employee().setName("Ricky")
                                 .setAge(30)
                                 .setSalary(15000);
    
    
//    empDaoImpl.insert(emp);
    
    System.out.println(empDaoImpl.fetchEmployee("Taylor"));
    
    
  }

}
