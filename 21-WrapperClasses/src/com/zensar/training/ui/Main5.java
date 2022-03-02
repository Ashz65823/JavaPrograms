package com.zensar.training.ui;

public class Main5 {
	public static void main(String[] args) {
		Integer i1=200;//
		Integer i2=200;//auto boxing-->pass to integer constructor
		System.out.println(i1==i2);
		
		//If the value is in the range of byte it will create a pool of integer in heap and when we created data of same value it will not create new it will refere new
		
		Integer i3=125;//
		Integer i4=125;//auto boxing-->pass to integer constructor
		System.out.println(i3==i4);
		
		Integer i5=new Integer(125);//this will create new object in heap
		System.out.println(i5==i4);//-->return false because doesn't share memory
	}
	

}
