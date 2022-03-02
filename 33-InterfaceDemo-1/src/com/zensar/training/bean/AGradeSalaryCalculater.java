package com.zensar.training.bean;

public class AGradeSalaryCalculater implements SalaryCalculator {

	@Override
	public double computeAllowance(double basicSalary) {
		
		Calculater calculater=new Calculater();
		return calculater.multiply(basicSalary, 0.40);
	}

	@Override
	public double computeTax(double basicSalary) {
		
		Calculater calculater=new Calculater();
		return calculater.multiply(basicSalary, 0.25);
	}

	@Override
	public double computeNetSalary(double basicSalary) {
		
		Calculater calculater=new Calculater();
		double sum=calculater.add(basicSalary, this.computeAllowance(basicSalary));
		double result=calculater.subtract(sum, this.computeTax(basicSalary));
		return result;
		}

}
