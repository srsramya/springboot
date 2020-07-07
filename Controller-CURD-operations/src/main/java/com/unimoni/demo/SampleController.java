package com.unimoni.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	
	@RequestMapping("/hello")
	public String sayHello() {
		
		return "Hello, My first API";
	}
	
	
	
}
