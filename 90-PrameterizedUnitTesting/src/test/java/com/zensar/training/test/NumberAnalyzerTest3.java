package com.zensar.training.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.zensar.training.bean.NumberAnalyzer;

@RunWith(Parameterized.class)
public class NumberAnalyzerTest3 {
	
	@Parameterized.Parameters
	public static Collection testData()
	{
		Object[][]data= {
				{12,false},
				{11,true},
				{20,false},
				{15,true},
		};
		return Arrays.asList(data);
	}
	int inputNumber;
	boolean expectedResult;
	
	NumberAnalyzer analyzer;

	public NumberAnalyzerTest3(int inputNumber, boolean expectedResult) {
		super();
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}//constructor
	
	@Before
	public void f1()
	{
		this.analyzer=new NumberAnalyzer();
	}
	
	@Test
	public void test()
	{
		
		this.analyzer.setNumber(inputNumber);
		assertEquals(expectedResult, this.analyzer.isOdd());
		
	}
	
	@After
	public void f2()
	{
		this.analyzer=null;
	}

}
