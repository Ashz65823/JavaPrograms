package com.zensar.Training.bean;

public class C {
//default constructor is created if we donn't create any
	private int x;
	public C()
	{
		this(40);//chaining
		System.out.println("C Constructor is called");
	}
	public C(int x)
	{
		
		this.x=x;
		System.out.println("C Constructor with argument is called");
	}
	
}
