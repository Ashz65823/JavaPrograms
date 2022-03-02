package com.zensar.Training.bean;

public class Manager extends Employee {
	
	private double houseRentAllowance;

	public Manager(String name, double salary, double houseRentAllowance) 
	{
		super(name, salary);//call from super class
		this.houseRentAllowance = houseRentAllowance;
	}

	public Manager() {
		super();//call to super no argument const
	}
}
