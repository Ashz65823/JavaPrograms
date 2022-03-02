package com.zensar.training.ui;

public class Main {

	public static void main(String[] args) {

		StringBuffer s1=new StringBuffer("ABCD");
		s1.append(true);
		s1.append("Welcome");
		System.out.println(s1);
		s1.delete(3, 5);
		System.out.println(s1);
		s1.deleteCharAt(1);
		System.out.println(s1);
		s1.insert(4, " Life ");
		String str=s1.toString();///collecting string operation and storing here and make it as string
		System.out.println(s1);
		StringBuffer s2=new StringBuffer("Zensar");
		System.out.println(s1.equals(s2));
		String s3="Zensar";
		System.out.println(s3.equals(s2));//-->Don't compare string buffer with string even if values are same
		System.out.println(s2.reverse());
		System.out.println(str);
		
		

	}

}
