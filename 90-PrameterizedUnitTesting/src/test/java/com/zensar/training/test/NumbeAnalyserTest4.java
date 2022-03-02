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
public class NumbeAnalyserTest4 {
	
	@Parameterized.Parameters
	public static Collection testData()
	{
		Object[][]data= {
				{12,true},
				{11,false},
				{20,true},
				{15,false},
		};
		return Arrays.asList(data);
	}
	
	int inputNumber;
	boolean expectedResult;
	
	NumberAnalyzer analyzer;
	
	
	public NumbeAnalyserTest4(int inputNumber, boolean expectedResult) {
		super();
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}
	
	@Before
	public void f1()
	{
		this.analyzer=new NumberAnalyzer();
	}
	
	@Test
	public void test1()
	{
		this.analyzer.setNumber(inputNumber);
		assertEquals(expectedResult, this.analyzer.isEven());
	}

	@After
	public void f2()
	{
		this.analyzer=null;
	}
}
