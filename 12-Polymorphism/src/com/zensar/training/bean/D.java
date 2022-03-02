package com.zensar.training.bean;

public class D {
	public static void main(String[] args) {
		C obj=new C();
		int[] age= {25,67,89,90};
		obj.printSum(age);
		
		obj.printSum(new int[10]);//annonomus array object
		
		obj.printSum(new int[] {1,2,3});
		
		obj.printSum(new int [] {});
		
		obj.printSum1(1,2,3);
		
		obj.printSum1(new int [] {8,9,0});
		
		
	}
	/*
	 * pass integer array of any size
	 * should pass atlest empty
	 * ... will accep any number of object
	 * */
	
			

}
