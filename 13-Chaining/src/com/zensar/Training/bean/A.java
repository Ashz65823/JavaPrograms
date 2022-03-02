package com.zensar.Training.bean;

public class A {
	private int x;
	private static int y;
	
	public A()
	{
		this(10);//-->can be only in line number 1 of constructor
		System.out.println("No argument constructor");
	}
	public A(int x)
	{
		//this();-->to call no argument constructor
		System.out.println("1 argument constructor");
		this.x=x;
		this.test1();
		this.test2();
		test4();
	}
	public void test1()//instance method
	{
		System.out.println(x);
		System.out.println(y);//static variable are used in instance method
		test3();
		test4();
	}
	
	public static void test2()//static method
	{
		//System.out.println(x); instance variable is not allowed in static method
		System.out.println(y);
		test4();//static can call static method
	}
	public void test3()//instance method
	{
		System.out.println("test 3");
	}
	
	public static void test4()
	{
		
		System.out.println("Test 4 static");
	}

}
