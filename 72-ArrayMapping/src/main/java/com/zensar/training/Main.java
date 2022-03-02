package com.zensar.training;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.zensar.training.bean.Student;
import com.zensar.training.util.JPAUtil;


public class Main {

	public static void main(String[] args) {

		insertTesting();
		// loadTesting(2);

		// loadAllTesting();

		// updateTesting(1);
		// deleteTesting(2);
		

	}

	private static void insertTesting() {
		Student student = new Student();
		//student.setRollNo(5055);
		student.setName("Ramesh");
		student.setMark(1, 60.00);
		student.setMark(2, 55.55);
		student.setMark(0, 45.69);
		
		EntityManager em=JPAUtil.createEntityManager("PU");
		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
		JPAUtil.shutDown();

		System.out.println("Student Object Saved with ID ");
	}

	private static void loadTesting(int id) {
		Student student = null;
		

		System.out.println("Student Object Loaded with ID " + id);

		System.out.println(student);
	}

	private static void loadAllTesting() {
		List<Student> students = null;

		

		for (Student s : students)
			System.out.println(s);

		System.out.println("All Student Objects Loaded ");

	}

	private static void updateTesting(int id) {

		Student student = null;
		

		System.out.println("Student Object Loaded with ID " + id);

		System.out.println(student);

		student.setName("Dev");
		student.setMark(0, 80);
		student.setMark(1, 90);
		student.setMark(2, 97);

		

		System.out.println("After updation :" + student);

		System.out.println("Student Object updated ");

	}

	private static void deleteTesting(int id) {
		Student student = null;
		
		System.out.println("Student Object Loaded with ID " + id);

		System.out.println(student);
		System.out.println("Trying to Delete ....");

		
		System.out.println("Student deleted");

	}

}
