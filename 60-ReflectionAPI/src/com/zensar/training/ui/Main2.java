package com.zensar.training.ui;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.zensar.training.bean.Circle;

public class Main2 {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		//Class MyClass=Class.forName("java.lang.String");//explore Circle class
		Class MyClass=Circle.class;//
		
		System.out.println(MyClass.getSimpleName());
		Method[] allMethods=MyClass.getDeclaredMethods();//
		Method[] allMethods2=MyClass.getMethods();
		System.out.println("----------------------------------------Simple Method-----------------------------");
		for(Method m:allMethods)
		{
			System.out.println(m.getName());
		}
		System.out.println("------------------------------------------------");
		for(Method m:allMethods2)
		{
			System.out.println(m.getName());
		}
		Field[] allFields=MyClass.getDeclaredFields();
		
		System.out.println("----------------Field--------------");
		for(Field f:allFields)
		{
			System.out.println(f.getName());
		}
		System.out.println("======================Constructor-------------------------");
		
		Constructor[] constructors=MyClass.getConstructors();
		for(Constructor c:constructors)
		{
			System.out.println(c);
			System.out.println(c.getName());
		}
	}

}
