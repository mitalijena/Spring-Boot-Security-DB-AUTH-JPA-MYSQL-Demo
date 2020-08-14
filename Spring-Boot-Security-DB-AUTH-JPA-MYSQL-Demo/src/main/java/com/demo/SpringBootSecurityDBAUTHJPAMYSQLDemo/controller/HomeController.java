package com.demo.SpringBootSecurityDBAUTHJPAMYSQLDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "Welcome Home";
	}
	
	@GetMapping("/user")
	public String userHome() {
		return "Welcome User";
	}
	
	@GetMapping("/admin")
	public String adminHome() {
		return "Welcome Admin";
	}

}
