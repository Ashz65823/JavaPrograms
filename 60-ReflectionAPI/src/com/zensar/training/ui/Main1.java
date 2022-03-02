package com.zensar.training.ui;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.AllPermission;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Student;

public class Main1 {
	
	static void receive(Object obj)
	{
		Class objClass=	obj.getClass();//fetch the type of class the object belong to
		System.out.println(objClass.getSimpleName());
		Method[] allMethods=objClass.getDeclaredMethods();//
		Method[] allMethods2=objClass.getMethods();
		for(Method m:allMethods)
		{
			System.out.println(m.getName());
		}
		System.out.println("------------------------------------------------");
		for(Method m:allMethods2)
		{
			System.out.println(m.getName());
		}
		Field[] allFields=objClass.getDeclaredFields();
		
		System.out.println("----------------Field--------------");
		for(Field f:allFields)
		{
			System.out.println(f.getName());
		}
		System.out.println("======================Constructor-------------------------");
		
		Constructor[] constructors=objClass.getConstructors();
		for(Constructor c:constructors)
		{
			System.out.println(c);
			System.out.println(c.getName());
		}
	}
	
	public static void main(String[] args) {

		Circle circle=new Circle(10);
		Student student=new Student();
		Employee employee=new Employee();
		//receive(circle);
		receive(student);
		//receive(employee);
	}
}
