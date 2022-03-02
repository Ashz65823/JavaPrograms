package com.zensar.training;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zensar.training.bean.pack4.ContactInfo;
import com.zensar.training.bean.pack4.Person;
import com.zensar.training.util.HibernateUtil;

public class Main4 {
	static void test1() {
		Person person = new Person(101, "John", LocalDate.of(1998, 2, 20), 'M', null);

		ContactInfo contactInfo = new ContactInfo("John@gmail.com", "9764736738");
		person.setContactInfo(contactInfo);

		// data will be save din both table.. here person table will contact info
		// primary key(id) as foreign key to link both table

		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.save(person);
		tx.commit();
		HibernateUtil.cleanUp();

		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<Done>>>>>>>>>>>>>>>>>>>>>>>>");
	}

	static void test2() {
		ContactInfo contactInfo = new ContactInfo("Jeya2001@gmail.com", "8765819103");

		// data will be saved only in contact info. person will not have any data for
		// this object

		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.save(contactInfo);
		tx.commit();
		HibernateUtil.cleanUp();

		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<Done>>>>>>>>>>>>>>>>>>>>>>>>");
	}

	static void test3() {
		Person person = new Person(102, "Jeya", LocalDate.of(2002, 2, 12), 'F', null);

		HibernateUtil.init();
		Session session = HibernateUtil.getSession();

		ContactInfo contactInfo = session.load(ContactInfo.class, 2);// trying to load contact info of id 2 to into
																		// person
		person.setContactInfo(contactInfo);
		Transaction tx = session.beginTransaction();
		session.save(person);
		tx.commit();
		HibernateUtil.cleanUp();

		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<Done>>>>>>>>>>>>>>>>>>>>>>>>");
	}

	static void test4() {

		// loading contact info class

		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		ContactInfo contactInfo = session.load(ContactInfo.class, 2);
		System.out.println(contactInfo);
		HibernateUtil.cleanUp();
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<Done>>>>>>>>>>>>>>>>>>>>>>>>");
	}

	static void test5() {

		//loading person class 
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		Person person = session.load(Person.class, 102);
		System.out.println(person);//this will have all the person info along with contact-info
		System.out.println(person.getContactInfo());//this print contact info alone
		HibernateUtil.cleanUp();
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<Done>>>>>>>>>>>>>>>>>>>>>>>>");
	}

	static void test6() {

		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		Person person = session.load(Person.class, 102);
		Transaction tx=session.beginTransaction();
		session.delete(person);
		//delete data from both table,--because we are giving cascard="All"
		tx.commit();
		HibernateUtil.cleanUp();
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<Done>>>>>>>>>>>>>>>>>>>>>>>>");
	}

	public static void main(String[] args) {
		// test1();
		// test2();
		//test3();
		//test4();
		//test5();
		test6();
	}

}
