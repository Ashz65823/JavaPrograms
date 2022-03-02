package com.zensar.training;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zensar.training.bean.Developer;
import com.zensar.training.util.HibernateUtil;

public class Main3 {
	static void insertTest()
	{
		Developer developer=new Developer();
		developer.setName("Abhi");
		developer.setCity("Bangalore");
		developer.addSkill("Testing");
		developer.addSkill("Java");
		developer.addSkill("HTML");
		developer.addSkill("React");
		developer.addSkill("NodeJs");
		
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		session.save(developer);
		tx.commit();
		HibernateUtil.cleanUp();

	}
	
	public static void main(String[] args) {
		
		insertTest();
	}

}
