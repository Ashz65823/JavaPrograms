package com.zensar.messageapi.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.messageapi.enity.ZensarMessages;
import com.zensar.messageapi.repository.ZensarMessageRepository;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController//Rest Web service end point
//this url portion is common for all the method of this class
//hence it is written in top of class with @RequestMapping
@RequestMapping("/api/message")//This is used to avoid writing in other mapping
public class MessageRestController {
	private List<ZensarMessages> messages;
	
	@Autowired
	ZensarMessageRepository repo;
	
	public MessageRestController() {
		this.messages = new ArrayList<>();
		/*
		 * Message m1 = new Message(); m1.setId(1); m1.setName("Good Morning");
		 * 
		 * Message m2 = new Message(); m2.setId(2); m2.setName("Good Afternoon");
		 * 
		 * Message m3 = new Message(); m3.setId(3); m3.setName("Good Evening");
		 * 
		 * Message m4 = new Message(); m4.setId(4); m4.setName("Good Night");
		 * 
		 * this.messages.add(m1); this.messages.add(m2); this.messages.add(m3);
		 * this.messages.add(m4);
		 */

	}
	/*
	 * All the method of rest controller should return data along with appropriate http status code
	 * To do that method should return object of responceEntity
	 * ResponceEntity is a class given by spring
	 * its constructor accept 2 arguments first body(data) second Http status code
	 * */
	//Http status code 200
	@ApiOperation(value="This fetch messages from database")
	@GetMapping
	public ResponseEntity<List<ZensarMessages>> findAll() {
		System.out.println("In findAll of Message rest controller");
		this.messages=repo.findAll();
		ResponseEntity<List<ZensarMessages>> responseEntity=new ResponseEntity<List<ZensarMessages>>(this.messages,HttpStatus.OK);
		//throw new RuntimeException();
		return responseEntity;
	}
	/*
	 * http service with 204*/
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteMessageById(@PathVariable int id)
	{
		
		ResponseEntity<Void> responseEntity=new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		this.repo.deleteById(id);
		return responseEntity;
	}
	/*http code 200
	 * */
	@PutMapping()
	public ResponseEntity<ZensarMessages> updateMessage(@RequestBody ZensarMessages msg)
	{
		ZensarMessages updatemsg=this.repo.save(msg);
		ResponseEntity<ZensarMessages> responseEntity=new ResponseEntity<>(updatemsg,HttpStatus.ACCEPTED);
		return responseEntity;
	}
	@ApiOperation(value="This Find messages from database using Id")
	@GetMapping("/{id}")
	public ResponseEntity<ZensarMessages> findById(@ApiParam(value="This is an Id bases on which message will be fetch",required = true)
	@PathVariable int id)
	{
		ZensarMessages foundMsg=this.repo.findById(id).get();
		ResponseEntity<ZensarMessages> responseEntity=new ResponseEntity<ZensarMessages>(foundMsg,HttpStatus.OK);
		return responseEntity;
	}
	/*
	 * Any method wch create a new resource on server should return http 
	 * Status with 201
	 * */
	@PostMapping()
	public ResponseEntity<ZensarMessages> createMessage(@RequestBody ZensarMessages msg)
	{
		ZensarMessages createdmsg=this.repo.save(msg);
		ResponseEntity<ZensarMessages> responseEntity=new ResponseEntity<>(createdmsg,HttpStatus.CREATED);
		return responseEntity;
	}
	
	//It is recommended to use @ExceptionHandler to handle exception in spring controller
	//This method automatically execute if any of the controller method throws Exception type mentioned in @Exception Handler
	//Following method acts as exception handler ONLY for this Controller method i.e.,here(MessageRestController)
	/*
	 * @ExceptionHandler(Exception.class) public ResponseEntity<String>
	 * handleException() { System.out.println("In Handel Exception");
	 * ResponseEntity<String> responseEntity=new
	 * ResponseEntity<String>("Please try again........",HttpStatus.
	 * INTERNAL_SERVER_ERROR); return responseEntity; }
	 */
	
	/*
	 * @DeleteMapping("/{id}") public void deleteMessageById(@PathVariable int id) {
	 * System.out.println("In delete passage" + id); Iterator<ZensarMessages>
	 * iterator = this.messages.iterator(); while (iterator.hasNext()) { Message
	 * message = iterator.next(); if (message.getId() == id) { iterator.remove(); }
	 * } }
	 * 
	 * @PutMapping() public Message updateAll(@RequestBody Message msg) {
	 * Iterator<Message> iterator = this.messages.iterator(); while
	 * (iterator.hasNext()) { Message message = iterator.next();
	 * if(message.getId()==msg.getId()) { message.setName(msg.getName()); } }
	 * 
	 * return msg; }
	 */

}
