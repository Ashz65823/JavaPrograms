package com.zensar.training.ui;

public class Main1 {

	public static void main(String[] args) {
		int a=800;//-->store in stack
		Integer obj=new Integer(a);//-->Store in heap object area
		double d=obj.doubleValue();
		System.out.println(d);
		
		long l=obj.longValue();
		System.out.println(l);
		
		int i=obj.intValue();//unrappering
		System.out.println(i);
		
		byte b=obj.byteValue();
		System.out.println(b);
		//all value conversion is done using type conversion 
		
		//---Static function---------
		String s1="123";
		int r=Integer.parseInt(s1);//convet string to integer
		System.out.println(r);
		
		System.out.println(Integer.toBinaryString(8347));//get binary value
		System.out.println(Integer.toOctalString(8347));//octal
		System.out.println(Integer.toHexString(8347));//hexadecimal
		System.out.println(Integer.toString(8347, 8));//find octal,hexadecimal or binary in same

	}

}
