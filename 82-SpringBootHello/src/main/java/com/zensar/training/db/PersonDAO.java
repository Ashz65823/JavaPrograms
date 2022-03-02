package com.zensar.training.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.training.bean.Person;

@Repository//equal to component annotation
public interface PersonDAO extends JpaRepository<Person,Integer>//Predefined interface is JpaRepository
{
	//have functional of sql like find findAll etc
	
}
