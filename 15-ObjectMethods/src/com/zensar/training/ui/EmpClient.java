package com.zensar.training.ui;

import com.zensar.training.bean.Employee;

public class EmpClient {

	public static void main(String[] args) {
		
		Employee employee=new Employee(101, "Ash", 12000.00);
		Employee employee2=new Employee(101, "Savi", 15000.00);
		
		System.out.println(employee.equals(employee2));//->result true bcoz both obj are equal-->happens because we have equal method in it
	}

}
