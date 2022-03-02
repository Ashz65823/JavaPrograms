package com.zensar.training;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;


import com.zensar.training.bean.Doctor;
import com.zensar.training.util.JPAUtil;

public class Main2 {
	
	static void test1() {
		EntityManager em=JPAUtil.createEntityManager("PU");
		TypedQuery<Doctor> query=em.createNamedQuery("findAll", Doctor.class);
		List<Doctor> doctors=query.getResultList();
		System.out.println(doctors);
		JPAUtil.shutDown();
	}
	
	static void test2() {
		//single result --return record of search element(id)
		EntityManager em=JPAUtil.createEntityManager("PU");
		TypedQuery<Doctor> query=em.createNamedQuery("findById", Doctor.class);
		query.setParameter("searchId", 3);
		Doctor doctor=query.getSingleResult();
		System.out.println(doctor);
		JPAUtil.shutDown();
	}
	static void test3()
	{
		EntityManager em=JPAUtil.createEntityManager("PU");
		em.getTransaction().begin();
		//import is javax.persistence.Query;
		Query query=em.createNamedQuery("updateFees");
		System.out.println(query.executeUpdate());
		em.getTransaction().commit();
		JPAUtil.shutDown();
	}
	static void test4()
	{
		EntityManager em=JPAUtil.createEntityManager("PU");
		em.getTransaction().begin();
		Query query=em.createNamedQuery("deleteFile");
		query.setParameter("deleteId", 2);
		System.out.println(query.executeUpdate());
		em.getTransaction().commit();
		JPAUtil.shutDown();
	}
	public static void main(String[] args) {
		//test4();
		test1();
		
	}

}
 