package com.zensar.training.bean;

import java.util.Objects;

public class CarLoan extends Loan{
	private String registrationData;//generate constr with super class

	public CarLoan(double loanAmount, double tenureInMonths, String registrationData) {
		super(loanAmount, tenureInMonths);
		this.registrationData = registrationData;
	}

	public CarLoan() {
		super();
	}

	public String getregistrationData() {
		return registrationData;
	}

	public void setregistrationData(String registrationData) {
		this.registrationData = registrationData;
	}

	@Override
	public String toString() {
		return "CarLoan [registrationData=" + registrationData + ", getLoanAmount()=" + getLoanAmount()
				+ ", getTenureInMonths()=" + getTenureInMonths() + ", toString()=" + super.toString()
				+ ", getIntrestRate()=" + getIntrestRate() + ", getIntrestAmount()=" + getIntrestAmount() + "]";
	}
	
	@Override
	public int getIntrestRate() {//this has been overriden becoz we have to get proper calculation
		return 10;
	}
	

}
