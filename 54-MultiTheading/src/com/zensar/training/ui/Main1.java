package com.zensar.training.ui;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) throws InterruptedException {
		// Single Threaded program
		Thread t = Thread.currentThread();
		Thread t1 = new CityPrintingThread();//extended  class
		t1.setName("City Thread");
		t1.start();// thread 0
		
		CountryPrintingTask cTask = new CountryPrintingTask();
		Thread t2 = new Thread(cTask);//implemnted class
		t2.setName("Country Thread");
		t2.start();// thread 2
		System.out.println("Program starts");// execute
		// t1.sleep(2000);
		
		//ReverseNumberPrintingThread rThread=new ReverseNumberPrintingThread();
		Thread t3= new ReverseNumberPrintingThread();
		t3.setName("Reverse number PT");
		t3.start();
		/*
		 * System.out.println("Enter Age"); int age; Scanner sc=new Scanner(System.in);
		 * age=sc.nextInt(); System.out.println(
		 * "-------------------------------------------------------------------"+age);
		 */
		RangeNumberSumTask rSumTask=new RangeNumberSumTask(10,20);
		Thread t4=new Thread(rSumTask);
		t4.setName("Range Sum task");
		t4.start();
		
		Thread t5=new CircleProcessingThread();
		t5.setName("Circle Thread Class");
		t5.start();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(t.getName() + ":" + i);
			t.sleep(1000);// pause for 1 sec -->Throws exception
			/*
			 * System.out.println("thread sleep 1sec and 0.5sec next"); Thread.sleep(500);
			 */
		}
		System.out.println("Program ends");
	}
}
