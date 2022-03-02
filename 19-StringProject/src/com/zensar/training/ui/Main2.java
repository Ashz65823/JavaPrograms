package com.zensar.training.ui;

public class Main2 {

	public static void main(String[] args) {
		String s1="Welcome";//new is not mandatory-->this is literal initalization
		String s2="are";
		String s3="are";//new object will not be creted it will reuse the same object created by s2

		System.out.println(s2==s3);
		System.out.println(s1.equals(s3));
		String s4=new String("are");//new object will created and new reference will be created
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));
	}

}
