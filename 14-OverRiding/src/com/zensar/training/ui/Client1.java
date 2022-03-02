package com.zensar.training.ui;

import com.zensar.training.bean.A;
import com.zensar.training.bean.B;

public class Client1 {

	public static void main(String[] args) {
		A obj =new A();
		obj.compute(10);
		
		B obj2=new B();
		obj2.compute(10);//over riding
		
		A obj3=new B();//A class create B class object
		obj3.compute(10);//B class object will be created

	}

}
