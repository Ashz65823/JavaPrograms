package com.zensar.training.ui;

public class Main1 {

	public static void main(String[] args) {
		System.out.println("Program Begins");
		int a=100;
		int b=20;
		int c=0;
		System.out.println(a/b);
		try {
		System.out.println(a/c);
		}catch(ArithmeticException e)//--> Exception object
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Program Ends");
	}

}
/*
 * Robotic Application*/
