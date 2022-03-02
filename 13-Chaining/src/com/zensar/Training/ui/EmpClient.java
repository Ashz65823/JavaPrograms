package com.zensar.Training.ui;

import com.zensar.Training.bean.Employee;

public class EmpClient {

	public static void main(String[] args) {
		Employee employee=new Employee();//constructor is called
		employee.setName("Ash");
		employee.setSalary(10000.0);
		System.out.println(employee.computeNetSalay());
	}

}
/*
 * new package has been generated
 * */
