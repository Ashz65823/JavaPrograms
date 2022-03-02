package com.zensar.training;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.zensar.training.bean.Doctor;
import com.zensar.training.util.HibernateUtil;

public class Main6 {

	static void readNativeQuery1() {

		String str = "select * from doctortab";
		
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		
		Query<Doctor> query=session.createNativeQuery(str, Doctor.class);
		List<Doctor> list=query.getResultList();
		System.out.println(list);
	
		HibernateUtil.cleanUp();
	}

	static void readNativeQuery2() {

		String str = "select name,fees,gender from doctortab";
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		Query query=session.createNativeQuery(str);
		List<Object[]> allData=query.list();
		for(Object[] rowData:allData)
		{
			System.out.println(rowData[0]+" , "+rowData[1]+" , "+rowData[2]);
		}
		
		HibernateUtil.cleanUp();
	}

	static void readNativeQuery3() {

		String str = "select * from doctortab";

	}

	public static void main(String[] args) {
		readNativeQuery2();

	}

}
