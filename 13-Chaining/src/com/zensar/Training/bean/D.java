package com.zensar.Training.bean;

public class D extends C{
	
	public D (int x)
	{
		super(x);//-> then we cannot use this() here.
	}
	public D()
	{
		super();
	}
}
