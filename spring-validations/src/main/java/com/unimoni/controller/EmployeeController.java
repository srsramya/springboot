package com.unimoni.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.springframework.http.ResponseEntity;
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

@RestController
@Validated
public class EmployeeController {

	List<Employee> listOfemp = new ArrayList<>();

	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("E1");
		Employee e2 = new Employee();
		e2.setId(2);
		e2.setName("E2");
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		return list;
	}

	@RequestMapping(value = "/employees2", method = RequestMethod.GET)
	public ResponseEntity<List<Employee>> getEmployees2(@Size(min = 2, message = "Need minimum 2 chars") @RequestParam String name) {
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("E1");
		Employee e2 = new Employee();
		e2.setId(2);
		e2.setName("E2");
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);

		// logic to filterout names
		List<Employee> result = new ArrayList<>();
		for (Employee e : list) {
			if (e.getName().startsWith(name)) {
				result.add(e);
			}
		}
		return ResponseEntity.status(200).body(result);
	}

	@PostMapping("/employees")
	public ResponseEntity<Employee> createEmployee(@Valid @RequestBody Employee emp) {
		listOfemp.add(emp);
		emp.setId(listOfemp.size());
		return ResponseEntity.status(201).body(emp);

	}

	@RequestMapping(value = "/employees/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee emp, @PathVariable("id") Integer id) {

		// update logic

		return ResponseEntity.status(200).body(emp);

	}

	@DeleteMapping("/employees/{id}")
	public ResponseEntity deleteEmployee(@RequestBody Employee emp, @PathVariable("id") Integer id) {
		// Delete logic
		return ResponseEntity.status(204).build();

	}

}
