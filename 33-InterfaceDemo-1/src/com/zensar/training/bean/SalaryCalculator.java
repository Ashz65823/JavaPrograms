package com.zensar.training.bean;

public interface SalaryCalculator {
	
	//int a=100;-->These variable will be public static final variable in interface
double computeAllowance(double basicSalary);
double computeTax(double basicSalary);
double computeNetSalary(double basicSalary);
	


}
/*
 * the class and method of class is public in abstract because
 * it has to be implemented in the base class to
 * in place of 100% abstract class then that class can be inteface
 * the below class can be interface
 * 	public abstract double computeAllowance(double basicSalary);
	public abstract double computeTax(double basicSalary);
	public abstract double computeNetSalary(double basicSalary);
* Pure abstract class can have constructor
 *INTERFACE WILL NOT HAVE CONSTRUSTOR
 * 
 * */
 