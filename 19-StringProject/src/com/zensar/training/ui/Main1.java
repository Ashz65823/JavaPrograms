package com.zensar.training.ui;

public class Main1 {

	public static void main(String[] args) {
	String s1=new String("Hello How are you");//create obj in heep memoer
	System.out.println(s1.length());
	
	//5th position 
	System.out.println(s1.charAt(4));
	System.out.println(s1.endsWith("you"));
	System.out.println(s1.endsWith("welcome"));
	System.out.println(s1.startsWith("Hello"));
	System.out.println(s1.contains("are"));
	
	System.out.println(s1.substring(5));//from sapce it exctact
	System.out.println(s1.substring(7,12));
	
	System.out.println(s1.indexOf("are"));//serach frm begining
	System.out.println(s1.lastIndexOf("are"));//search from last
	
	//s1.toUpperCase();//will not get changed so we have to store in an string object
	String s2=s1.toLowerCase();
	System.out.println(s2);
	String s3=s1.toLowerCase();
	System.out.println(s3);
	
	String s4=s1.replace('H', 'W');
	System.out.println(s4);
	
	System.out.println(s1);
	
	String s5=new String("Zensar");
	String s6=new String("zensar");
	System.out.println(s5.equals(s6));
	System.out.println(s5.equalsIgnoreCase(s6));
	
	System.out.println(s5==s6);//->address are compared and return false.. if we want to compare data use equal function
	
	}

}
