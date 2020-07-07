package com.unimoni.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unimoni.model.Employee;
import com.unimoni.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository empRepository;

	public Employee createEmployee(Employee emp) {

		return empRepository.save(emp);
	}

	public Employee getEmployee(Integer id) {
		Optional<Employee> emp = empRepository.findById(id);
		if (emp.isPresent()) {
			return emp.get();
		}
		return null;
	}

	public Employee updateEmployee(Integer id, Employee e) {
		e.setId(id);
		return empRepository.save(e);

	}

	public void deleteEmployee(Integer id) {

		empRepository.deleteById(id);
	}

}
