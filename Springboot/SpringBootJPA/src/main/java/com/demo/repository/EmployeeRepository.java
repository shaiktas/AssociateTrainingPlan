package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
  
  @Query("SELECT t FROM Employee t WHERE t.name = :name")
  Employee fetchByName(@Param("name") String name);

}
