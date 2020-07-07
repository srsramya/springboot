package com.unimoni.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;
import javax.validation.constraints.Positive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.unimoni.model.Employee;
import com.unimoni.service.EmployeeService;

@RestController
@Validated
public class EmployeeController {

	@Autowired
	EmployeeService empService;

	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getEmployees(@RequestParam(required = false) Integer pageNumber,
			@RequestParam(required = false) Integer numberOfRecords,
			@RequestParam(required = false, value = "email") String email) {

		return null;
	}

	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployee(
			@NonNull @Positive(message = "id should be positive") @PathVariable("id") Integer id) {
		Employee e = empService.getEmployee(id);
		return ResponseEntity.status(200).body(e);

	}

	@PostMapping("/employees")
	public ResponseEntity<Employee> createEmployee(@Valid @RequestBody Employee emp) {
		Employee emp1 = empService.createEmployee(emp);
		return ResponseEntity.status(201).body(emp1);
	}

	@RequestMapping(value = "/employees/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee emp, @PathVariable("id") Integer id) {
		Employee emp1 = empService.updateEmployee(id, emp);
		return ResponseEntity.status(200).body(emp1);

	}

	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable("id") Integer id) {
		empService.deleteEmployee(id);
		return ResponseEntity.status(204).body(null);
	}

}
