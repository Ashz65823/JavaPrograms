package com.zensar.training.bean;

import java.time.LocalDate;

public class Employee {
	private int employeeId;
	private String name;
	private LocalDate dateofjoing;
	private double basicSalary;
	private Gender gender;

	public Employee(String name, LocalDate dateofjoing, double basicSalary, Gender gender) {
		super();
		this.name = name;
		this.dateofjoing = dateofjoing;
		this.basicSalary = basicSalary;
		this.gender = gender;
	}
	public Employee() {
		super();
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateofjoing() {
		return dateofjoing;
	}
	public void setDateofjoing(LocalDate dateofjoing) {
		this.dateofjoing = dateofjoing;
	}
	public double getbasicSalary() {
		return basicSalary;
	}
	public void setbasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", dateofjoing=" + dateofjoing + ", basicSalary="
				+ basicSalary + ", gender=" + gender + "]";
	}
	
	

}
