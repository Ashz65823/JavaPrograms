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

@RunWith(Parameterized.class) // to run for each parameter it recive//---look for function @Parameterized.Parameters (kind of auto iteration)
public class NumberAnalyzerTest2 {
	private int inputNumber;
	private boolean expectedResult;
	private NumberAnalyzer analyzer;

	public NumberAnalyzerTest2(int inputNumber, boolean expectedResult) {
		super();
		this.inputNumber = inputNumber;//13,17
		this.expectedResult = expectedResult;//true,true
	}

	@Parameterized.Parameters
	public static Collection testData()// return collection od data
	{
		Object[][] data = { // 2d array
				{ 13, true }, { 17, true }, { 27, false }, { 28, false } };// group of data to test
		return Arrays.asList(data);
	}

	@Before
	public void init() {
		this.analyzer = new NumberAnalyzer();
	}

	@Test
	public void f2() {
		this.analyzer.setNumber(this.inputNumber);//13
		assertEquals(this.expectedResult, this.analyzer.isPrimeNumber());// check each value from array
	}//check with expected result with actual result

	@After
	public void destrory() {
		this.analyzer = null;
	}
}
