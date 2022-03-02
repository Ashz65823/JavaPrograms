package com.zensar.training.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController//
public class HelloClientController {
	@GetMapping("sayHello")
	public String f1()
	{
		//Rest Template is used to create applications that consume RESTful Web Services. 
		RestTemplate restTemplate=new RestTemplate();
		String retVal=restTemplate.getForObject("http://localhost:8082/greet/Ashwini", String.class);//previous application-- get object for the application
		return retVal;
	}
}
