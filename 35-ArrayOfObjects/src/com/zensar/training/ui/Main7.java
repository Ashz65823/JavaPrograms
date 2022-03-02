package com.zensar.training.ui;

import com.zensar.training.bean.Square;

public class Main7 {
	public static void main(String[] args) {
		Square sq1=new Square(12);
		Square sq2=new Square(13);
		Square sq3=new Square(12);
		System.out.println(sq1.compareTo(sq3));
		System.out.println(sq1.compareTo(sq2));
		System.out.println(sq2.compareTo(sq1));
		
		Integer obj1=new Integer(20);
		Integer obj2=new Integer(25);
		System.out.println(obj1.compareTo(obj2));
		
		String str1=new String("Welcome");
		String str2=new String("Hello");
		String str4=new String("Welcome to Zensar");
		String str5=new String("welcome to zensar");
		String str3=new String("Hello");
		System.out.println(str1.compareTo(str2));//Difference between first character i.e(W and H)ascii key value
		System.out.println(str2.compareTo(str1));
		System.out.println(str2.compareTo(str3));
		System.out.println(str1.compareTo(str4));//compare with length(7-17=-10)
		System.out.println(str1.length());
		System.out.println(str4.length());
		System.out.println(str5.compareTo(str4));//The ascii of W and w is compared and return the diffrence value
	}

}
