package com.zensar.training.bean;

import java.io.IOException;

public class B extends A{
	@Override 
	public void m1() throws RuntimeException//this will by default override A class exception since it is extended in A
	{
		
	}

}
/*
 * Should not throw any checked exception 
 * only unchecked exception should be used*/
