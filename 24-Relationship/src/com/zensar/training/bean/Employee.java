package com.zensar.training.bean;

public class Employee {
	
	SalaryCalculater calculater;//--->has relationship
	void m1()
	{
		SimpleCalculater simpleCalculater;//--->uses relationship
	}
	void m2(SimpleCalculater simpleCalculater)
	{
		
	}
	
	/**
	 * Salary is a part of employee class
	 * Employee uses simplecalculation in the employee
	 * */

}
