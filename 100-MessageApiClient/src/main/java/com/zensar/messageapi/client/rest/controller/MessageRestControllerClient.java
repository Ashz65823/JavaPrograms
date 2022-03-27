package com.zensar.messageapi.client.rest.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.zensar.messageapi.client.web.request.UserRequest;
import com.zensar.messageapi.client.web.responce.UserResponce;

@RestController
@RequestMapping("/api/messageClient")
public class MessageRestControllerClient {

	@GetMapping
	public String fetchMessages() {
		// Todo
		// Fetch all messages from server application running on port 8083
		// RestTemplate is class given by spring
		// -It is used for consuming web service
		/*
		 * Steps for 1 to call http://localhost:8083/api/authenticate-->post mapping 2
		 * Fetch token 3 Pass token calling http://localhost:8083/api/message pass token
		 * using Authorization header while accessing http://localhost:8083/api/message
		 */
		RestTemplate rt = new RestTemplate();
		UserRequest userRequest = new UserRequest();
		userRequest.setUserName("zensar");
		userRequest.setPassword("zensar");

		UserResponce userResponce = rt.postForObject("http://localhost:8083/api/user/authenticate", userRequest,
				UserResponce.class);
		System.out.println(userResponce.getJwt());

		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "Bearer " + userResponce.getJwt());
		HttpEntity<String> entity = new HttpEntity<>(header);
		String respone = rt.exchange("http://localhost:8083/api/message", HttpMethod.GET, entity, String.class)
				.getBody();
		return "fetch data" + respone;
	}

	@GetMapping("/{id}")
	public String fetchMessageById(@PathVariable int id) {
		// Todo- Fetch data from server app based on message id
		RestTemplate rt = new RestTemplate();
		UserRequest userRequest = new UserRequest();
		userRequest.setUserName("zensar");
		userRequest.setPassword("zensar");

		UserResponce userResponce = rt.postForObject("http://localhost:8083/api/user/authenticate", userRequest,
				UserResponce.class);
		System.out.println(userResponce.getJwt());

		HttpHeaders header = new HttpHeaders();
		header.add("Authorization", "Bearer " + userResponce.getJwt());
		HttpEntity<String> entity = new HttpEntity<>(header);
		String respone = rt.exchange("http://localhost:8083/api/message/" + id, HttpMethod.GET, entity, String.class)
				.getBody();
		System.out.println(respone);
		return "fetch data" + respone;
	}
}
