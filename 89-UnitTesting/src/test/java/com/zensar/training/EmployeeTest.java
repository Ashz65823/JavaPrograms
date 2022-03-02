package com.zensar.training;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.zensar.training.bean.Employee;
import com.zensar.training.bean.InvalidSalaryException;

public class EmployeeTest {

	Employee employee;

	@BeforeEach
	public void init() {
		employee = new Employee();
		System.out.println("<<<<<<<<<<<<<Init before test>>>>>>>>>>>>>");
	}

	@Test
	@DisplayName("Allowance Testing 1 Postive ")
	public void test1() throws InvalidSalaryException  {
		employee.setBasicSalary(1000);
		double expect = 200;
		double actual = employee.computeAllowance();
		assertEquals(expect, actual);

	}

	@Test
	@DisplayName("Allowance Testing 2 Postive ")
	public void test2() throws InvalidSalaryException {
		employee.setBasicSalary(20000);
		double expect = 4000;
		double actual = employee.computeAllowance();
		assertEquals(expect, actual);
	}

	@Test
	@DisplayName("Allowance Testing 3 Negative ")
	public void test3() {
		Exception ex=assertThrows(InvalidSalaryException.class,()->this.employee.setBasicSalary(-20000));
		assertEquals("Salary Cannot be negative",ex.getMessage());
	}

	@Test
	@DisplayName("Allowance Testing 4 Negative ")
	public void test4() {
		Exception ex=assertThrows(InvalidSalaryException.class,()->this.employee.setBasicSalary(-31000));
		assertEquals("Salary Cannot be negative",ex.getMessage());
	}
	
	@Test
	@DisplayName("Allowance Testing 5 Negative ")
	public void test5()
	{
		Exception ex=assertThrows(InvalidSalaryException.class,()->this.employee.setBasicSalary(-1000));
		assertEquals("Salary Cannot be negative",ex.getMessage());
	}

	@AfterEach
	public void delete() {
		employee = null;
		System.out.println("<<<<<<<<<<<<<Delete after test>>>>>>>>>>>>>");
	}

}
