package com.unimoni.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unimoni.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
