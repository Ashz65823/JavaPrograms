package com.zensar.training.ui;

import com.zensar.training.bean.FactoialNumber;

public class FactorialClient {

	public static void main(String[] args) {
		  FactoialNumber fc=new FactoialNumber();
		  fc.setNumber(5);
		  System.out.println(fc.getFactorial());
		  
		  FactoialNumber fc2=new FactoialNumber();
		  fc2.setNumber(25);
		  System.out.println(fc2.getFactorial());

	}

}
