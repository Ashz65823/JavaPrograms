package com.zensar.rest.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String hello()
	{
		return "Welcome to Google OAuth";
	}
	
	@GetMapping("/details")
	public Principal getDetails(Principal p){
		return  p;
	}

}
