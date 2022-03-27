package com.zensar.messageapi.rest.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//To handle exception from all the controller in this class

//@RestControllerAdvice
public class ZensarRestControllerAdvice {

	//Following method acts as Generic exception handler ONLY for this Controller method i.e.,here(MessageRestController)
	//This is how we write generic exception handler
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleException()
	{
		System.out.println("In Handel Exception");						//Body							http status
		ResponseEntity<String> responseEntity=new ResponseEntity<String>("Please try again........",HttpStatus.INTERNAL_SERVER_ERROR);
		return responseEntity;
	}
}
