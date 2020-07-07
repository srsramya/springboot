package com.unimoni.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.unimoni.model.Student;

@RestController
public class StudentController {

	
	@PostMapping("/students")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {

		return null;
	}

	@GetMapping("/students/{email}/{phone}")
	public ResponseEntity<Student> getStudent(@PathVariable("email") String email,
			@PathVariable("phone") String phoneNumber) {
	
		
		return null;
	}

}
