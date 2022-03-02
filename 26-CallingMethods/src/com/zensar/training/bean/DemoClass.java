package com.zensar.training.bean;

public class DemoClass {
	
	public void demo1(long a)
	{
		System.out.println("During execution of demo1 "+a);
		a++;
		System.out.println("During execution of demo1 "+a);

	}

	public  void demo2(int [] elements)
	{
		elements[0]++;
		elements[1]=elements[1]*2;
		elements[2]=1000;	
	}
	
	public static void demo3(Squar s)
	{
		s.setSize(4000);
	}
	

}
