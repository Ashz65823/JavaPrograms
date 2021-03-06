package com.zensar.training.bean;

import java.util.Objects;

abstract public class Loan {
	private double loanAmount;
	private double tenureInMonths;
	public Loan(double loanAmount, double tenureInMonths) {
		super();
		this.loanAmount = loanAmount;
		this.tenureInMonths = tenureInMonths;
	}
	public Loan() {
		super();
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public double getTenureInMonths() {
		return tenureInMonths;
	}
	public void setTenureInMonths(double tenureInMonths) {
		this.tenureInMonths = tenureInMonths;
	}
	@Override
	public String toString() {
		return "Loan [loanAmount=" + loanAmount + ", tenureInMonths=" + tenureInMonths + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(loanAmount);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Loan))
			return false;
		Loan other = (Loan) obj;
		return Double.doubleToLongBits(loanAmount) == Double.doubleToLongBits(other.loanAmount);
	}
	
	abstract int getIntrestRate();//-->we dont want this method inplemenation here
	public double getIntrestAmount()
	{
		return this.loanAmount*this.tenureInMonths*this.getIntrestRate()/100;
	}
	
}
