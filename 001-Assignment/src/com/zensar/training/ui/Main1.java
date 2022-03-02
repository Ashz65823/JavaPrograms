package com.zensar.training.ui;
public class Main1 {
	public static void main(String[] args) {
		
		ThreadToCalculateSumOfAllEmp tOfAllEmp=new ThreadToCalculateSumOfAllEmp();
		ThreadToCount tCount=new ThreadToCount();
		
		Thread t1=new Thread(tOfAllEmp);
		Thread t2=new Thread(tCount);
		t1.setName("Total Employee Salary= ");
		t1.start();
		t2.setName("No Of Line= ");
		t2.start();
		
	}
}
