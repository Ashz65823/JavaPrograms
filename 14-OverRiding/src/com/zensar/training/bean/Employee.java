package com.zensar.training.bean;

public class Employee {
	
	public double basicSalary;
	
	/*
	 * public Employee() { System.out.println("Employee"); }
	 */
	public double computeNetSalary()
	{
		System.out.println("Employee net salary");
		return this.basicSalary+this.basicSalary*0.40;
	}
	/*
	 * public static void m2() { System.out.println("m2 is employee"); }
	 * 
	 * private void m1(int a,int b) { System.out.println(a*a+b); }
	 */
}
