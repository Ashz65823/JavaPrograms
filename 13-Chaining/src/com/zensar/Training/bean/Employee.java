package com.zensar.Training.bean;

public class Employee {
	private String name;
	private double salary;
	
	public Employee()
	{
		super();
	}
	public Employee(String name, double salary) 
	{
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public double getSalary() 
	{
		return salary;
	}
	public void setSalary(double salary) 
	{
		this.salary = salary;
	} 
	public double computeAllowance()
	{
		return this.salary*0.35;
	}
	public double computeNetSalay()
	{
		//return this.salary+(this.salary*0.35);//this can be called using function
		return this.salary+this.computeAllowance();//this is called method chaining
	}
	
}
/*
 * All are in public--> the constructor,getter and setter
 * if we want to repeat the code then just call the function using this.func name
 * 
 *  */