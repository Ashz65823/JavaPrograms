package com.zensar.training;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zensar.training.bean.pack5.ContactInfo;
import com.zensar.training.bean.pack5.Person;
import com.zensar.training.util.JPAUtil;


public class Main5 {
	static void test1() {
		Person person=new Person(101, "John", LocalDate.of(1998, 2, 20), 'M', null);
		
		ContactInfo contactInfo=new ContactInfo("John@gmail.com", "9764736738");
		person.setContactInfo(contactInfo);
	
		
		EntityManager em=JPAUtil.createEntityManager("PU");
		
		em.getTransaction().begin();
		em.persist(person);
		em.getTransaction().commit();
		JPAUtil.shutDown();
		
	}
	
	static void test2() {
		ContactInfo contactInfo=new ContactInfo("Jeya2001@gmail.com", "8765819103");
		
		EntityManager em=JPAUtil.createEntityManager("PU");
		
		//Person person=em.find(Person.class, 102);
		
		em.getTransaction().begin();
		em.persist(contactInfo);
		em.getTransaction().commit();
		JPAUtil.shutDown();
		
	}
	
	static void test3() {
		Person person=new Person(102,"Jeya", LocalDate.of(2002, 2, 12), 'F', null);
		
		EntityManager em=JPAUtil.createEntityManager("PU");
		ContactInfo contactInfo=em.find(ContactInfo.class, 2);
		person.setContactInfo(contactInfo);
		
		em.getTransaction().begin();
		em.persist(person);
		em.getTransaction().commit();
		JPAUtil.shutDown();
		
	}
	
	

	static void test4() {
		
		
		EntityManager em=JPAUtil.createEntityManager("PU");
		
		
		ContactInfo contactInfo=em.find(ContactInfo.class, 2);
		
	
		
		System.out.println(contactInfo);
		
		JPAUtil.shutDown();
		
	}
	
	static void test5() {
		
		
		EntityManager em=JPAUtil.createEntityManager("PU");
		
		Person person=em.find(Person.class, 102);
		
		
		
		
		
		System.out.println(person);
		System.out.println(person.getContactInfo());
		JPAUtil.shutDown();
		
	}
	
	
	static void test6() {
		
		
		EntityManager em=JPAUtil.createEntityManager("PU");
		
		Person person=em.find(Person.class, 101);
		
		
		em.getTransaction().begin();
		em.remove(person);
		em.getTransaction().commit();
		
		
		
		JPAUtil.shutDown();
		
	}
	

	public static void main(String[] args) {
		test6();

	}

}
/*
 * 3 tables will be created--person,contact and a table for person id and contact-info id
 * Test1-- All info is added in all 3 table
 * Test2-- Add data only in contact-info table
 * Test3-- Insert into person and join table
 * Test4-- All the information from contact info is displayed 
 * Test5-- All the information is displayed
 * Test6-- Delete the record in all the table
 * 
 * */
 