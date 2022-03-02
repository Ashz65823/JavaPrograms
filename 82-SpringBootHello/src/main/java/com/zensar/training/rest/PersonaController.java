package com.zensar.training.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.zensar.training.bean.Gender;
import com.zensar.training.bean.Person;
import com.zensar.training.service.PersonService;

@RestController
public class PersonaController {
	@Autowired
	PersonService service;
	
	
	public PersonService getService() {
		return service;
	}
	public void setService(PersonService service) {
		this.service = service;
	}
	
	@GetMapping(value = "/getAll",produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})//the data should be send in xml format the specify mediaType by default it is json
	public List<Person> getPersons()
	{
		return this.service.findAllPersons();
	}
	
	@GetMapping(value = "/getPerson/{pid}",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})//Available in xml and json format
	public Person findPerson(@PathVariable(name="pid") int id)//pid to specify the id in path
	{
		return this.service.findById(id);
	}
	
	@PostMapping(value = "/add",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public Person addNewPerson(@RequestBody Person person)
	{
		return this.service.addPerson(person);
	}
	
	@PutMapping(value = "/update",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public Person updateNewPerson(@RequestBody Person person)
	{
		return this.service.UpdatePerson(person);
	}
	
	@DeleteMapping(value = "/delete/{pid}")
	public boolean deletePerson(@PathVariable(name="pid") int id)
	{
		return this.service.deletePerson(new Person(id));
	}
}
/*@RequestMapping(value="/getAll",method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE})//method by default is get for other we have to set is as put or something
//@RequestMapping(value="/getPerson/{pid}",method = RequestMethod.GET)//take this to url
*/	
/*
 * @SpringBootApplication: It is a combination of three annotations
 *  @EnableAutoConfiguration, @ComponentScan, and @Configuration.
 * */
 