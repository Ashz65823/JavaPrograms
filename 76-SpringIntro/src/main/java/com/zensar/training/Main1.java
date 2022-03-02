package com.zensar.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Person;
import com.zensar.training.bean.Shape;
import com.zensar.training.bean.Square;
import com.zensar.training.bean.Student;

public class Main1 {

	public static void main(String[] args) {
		Shape shape= null;
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");//pass this file name to find the bean definition to create instance specified in bean tag here circle
		shape =(Shape)context.getBean("shapeBean");
		//shape.setSize(10); changes made in applicationcontext this is not required to defind now 
		//here we get size this is called setter injection 
		
		System.out.println(shape.computeArea());
		
		System.out.println("<<<<<<<<<<<<<<<<Student>>>>>>>>>>>>>>>>");
		Student student=(Student)context.getBean("studBean");
		System.out.println(student);
		System.out.println("<<<<<<<<<<<<<<<<Student>>>>>>>>>>>>>>>>");
		Student student2=(Student)context.getBean("studBean2");//injuction through consructor
		System.out.println(student2);
		
		System.out.println("<<<<<<<<<<<<<<<<person>>>>>>>>>>>>>>>>");
		Person person1,person2;
		person1=(Person)context.getBean("personBean");
		person2=(Person) context.getBean("personBean");
		
		System.out.println(person1);
		System.out.println("<<<<<<<<<<<<<<<<Person>>>>>>>>>>>>>>>>");
		System.out.println(person2);
		person1.setAge(50);
		System.out.println("<<<<<<<<<<<<<<<<Person>>>>>>>>>>>>>>>>");
		System.out.println(person2.getAge());
		System.out.println(person1.getAge());
		
		
		String str=(String) context.getBean("companyName");
		double salary=(double) context.getBean("salaryBean");
		
		System.out.println(str);
		System.out.println(salary);
		System.out.println("\n\n<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Employee>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		Employee employee=(Employee) context.getBean("empBean");
		System.out.println(employee);
		System.out.println(employee.getAllowance());//null pointer exception becoz we injucted only 3 property
		System.out.println(employee.getDeduction());
	}

}
