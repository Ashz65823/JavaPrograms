package com.zensar.training;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import com.zensar.training.bean.Employee;
import com.zensar.training.util.JPAUtil;

public class Main1 {
		public static void insert()
		{
			EntityManager em=JPAUtil.createEntityManager("JPAIntro");
			Employee employee=new Employee("Bhavya Shree", 'B', 8100, LocalDate.of(2021, 1, 06));
			em.getTransaction().begin();
			em.persist(employee);
			em.getTransaction().commit();
			JPAUtil.shutDown();
		}
		public static void load()
		{
			EntityManager em=JPAUtil.createEntityManager("JPAIntro");
			Employee employee=em.find(Employee.class, 6);
			System.out.println(employee);
			JPAUtil.shutDown();
		}
		public static void update()
		{
			EntityManager em=JPAUtil.createEntityManager("JPAIntro");
			Employee employee=em.find(Employee.class, 6);
			//employee.getBasicSalary(employee.setBasicSalary(9500.00));
			employee.setName(employee.getName().toUpperCase());
			em.getTransaction().begin();
			em.merge(employee);
			em.getTransaction().commit();
			JPAUtil.shutDown();
		}
	
		public static void delete()
		{
			EntityManager em=JPAUtil.createEntityManager("JPAIntro");
			Employee employee=em.find(Employee.class, 6);
			em.getTransaction().begin();
			em.remove(employee);
			em.getTransaction().commit();
			JPAUtil.shutDown();
		}
	
	
	public static void main(String[] args) {
		//insert();
		//load();
		//update();
		delete();
		
	}

}
