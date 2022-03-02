package com.zensar.training.ui;

import com.zensar.training.bean.SalaryCalculator;

public class Main2 {
	
public static void main(String[] args) {
	SalaryCalculator salaryCalculator;
	salaryCalculator=new SalaryCalculator() {
		
		@Override
		public double computeTax(double basic) {
			// TODO Auto-generated method stub
			return basic*0.10;
		}
		
		@Override
		public double computeAllowance(double basic) {
			// TODO Auto-generated method stub
			return basic*0.40;
		}
	};
	System.out.println(salaryCalculator.computeAllowance(1000));
	System.out.println(salaryCalculator.computeTax(1000));
	System.out.println("--------------------------------B Grade-------------------------------");
	salaryCalculator=new SalaryCalculator() {
		
		@Override
		public double computeTax(double basic) {
			// TODO Auto-generated method stub
			return basic*0.06;
		}
		
		@Override
		public double computeAllowance(double basic) {
			// TODO Auto-generated method stub
			return basic*0.30;
		}
	};
	System.out.println(salaryCalculator.computeAllowance(1000));
	System.out.println(salaryCalculator.computeTax(1000));
	System.out.println("---------------------------------------C Grade------------------------------------");
	
	salaryCalculator =new SalaryCalculator() {
		
		@Override
		public double computeTax(double basic) {
			// TODO Auto-generated method stub
			return basic*0.02;
		}
		
		@Override
		public double computeAllowance(double basic) {
			// TODO Auto-generated method stub
			return basic*0.25;
		}
	};
	System.out.println(salaryCalculator.computeAllowance(1000));
	System.out.println(salaryCalculator.computeTax(1000));
	
}
}
