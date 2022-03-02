package com.zensar.training;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Gender;
import com.zensar.training.util.HibernateUtil;

public class App {
	
	
	static void insert()
	{
		Employee employee=new Employee("Karun", LocalDate.of(2013,9, 23), 2800, Gender.MALE);
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		session.save(employee);
		System.out.println("Inserted into table \n--------------------------------------------------------------------");
		System.out.println(employee);
		tx.commit();
		session.close();//check once
		HibernateUtil.cleanUp();
	}
	static void read()
	{
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		Employee employee=session.load(Employee.class, 5);
		System.out.println("Read single record \n--------------------------------------------------------------------");
		System.out.println(employee);
		session.close();
		HibernateUtil.cleanUp();
	}
	static void readAll()
	{
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		String str="from Employee";
		Query query=session.createQuery(str);
		List<Employee> myList=query.list();
		System.out.println("Read All the record \n--------------------------------------------------------------------");
		System.out.println(myList);
		
		session.close();
		HibernateUtil.cleanUp();
		
	}
	static void delete()
	{
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		Employee employee= session.load(Employee.class, 1);
		Transaction tx=session.beginTransaction();
		 session.delete(employee);
		 System.out.println(employee);
		 System.out.println("Deleted Successfully \n--------------------------------------------------------------------");
		 tx.commit();
		 HibernateUtil.cleanUp();
		 
		
	}
	static void update()
	{
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		 Employee employee=session.load(Employee.class, 3);
		 employee.setName("Ashwini");
		 Transaction tx=session.beginTransaction();
		 System.out.println("Update record \n--------------------------------------------------------------------");
		 session.update(employee);
		 tx.commit();
		 HibernateUtil.cleanUp();
	}
  public static void main(String[] args) {
	  //insert();
	  //read();
	  readAll();
	  //delete();
	  //update();
  }
}
