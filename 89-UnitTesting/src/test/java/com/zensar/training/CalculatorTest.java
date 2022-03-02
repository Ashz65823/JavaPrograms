package com.zensar.training;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.zensar.training.bean.Calculator;

public class CalculatorTest {

	Calculator calculator;

	@BeforeEach
	public void init() {
		calculator = new Calculator();
		System.out.println("<<<<<<<<<<<<<Init before test>>>>>>>>>>>>>");
	}

	@Test
	public void addTestWithPostiveNumber() {
		calculator.setNumber1(10);
		calculator.setNumber2(20);
		int expected = 30;
		int actual = calculator.sum();
		assertEquals(expected, actual);
	}

	@Test
	public void addTestWithNegativeNumber() {
		calculator.setNumber1(-10);
		calculator.setNumber2(20);
		int expected = 10;
		int actual = calculator.sum();
		assertEquals(expected, actual);
	}

	@Test
	public void differenceTestWithPostiveNumber() {
		calculator.setNumber1(20);
		calculator.setNumber2(20);
		int expected = 0;
		int actual = calculator.different();
		assertEquals(expected, actual);
	}

	@Test
	public void diffrenceTestWithNegativeNumber() {
		calculator.setNumber1(-20);
		calculator.setNumber2(-30);
		int expected = 10;
		int actual = calculator.different();
		assertEquals(expected, actual);
	}

	@Test
	public void multiplyTestWithPostiveNumber() {
		calculator.setNumber1(10);
		calculator.setNumber2(20);
		int expected = 200;
		int actual = calculator.product();
		assertEquals(expected, actual);
	}

	@Test
	public void multiplyTestWithNegativeNumber() {
		calculator.setNumber1(-10);
		calculator.setNumber2(20);
		int expected = -200;
		int actual = calculator.product();
		assertEquals(expected, actual);
	}

	@Test
	public void divideTestWithPostiveNumber() {
		calculator.setNumber1(50);
		calculator.setNumber2(5);
		int expected = 10;
		int actual = calculator.divide();
		assertEquals(expected, actual);
	}

	@Test
	public void divideTestWithNegativeNumber() {
		calculator.setNumber1(-60);
		calculator.setNumber2(3);
		int expected = -20;
		int actual = calculator.divide();
		assertEquals(expected, actual);
	}

	@AfterEach
	public void destroy() {
		calculator = null;
		System.out.println("<<<<<<<<<<<<<Deleting after test>>>>>>>>>>>>>");
	}

}
