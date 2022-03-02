package com.zensar.Training.ui;

import com.zensar.Training.bean.A;

public class Client {

	public static void main(String[] args) {
		A obj;
		obj=new A(10);
		obj.test1();//instance method using object
		A.test2();//static-->can call using object but recommended using class name

	}

}
