package com.zensar.training.ui;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Student;

public class Test1 {
	
	public static void test(Object obj)
	{
		
	}
	
	public static void main(String[] args) {
		Object obj=new Circle();//this is correct because we are trying to up-caste
		//obj.-->will expose only the object specific class
		
		test(new Circle());
		test(new Student());
		
		Circle c1=new Circle();
		test(c1);
		
		Student s=new Student();
		test(s);//since its object class method any thing can be called

	}

}
