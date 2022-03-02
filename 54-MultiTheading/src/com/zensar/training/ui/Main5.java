package com.zensar.training.ui;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		
		Runnable countryPrintingRunnable;
		countryPrintingRunnable=()->{
			String countries[]= {"India","Sri Lank","German","Italy","Canada","France"};
			for(String str:countries)
			{
				System.out.println(Thread.currentThread().getName()+":"+str);
			}
		};
		Thread t1=new Thread(countryPrintingRunnable);
		t1.start();//-->this function is in bloked state
		
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age");
		age=sc.nextInt();
		System.out.println(age);
	}
}
/*The main thread will go to blocked state 
 * In this program---if main was a big program it might have put main in block state  */
