package com.zensar.training.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	int id;
	String name;
	double salary;
	@Autowired
	@Qualifier(value = "bGradeSalCal")
	SalaryCalculator salaryCalculator;//interface type variable---have remaned from salarycalculator to agradesalcal
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

	public SalaryCalculator getSalaryCalculator() {
		return salaryCalculator;
	}
	public void setSalaryCalculator(SalaryCalculator salaryCalculator) {
		this.salaryCalculator = salaryCalculator;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", salaryCalculator=" + salaryCalculator
				+ "]";
	}
	public double getAllowance()
	{
		return this.salaryCalculator.computeAllowance(this.salary);//-->Dependent object
	}
	public double getDeduction()
	{
		return this.salaryCalculator.computeTax(this.salary);
	}
	//salaryCalculator is property in employee class
	
}
