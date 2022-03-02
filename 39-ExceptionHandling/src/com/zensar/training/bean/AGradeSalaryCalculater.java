package com.zensar.training.bean;

public class AGradeSalaryCalculater implements SalaryCalculater{

	@Override
	public double computeAllowance(double basic) throws Exception {//Exception is subclass of throwable
		if(basic <0)
		{
			InvalidSalaryException ex=new InvalidSalaryException("Salary  cannot be negative");
			throw ex; 
		}
		return 0;
	}
}
//The exception in implemeted class will   