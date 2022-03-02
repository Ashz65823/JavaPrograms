package com.zensar.training;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class CalculatorServiceTest {

	@Mock
	CalculatorService service;
	
	@BeforeEach
	public void init()
	{
		//service = Mockito.mock(CalculatorService.class);
	}
	@Test
	@DisplayName("Addition")
	public void f1() {
		// interface-marking the object as dummy interface
		Mockito.when(service.add(10, 20)).thenReturn(30);// when add() is called return 30;
		assertEquals(30, service.add(10, 20));
	}

	@Test
	@DisplayName("Subtraction")
	public void f2() {
		
		Mockito.when(service.subtract(3, 3)).thenReturn(0);
		assertEquals(0, service.subtract(3, 3));
	}

	@Test
	@DisplayName("Multiplication")
	public void f3() {
		
		Mockito.when(service.product(3, 3)).thenReturn(9);
		assertEquals(9, service.product(3, 3));
	}
	
	@Test
	@DisplayName("False Assertion")
	public void f4()
	{
		
		Mockito.when(service.product(10, 20)).thenReturn(100);//marking object
		assertEquals(100, service.product(10, 20));
	}
	
	@Test
	@DisplayName("Division with false assertion")
	public void f5() {
		
		Mockito.when(service.divide(20, 10)).thenReturn(500);
		assertEquals(500, service.divide(20, 10));
	}
	
	@AfterEach
	public void destroy()
	{
		//this.service=null;
	}
	
//because not created implementation
	/*
	 * @test is from org.junit.test
	 * @Mock is used to inject service = Mockito.mock(CalculatorService.class); by default
	 * Removed @BeforEach and AfterEach
	 * 
	 * */
}
