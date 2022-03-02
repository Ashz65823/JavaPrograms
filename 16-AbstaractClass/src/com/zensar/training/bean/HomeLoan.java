package com.zensar.training.bean;

public class HomeLoan extends Loan {

	String propertyLocation;
		
	public HomeLoan(double loanAmount, double tenureInMonths, String propertyLocation) {
		super(loanAmount, tenureInMonths);
		this.propertyLocation = propertyLocation;
	}


	public HomeLoan() {
		super();
	}

	public String getPropertyLocation() {
		return propertyLocation;
	}


	public void setPropertyLocation(String propertyLocation) {
		this.propertyLocation = propertyLocation;
	}


	@Override
	public String toString() {
		return "HomeLoan [propertyLocation=" + propertyLocation + ", getLoanAmount()=" + getLoanAmount()
				+ ", getTenureInMonths()=" + getTenureInMonths() + ", toString()=" + super.toString() + ", hashCode()="
				+ hashCode() + ", getIntrestAmount()=" + getIntrestAmount() + "]";
	}

	@Override
	int getIntrestRate() {
		return 7;
	}

}
