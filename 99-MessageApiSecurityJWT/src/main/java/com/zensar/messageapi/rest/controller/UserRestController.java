package com.zensar.messageapi.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.messageapi.dto.UserRequest;
import com.zensar.messageapi.dto.UserResponse;
import com.zensar.messageapi.security.jwt.util.JwtUtil;

@RestController
@RequestMapping("/api/user")
public class UserRestController {
	
	@Autowired
	private AuthenticationManager manager;
	@Autowired
	private JwtUtil util;
	//we are accepting username and password from user request body
	@PostMapping("/authenticate")
	public UserResponse login(@RequestBody UserRequest userRequest)
	{
		System.out.println("-----------------------");
		System.out.println(userRequest);
		/*
		 * 1 Authenticate user
		 * 2 If user is already authenticated generate token and return it
		 * 3 if user is not authenticated throw exception
		 * */
		//1
		UsernamePasswordAuthenticationToken authenticationToken;
		authenticationToken=new UsernamePasswordAuthenticationToken(userRequest.getUserName(),userRequest.getPassword());
		try {
			manager.authenticate(authenticationToken);//authenticate user
			
			//User is authenticated successfully then generate the token and retuen it back
			String token=util.generateToken(userRequest.getUserName());
			UserResponse userResponse=new UserResponse();
			userResponse.setJwt(token);
			return userResponse;
		}
		catch (Exception e) {
			//Authentication is failed
			
			e.printStackTrace();
			throw e;
		}
		//2
		
		
	}
	

}
