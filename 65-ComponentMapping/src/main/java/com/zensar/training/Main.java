package com.zensar.training;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.zensar.training.bean.Address;
import com.zensar.training.bean.Employee;
import com.zensar.training.util.HibernateUtil;


public class Main {

	static void insert(){
		HibernateUtil.init();
		
		Session session=HibernateUtil.getSession();
		
		Transaction tx=session.beginTransaction();
		
		Address address=new Address();
		address.setDoorNumber("96");
		address.setAreaName("HAL Old Airport");
		address.setCityName("Bangalore");
		
		Employee employee=new Employee("Nivedha", 9000.00, address);
		session.save(employee);
		System.out.println(employee);
		tx.commit();
		HibernateUtil.cleanUp();
	}
	static void readAll()
	{
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		String str="from Employee";//class not table name
		Query query=session.createQuery(str);
		List<Employee> empList=query.list();	
		System.out.println(empList);
		
		session.close();
		HibernateUtil.cleanUp();
	}
	static void update()
	{
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		Employee employee=session.load(Employee.class, 2);
		employee.setName("Ravi");
		Transaction tx=session.beginTransaction();
		session.update(employee);
		tx.commit();
		session.close();
		HibernateUtil.cleanUp();
	}
	
	public static void main(String[] args) {
		//insert();
		//readAll();
		update();
	}
}
