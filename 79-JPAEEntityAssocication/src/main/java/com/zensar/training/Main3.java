package com.zensar.training;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zensar.training.bean.pack3.ContactInfo;
import com.zensar.training.bean.pack3.Person;

import com.zensar.training.util.JPAUtil;

public class Main3 {
	static void test1() {
		Person person = new Person(101, "John", LocalDate.of(1998, 2, 20), 'M', null);
		ContactInfo contactInfo = new ContactInfo("John@gmail.com", "9764736738", null);// person id will be primary key
																						// for contact info
		person.setContactInfo(contactInfo);
		contactInfo.setPerson(person);

		EntityManager em = JPAUtil.createEntityManager("PU");
		em.getTransaction().begin();
		em.persist(person);
		em.getTransaction().commit();
		JPAUtil.shutDown();

	}

	static void test2() {
		Person person = new Person(102, "Jeya", LocalDate.of(2002, 2, 12), 'F', null);

		EntityManager em = JPAUtil.createEntityManager("PU");
		em.getTransaction().begin();
		em.persist(person);
		em.getTransaction().commit();
		JPAUtil.shutDown();

	}

	static void test3() {
		ContactInfo contactInfo = new ContactInfo("Jeya2001@gmail.com", "8765819103", null);

		EntityManager em = JPAUtil.createEntityManager("PU");
		Person person = em.find(Person.class, 102);
		person.setContactInfo(contactInfo);
		contactInfo.setPerson(person);
		em.getTransaction().begin();
		em.persist(contactInfo);
		em.getTransaction().commit();
		JPAUtil.shutDown();

	}

	static void test4() {

		EntityManager em = JPAUtil.createEntityManager("PU");
		ContactInfo contactInfo = em.find(ContactInfo.class, 102);
		System.out.println(contactInfo);
		System.out.println(contactInfo.getPerson());
		JPAUtil.shutDown();

	}

	static void test5() {
		EntityManager em = JPAUtil.createEntityManager("PU");
		Person person = em.find(Person.class, 102);
		// System.out.println(person);//will display all person and contact info record
		System.out.println(person.getContactInfo());// display only contact info record
		JPAUtil.shutDown();

	}

	static void test6() {

		EntityManager em = JPAUtil.createEntityManager("PU");
		Person person = em.find(Person.class, 102);

		em.getTransaction().begin();
		em.remove(person);
		em.getTransaction().commit();

	}

	public static void main(String[] args) {
		test6();

	}
	/*
	 * test1--inserting into 2 table with same primary key(shared primary key)
	 * test2--insert a row in person table alone test3--contact info will refer to
	 * person table and try to insert the data from person on person id of before
	 * record (102) test4--display all details from person and contact-info
	 * test5--display records of contact-info test6-- delete record from both the
	 * table
	 */
}
