package com.zensar.training.bean;

public class BGradeSalaryCalculator implements SalaryCalculator{

	@Override
	public double computeAllowance(double basic) {
		return basic*0.30;
	}

	@Override
	public double computeTax(double basic) {
		return basic*0.10;
	}

}
