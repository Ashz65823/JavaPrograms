package com.zensar.training.ui;

import com.zensar.training.bean.DoubleStackImpl;

public class Main2 {

	public static void main(String[] args) {
		byte v1=12;
		short v2=20;
		int v3=90;
		long v4=100;
		double v5=200.0;
		char v6='A';//asiic 
		float v7=120.00f;
		
		 DoubleStackImpl impl=new DoubleStackImpl(7);
		 impl.push(v1);
		 impl.push(v2);
		 impl.push(v3);
		 impl.push(v4);
		 impl.push(v5);
		 impl.push(v6);
		 impl.push(v7);
		 System.out.println(impl);
		 

	}

}
