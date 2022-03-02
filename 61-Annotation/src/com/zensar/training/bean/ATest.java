package com.zensar.training.bean;

import com.zensar.training.annotations.Model;
import com.zensar.training.annotations.TestDouble;
import com.zensar.training.annotations.TestIntegers;

public class ATest {

	@TestIntegers(ints= {2,3,4,5,6})
	void test1()
	{
		System.out.println("Test1");
	}
	
	@TestDouble(doublues = {7.0,9.8,6.9,4.0})
	void test2()
	{
		System.out.println("Test2");
	}
	void m3(@Model Employee e)
	{
		
	}
}
