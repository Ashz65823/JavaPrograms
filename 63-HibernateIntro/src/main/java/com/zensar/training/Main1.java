package com.zensar.training;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

import com.zensar.training.bean.Contact;
import com.zensar.training.util.HibernateUtil;

public class Main1 {
	//how to add record
		static void insert()
		{
			Contact contact=new Contact("Mary", 51, "97007909230");
			
			HibernateUtil.init();
			Session session=HibernateUtil.getSession();
		 Transaction tx=session.beginTransaction();
		 session.save(contact);//save record in db but it is in buffer area-->not directly added into table there is a transaction
		 tx.commit();
		 session.close();
		 HibernateUtil.cleanUp();
		 System.out.println("Contact Saved to DB");
		}
	
	public static void main(String[] args) {
		
		//insert();
		//read();
		//readAll();
		//update();
		//delete();

	}

	//add new record
	static void read()
	{
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		Contact contact=session.load(Contact.class, 1);//execute the select statement-->putting data in contact object-->contact.class will load the structure 
		System.out.println(contact);
		
		session.close();
		HibernateUtil.cleanUp();
	}
	
	static void readAll()
	{
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		String str="from Contact";//all contact object from contact
		Query query=session.createQuery(str);
		  List<Contact> allContacts=query.list();//return the contact list from contact table
		  System.out.println(allContacts);
		
		session.close();
		HibernateUtil.cleanUp();
	}
	
	static void update()
	{
	HibernateUtil.init();
	Session session=HibernateUtil.getSession();
	 Contact contact=session.load(Contact.class, 3);
	 contact.setName(contact.getName().toUpperCase());
	 contact.setAge(50);
	 
	 Transaction tx=session.beginTransaction();
	 session.update(contact);
	 tx.commit();
	 HibernateUtil.cleanUp();
	}
	static void delete()
	{
	HibernateUtil.init();
	Session session=HibernateUtil.getSession();
	 Contact contact=session.load(Contact.class, 4);
	 Transaction tx=session.beginTransaction();
	 session.delete(contact);
	 tx.commit();
	 HibernateUtil.cleanUp();
	 
	}
	
	
	/*
	 * Execute the select query this is done is session load-->this is sent to contact object 
	 * Contact is entity class-->If configerd hibernate
	 * entity class should have no argument constructor
	 * 
	 * Contact class it is used to identify the structure of the tbl-->This actually refer to hybernate.cnf.xml this in turn refer to contact.hbm.xml for the structure
	 * Session load is used to select query
	 * it fetch all data from table "session.load(Contact.class, 1)"->used to read excatly the record of id 1
	 * "String str="from Contact";"-->To store the query select * from Contacts 
	 * "ServiceRegistry registry;//predefined interface-->Used to create a metadata source
		SessionFactory sessionFactory;
		registry = new StandardServiceRegistryBuilder().configure().build();//look for hibernate.cng.xml
		MetadataSources metaSources = new MetadataSources(registry);//create mete source object-->details about db we connect-->configaration
		Metadata metaData = metaSources.getMetadataBuilder().build();
		sessionFactory = metaData.getSessionFactoryBuilder().build();"
		this have been written in HibernateUtil.java for code reusablity
		
	 * */
	
}
