package com.zensar.training;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.zensar.training.bean.SimpleCalculator;

public class SimpleCalculatorTest {
SimpleCalculator simpleCalculator;

@BeforeAll//execute once before all
public static void init1()
{
	System.out.println("Class Loading");
}
@AfterAll //execute once  after all
public static void delete()
{
	System.out.println("Deleteing class");
}

@BeforeEach// execute each time when an @test function is invoked
public void init()
{
	simpleCalculator=new SimpleCalculator();
	System.out.println("before all");
}
	
	
	@Test
	public void testingAddFunction()
	{
		
		int expectedRestult=30;
		int actual=simpleCalculator.add(10, 20);
		assertEquals(expectedRestult, actual);//to check if expected is equal as actual result
		
	}
	
	@Test
	public void testingMultiply()
	{
		
		int expect=30;
		int actual=simpleCalculator.multiply(5, 6);
		assertEquals(expect, actual);
		
	}
	@Test
	public void testingSubract()
	{
		int expect=4;
		int actual=simpleCalculator.subract(10, 6);
		assertEquals(expect, actual);
		
	}
	@Test
	public void testingdivide()
	{
		int expect=2;
		int actual=simpleCalculator.divide(10, 5);
		assertEquals(expect, actual);
		
	}
	
	@AfterEach //execute each time after @test function is executed
	public void destroy() {
		simpleCalculator=null;
		System.out.println("After All");
	}
}
