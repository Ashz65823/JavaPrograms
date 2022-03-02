package com.zensar.training.bean;

public class Main {

	public static void main(String[] args) {
		A obj=new A();
		obj.m1(10);
		obj.m1(10, 20);//static polymorphism
		
		byte b1=100;
		short b2=100;
		obj.m1(b1, b2);
		
		int a=10;
		int b=90;
		obj.m1(a, b);
		
		byte b3=100;
		obj.m1(b3);//most appropriate function will be called if byte is noy present then int with one ele will be executed if int is not avaiable then if double func is avaiable then double function will execute
	}

}
