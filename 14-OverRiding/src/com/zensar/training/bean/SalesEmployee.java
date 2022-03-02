package com.zensar.training.bean;

public class SalesEmployee extends Employee{
	
	public double salesCommission;
	
	public double computeNetSalary()
	{
		System.out.println("Sales Employee net salary");
		//return this.basicSalary+this.basicSalary*0.35+salesCommission;-->this is repeation 
		return super.computeNetSalary()+salesCommission;
	}

}
