package com.zensar.training.bean;

public class B extends A {
	
	@Override
	public void compute(int a)
	{
		System.out.println(a*a*a);
	}//this function will be overriden by the subclass

}
