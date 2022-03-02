package com.zensar.training.bean;

public class AGradeSalaryCalculator implements SalaryCalculator {

	@Override
	public double computeAllowance(double basic) {
		
		return basic*0.40;
	}

	@Override
	public double computeTax(double basic) {
		return basic*0.20;
	}

}
