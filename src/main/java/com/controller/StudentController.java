package com.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	 @GetMapping("/hello")
	    public String hello() {
	        return "Spring Boot API Running Successfully-lang";
	    }
	 
	 @GetMapping("/lang")
	    public List<String> getLanguages() {

	        return Arrays.asList(
	                "Java",
	                "Python",
	                "Spring Boot",
	                "AWS",
	                "Docker"
	        );
	    }
}
