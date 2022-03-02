package com.zensar.training.bean;

public class B extends A{
	
	@Override
	public int demo1()
	{
		return 1;
	}
	
	@Override
	public Vehicle demo2()//--->the return type is car but it should return vehicle
	{
		return new Car();//-->since car is vehicle class subclass the return type can be car
	}

}
