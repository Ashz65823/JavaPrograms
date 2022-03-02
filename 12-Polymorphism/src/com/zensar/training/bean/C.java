package com.zensar.training.bean;

public class C {
	public void printSum(int []arr)
	{
		int sum=0;
		for(int ele:arr)
			sum+=ele;
		System.out.println(sum);
	}
	public void printSum1(int ...arr)//elipes parameter var args
	{
		int sum=0;
		for(int ele:arr)
			sum+=ele;
		System.out.println(sum);
	}
	

}
