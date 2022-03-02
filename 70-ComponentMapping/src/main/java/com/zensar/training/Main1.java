package com.zensar.training;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import com.zensar.training.bean.Address;
import com.zensar.training.bean.Employee;
import com.zensar.training.util.JPAUtil;

public class Main1 {
		public static void insert()
		{
			EntityManager em=JPAUtil.createEntityManager("PU");
			Address address=new Address("362", "JB Nagar", "Banaglore");
			Employee employee=new Employee("Bhavya Shree", 'B', 8900, LocalDate.of(2021, 12, 1),address);//address is embedded
			Employee employee2=new Employee("Bala", 'A', 2300.00, LocalDate.now());
			em.getTransaction().begin();
			em.persist(employee);
			em.getTransaction().commit();
			JPAUtil.shutDown();
		}
		public static void read()
		{
			EntityManager em=JPAUtil.createEntityManager("PU");
			Employee employee=em.find(Employee.class, 9);
			System.out.println(employee);
			JPAUtil.shutDown();
		}
		public static void update()
		{
			EntityManager em=JPAUtil.createEntityManager("PU");
			Employee employee=em.find(Employee.class, 10);
			//employee.getBasicSalary(employee.setBasicSalary(9500.00));
			employee.setName(employee.getName().toUpperCase());
			em.getTransaction().begin();
			em.merge(employee);
			em.getTransaction().commit();
			System.out.println("Updated");
			JPAUtil.shutDown();
		}
	
		public static void delete()
		{
			EntityManager em=JPAUtil.createEntityManager("PU");
			Employee employee=em.find(Employee.class, 13);
			em.getTransaction().begin();
			em.remove(employee);
			em.getTransaction().commit();
			System.out.println("Deleted!!");
			JPAUtil.shutDown();
		}
	public static void main(String[] args) {
		//insert();
		//read();
		//update();
		delete();
		
	}

}
