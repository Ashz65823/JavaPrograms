package com.zensar.training;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.zensar.training.util.HibernateUtil;

public class Main4 {
	
	static void aggregate1() {
		String str="select sum(fees) from Doctor";
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		Query<Double> query=session.createQuery(str);
		Double totalFees=query.getSingleResult();
		System.out.println("Total fee ="+totalFees);//sum of all feww
		HibernateUtil.cleanUp();
	}
	
	static void aggregate2() {
		String str="select avg(fees) from Doctor";
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		Query<Double> query=session.createQuery(str);
		Double averageFees=query.getSingleResult();
		System.out.println("Average fee ="+averageFees);//sum of all feww
		HibernateUtil.cleanUp();
	}
	static void aggregate3() {
		
		String str="select count(fees) from Doctor";
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		Query<Long> query=session.createQuery(str);
		Long countFees=query.getSingleResult();
		System.out.println("Count of fee ="+countFees);//sum of all feww
		HibernateUtil.cleanUp();		
	}

	public static void main(String[] args) {
		aggregate3();

	}

}
