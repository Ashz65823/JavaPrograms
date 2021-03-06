package com.zensar.training;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zensar.training.bean.Developer;
import com.zensar.training.util.JPAUtil;


public class Main3 {
	static void insertTest()
	{
		Developer developer=new Developer();
		developer.setName("Abhi");
		developer.setCity("Bangalore");
		developer.addSkill("Testing");
		developer.addSkill("Java");
		developer.addSkill("HTML");
		developer.addSkill("React");
		developer.addSkill("NodeJs");
		
		EntityManager em=JPAUtil.createEntityManager("PU");
		em.getTransaction().begin();
		em.persist(developer);
		em.getTransaction().commit();
		
		JPAUtil.shutDown();

	}
	
	public static void main(String[] args) {
		
		insertTest();
	}

}
