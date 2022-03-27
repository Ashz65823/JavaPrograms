package com.zensar.messageapi.rest.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.messageapi.dto.Message;
import com.zensar.messageapi.enity.ZensarMessages;
import com.zensar.messageapi.repository.ZensarMessageRepository;

@RestController
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

	@GetMapping
	public List<ZensarMessages> findAll() {
		System.out.println("In findAll of Message rest controller");
		this.messages=repo.findAll();
		//throw new RuntimeException();
		return this.messages;
	}
	@DeleteMapping("/{id}")
	public void deleteMessageById(@PathVariable int id)
	{
		this.repo.deleteById(id);
	}

	@PutMapping()
	public ZensarMessages updateMessage(@RequestBody ZensarMessages msg)
	{
		return this.repo.save(msg);
	}
	@GetMapping("/{id}")
	public ZensarMessages findById(@PathVariable int id)
	{
		return this.repo.findById(id).get();
	}
	@PostMapping()
	public ZensarMessages createMessage(@RequestBody ZensarMessages msg)
	{
		return this.repo.save(msg);
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
