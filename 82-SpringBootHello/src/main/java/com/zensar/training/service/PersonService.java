package com.zensar.training.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.training.bean.Person;
import com.zensar.training.db.PersonDAO;

@Service
public class PersonService {
	@Autowired
	PersonDAO dao;

	public PersonDAO getDao() {
		return dao;
	}

	public void setDao(PersonDAO dao) {
		this.dao = dao;
	}

	public Person addPerson(Person person) {
		Person person2 = null;
		person2 = dao.save(person);// insert if record not found
		return person2;
	}

	public Person UpdatePerson(Person person) {
		Person person2 = null;
		person2 = dao.save(person);// update if found
		return person2;
	}

	public boolean deletePerson(Person person) {
		boolean result = true;
		try {
			dao.delete(person);
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		}
		return result;
	}

	public Person findById(int id) {
		Optional<Person> optional;//Predefined interface when we try to find something we use optional becoz we might find or not find   //may or may not find id
		optional = dao.findById(id);
		if (optional.isPresent())//check 
			return optional.get();
		else
			return null;
	}

	public List<Person> findAllPersons() {
		return this.dao.findAll();
	}
}
