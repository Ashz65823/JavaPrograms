package com.zensar.training.ui;

import com.zensar.training.bean.AGradeSalaryCalculater;
import com.zensar.training.bean.BGradeSalaryCalculater;
import com.zensar.training.bean.CGradeSalaryCalculater;
import com.zensar.training.bean.SalaryCalculator;

public class Main {

	public static void main(String[] args) {
		SalaryCalculator salaryCalculator;
		
		salaryCalculator=new AGradeSalaryCalculater();
		System.out.println(salaryCalculator.computeAllowance(10000));
		System.out.println(salaryCalculator.computeTax(10000));
		System.out.println(salaryCalculator.computeNetSalary(10000));
		
		salaryCalculator=new BGradeSalaryCalculater();
		System.out.println(salaryCalculator.computeAllowance(10000));
		System.out.println(salaryCalculator.computeTax(10000));
		System.out.println(salaryCalculator.computeNetSalary(10000));

		salaryCalculator=new CGradeSalaryCalculater();
		System.out.println(salaryCalculator.computeAllowance(10000));
		System.out.println(salaryCalculator.computeTax(10000));
		System.out.println(salaryCalculator.computeNetSalary(10000));
	}

}
