package com.zensar.training.ui;

import com.zensar.training.bean.Circle;

public class CircleClinet {

	public static void main(String[] args) {
		Circle c1=new Circle();
		c1.setRadius(10);
		//System.out.println(c1.toString());//this is object class method
		System.out.println(c1);//this will to string of overriden mathod
		
		Circle c2=new Circle();
		c2.setRadius(10);
		System.out.println(c2);

		int a=10,b=10;
		System.out.println(a==b);
		
		c2=null;
		System.out.println(c1==c2);//this will return false->this consider object of
		
		System.out.println(c1.equals(c2));//-->this will return false 
		
	}

}
