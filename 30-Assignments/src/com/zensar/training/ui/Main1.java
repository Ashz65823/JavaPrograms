package com.zensar.training.ui;

import com.zensar.training.bean.PrimeNumberDecider;

public class Main1 {
	public static void main(String[] args) {
		PrimeNumberDecider pDecider=new PrimeNumberDecider();
		pDecider.setNumber(7);
		System.out.println(pDecider.isPrimeNumber());
		pDecider.setNumber(11);
		System.out.println(pDecider.isPrimeNumber());
		pDecider.setNumber(27);
		System.out.println(pDecider.isPrimeNumber());
		
	}
	
	

}
