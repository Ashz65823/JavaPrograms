package com.zensar.training.bean;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee001")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int empId;

	@Column(name = "Emp_Name")
	String name;
	
	@Column(name = "Emp_Grade")
	char grade;
	
	@Column(name = "Emp_BasicSalary")
	double basicSalary;
	
	@Column(name = "Emp_DateOfJoining")
	LocalDate dateOfJoining;
	
	//construstor
	public Employee(String name, char grade, double basicSalary, LocalDate date) {
		super();
		this.name = name;
		this.grade = grade;
		this.basicSalary = basicSalary;
		this.dateOfJoining = date;
	}
	public Employee() {
		super();
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public LocalDate getDate() {
		return dateOfJoining;
	}
	public void setDate(LocalDate date) {
		this.dateOfJoining = date;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", grade=" + grade + ", basicSalary=" + basicSalary
				+ ", date=" + dateOfJoining + "]";
	}

}
