package com.zensar.training.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//this class is playing a role of rest controller
public class HelloController {
	
	@RequestMapping("/greet")//from browser when user search or localhost:9081/greet-->the browser will 
	public String sayHello()
	{
		return "Welcome to Rest API";
	}

}
