package com.zensar.training.ui;

import com.zensar.training.bean.Employee;

public class EmpClient {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setName("Ash");
		employee.setBasicSalary(10000);
		employee.setGrade('C');
		
		System.out.println(employee.getAllowace());
		System.out.println(employee.getDeduction());
	}

}
