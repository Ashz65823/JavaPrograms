package com.zensar.training.bean;

public class PrimeNumberDecider {

	private int number;
	
	
	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isPrimeNumber()
	{
		for(int i=2;i<=number/2;i++)
			if(number%i==0)
				return false;
		return true;
	}
}
//check number is prime or not 