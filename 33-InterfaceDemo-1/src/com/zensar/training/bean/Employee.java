package com.zensar.training.bean;

public class Employee {
	String name;
	double basicSalary;
	char grade;
	SalaryCalculator salaryCalculator;//-->Instance variable has relationship--> inital value is Null
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;//--> This is lossly coupled sice salaryCalculator can be used where ever need
		if(this.grade=='A')
			this.salaryCalculator=new AGradeSalaryCalculater();
		if(this.grade=='B')
			this.salaryCalculator=new BGradeSalaryCalculater();
		if(this.grade=='C')
			this.salaryCalculator=new CGradeSalaryCalculater();
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", basicSalary=" + basicSalary + ", grade=" + grade + "]";
	}
	
	public double getAllowace()
	{
		double result=this.salaryCalculator.computeAllowance(basicSalary);
		return result;
	}
	
	public double getDeduction()
	{
		double result=this.salaryCalculator.computeTax(basicSalary);
		return result;
	}
	
}
