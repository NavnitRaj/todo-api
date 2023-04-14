package com.todo.api.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.basic.auth.AuthenticationBean;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class BasicAuthController {
	
	@GetMapping("/basicauth")
	public AuthenticationBean auth() {
		return new AuthenticationBean("Hello World");
	}
}
