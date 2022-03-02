package com.zensar.training.bean;

public class Employee {
	double basicSalary;

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) throws InvalidSalaryException {
		if(basicSalary<0) {
			InvalidSalaryException ex=new InvalidSalaryException("Salary Cannot be negative");
			throw ex;
		}
		
		this.basicSalary = basicSalary;
	}
	
	public double computeAllowance()
	{
		return this.basicSalary*0.20;
	}
}
