package com.zensar.training.ui;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

import com.zensar.training.bean.CollectionFactory;
import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Gender;
import com.zensar.training.bean.comparator.EmployeeNameComparator;
import com.zensar.training.bean.comparator.EmployeeSalaryComparator;

public class Main2 {

	public static void main(String[] args) {
		List<Employee> allEmp=CollectionFactory.getEmployeeList();
		Collections.sort(allEmp);
		System.out.println("Default Sort"+allEmp);
		
		System.out.println("\nBinary Search  "+Collections.binarySearch(allEmp, new Employee(5005)));
		System.out.println("Minimum"+Collections.min(allEmp));
		System.out.println("Maxmim"+Collections.max(allEmp));
		
		System.out.println("-------------------------------------------------------------------------");
		EmployeeNameComparator empName=new EmployeeNameComparator();
		Collections.sort(allEmp, empName);
		System.out.println("Sort on Name \n"+allEmp);
		System.out.println(Collections.binarySearch(allEmp,new Employee(5004)));
		System.out.println("Minimum Name"+Collections.min(allEmp,empName));
		System.out.println("Minimum Name"+Collections.max(allEmp,empName));
		System.out.println("-----------------------------------------------------------------------------");
		EmployeeSalaryComparator empsal=new EmployeeSalaryComparator();
		Collections.sort(allEmp, empsal);
		System.out.println("Mininum Salary"+Collections.min(allEmp, empsal));
		System.out.println("Maximun Salary"+ Collections.max(allEmp, empsal));


	}

}
