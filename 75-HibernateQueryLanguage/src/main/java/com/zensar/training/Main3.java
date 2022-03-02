package com.zensar.training;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.zensar.training.bean.Doctor;
import com.zensar.training.util.HibernateUtil;

public class Main3 {

	static void read1() {
		String str = "select d from Doctor d where d.gender='MALE'";
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		Query<Doctor> query=session.createQuery(str, Doctor.class);
		List<Doctor> maleList=query.getResultList();
		System.out.println(maleList);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<Doctor>>>>>>>>>>>>>>>>>>>>>>> ");
		HibernateUtil.cleanUp();

	}

	static void read2() {
		String str = "select d from Doctor d order by d.fees";
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		Query<Doctor> query=session.createQuery(str, Doctor.class);
		List<Doctor> list=query.getResultList();//multiple result
		System.out.println(list);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<Doctor>>>>>>>>>>>>>>>>>>>>>>> ");
		HibernateUtil.cleanUp();
	}

	static void read3() {
		String str="select d from Doctor d where d.id=:docId";//:docId named parameter
		//String str="select d from Doctor d where d.id=?";
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		Query<Doctor> query=session.createQuery(str, Doctor.class);
		query.setParameter("docId", 1);
		//query.setParameter(0, 1);
		Doctor doctor=query.getSingleResult();//getting single obj
		System.out.println(doctor);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<Doctor>>>>>>>>>>>>>>>>>>>>>>> ");
		HibernateUtil.cleanUp();
		/*
		 * String str="select d from Doctor d where d.id=?";
		 * query.setParameter(0, 1);specify position of docId
		 * if we give ? insted of :docId then specify position in setParameter
		 * */
	}

	static void read4() {
		String str="select d from Doctor d where d.gender=:gen and d.fees>:cutoff";
		HibernateUtil.init();
		Session session = HibernateUtil.getSession();
		Query<Doctor> query=session.createQuery(str, Doctor.class);
		query.setParameter("gen","FEMALE");
		query.setParameter("cutoff", 500.00);
		List<Doctor> doctors=query.getResultList();
		System.out.println(doctors);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<Doctor>>>>>>>>>>>>>>>>>>>>>>> ");
		HibernateUtil.cleanUp();
	}

	public static void main(String[] args) {
		read4();

	}

}
