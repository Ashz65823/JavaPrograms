package com.zensar.training.bean;

public class Employee {
	
	int id;
	String name;
	double salary;
	SalaryCalculator aGradeSalCal;//interface type variable---have remaned from salarycalculator to agradesalcal
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	public SalaryCalculator getaGradeSalCal() {
		return aGradeSalCal;
	}
	public void setaGradeSalCal(SalaryCalculator aGradeSalCal) {
		this.aGradeSalCal = aGradeSalCal;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", salaryCalculator=" + aGradeSalCal
				+ "]";
	}
	public double getAllowance()
	{
		return this.aGradeSalCal.computeAllowance(this.salary);//-->Dependent object
	}
	public double getDeduction()
	{
		return this.aGradeSalCal.computeTax(this.salary);
	}
	//salaryCalculator is property in employee class
	/*
	 * public SalaryCalculator getSalaryCalculator() {//property return
	 * aGradeSalCal; } public void setSalaryCalculator(SalaryCalculator
	 * salaryCalculator) { this.aGradeSalCal = salaryCalculator; }
	 */
}
