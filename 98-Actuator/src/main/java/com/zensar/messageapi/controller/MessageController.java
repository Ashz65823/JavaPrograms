package com.zensar.messageapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zensar.messageapi.enity.ZensarMessages;
import com.zensar.messageapi.repository.ZensarMessageRepository;

@Controller//Web Application we are trying to create
@RequestMapping("/message/")
public class MessageController {
	
	@Autowired
	private ZensarMessageRepository repo;

	// This method is used to show add page
	@GetMapping( "create")
	public String showCreateMessage(Model m) {
		m.addAttribute("message", new ZensarMessages());// Backing object to html-->Backing object sent to view
		return "create";
	}

	// This is used to perform insertion operation in DB
	@PostMapping("add")
	public String performAddMessage(@ModelAttribute ZensarMessages m) {
		repo.save(m);
		return "redirect:/message/all";
	}

	// to show all
	@GetMapping("all")
	public String showAllMessages(Model m) {
		List<ZensarMessages> all = repo.findAll();
		m.addAttribute("messages", all);// we are returning view name.IT MUST be present in templetes
		return "messages";
	}

	// to delete
	// @RequestParam is used for fetching request parameters
	@GetMapping("delete")
	public String deleteById(@RequestParam int id) {
		// to do delete message from DB using id we have recived
		System.out.println("Deleting messages with id= " + id);
		repo.deleteById(id);
		return "redirect:/message/all";// this is the syntax of redirection in spring
	}

	// this is used for update
	@GetMapping("update")
	public String updateById(@RequestParam int id,Model m,@ModelAttribute ZensarMessages model) {
		ZensarMessages msg=repo.findById(id).get();
		m.addAttribute("message", msg);
		repo.save(model);
		return "update";
	}

//------------------------------------------------------Example page------------------------------------------------	
	@GetMapping("/hi")
	public String hello(Model m) {
		System.out.println("In hello()");
		// what ever we are returning from this method is View
		// This View is in the form of HTML file
		// And HTML view MUST be present in--->src/main/resources/templates
		// welcome.html
		// Following method has two argument
		// key->This is used in html to fetch the value
		// Value
		m.addAttribute("title", "Welcome to MesageAPI from zensar");
		return "welcome";
	}

}
