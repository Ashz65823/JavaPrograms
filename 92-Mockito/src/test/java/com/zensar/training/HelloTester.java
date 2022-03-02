package com.zensar.training;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

//Testing void classes

@RunWith(MockitoJUnitRunner.class)
public class HelloTester {

	@Test
	public void f1() {
		Hello mockedHello = Mockito.mock(Hello.class);
		Mockito.doNothing().when(mockedHello).sayHello("Savitha");// will not do anything when a function is called
		mockedHello.sayHello("Savitha");
	}

	@Test
	public void f2() {
		Hello mockedHello = Mockito.mock(Hello.class);
		Mockito.doCallRealMethod().when(mockedHello).sayHello("Savitha");// this will call real method and output will
																			// be in console
		mockedHello.sayHello("Savitha");
	}

	@Test
	public void f3() {
		Hello mockedHello = Mockito.mock(Hello.class);
		Mockito.doAnswer((invocation) -> {// Lambda expression-->invocation detail is caught here
			String param = invocation.getArgument(0);// Invocation is an object of any type-->by default stubbed type
			System.out.println(param);
			return invocation.callRealMethod();// an output is present in console
		}).when(mockedHello).sayHello(Mockito.anyString());
		mockedHello.sayHello("Savitha");// invocation
	}
	/*
	 * doAnswer take a lambda expression with argument display the argument passed
	 */

	@Test
	public void f4() {
		Hello mockedHello = Mockito.mock(Hello.class);
		Mockito.doAnswer((invocation) -> {
			int a = invocation.getArgument(0);
			double b = invocation.getArgument(1);
			System.out.println(a + "," + b);
			invocation.callRealMethod();// return sum
			return null;// can return invocation.callRealMethod();
		}).when(mockedHello).PrintCalculate(Mockito.anyInt(), Mockito.anyDouble());
		// mockedHello.PrintCalculate(10, 20); this will pass
		mockedHello.PrintCalculate(10, 20);

		// mockedHello.PrintCalculate(80, 90);//will fail.. this is called unnecessary
		// Stubbing exception
	}

	@Test
	public void f5() {
		Hello mockedHello = Mockito.mock(Hello.class);
		Mockito.doAnswer((invocation) -> {
			int n = invocation.getArgument(0);
			System.out.println(n);
			invocation.callRealMethod();// return factorial
			return null;
		}).when(mockedHello).PrintFactorial(Mockito.anyInt());// Instead of give an specific number we are giving anyInt
																// so that we can test for any value
		mockedHello.PrintFactorial(5);
	}

	// if incoming argument is negative it will throw an IllegalArgumentException to
	// pass the function then in test will give
	// expected=IllegalArgumentException.class
	
	
	@Test(expected = IllegalArgumentException.class)
	public void f6() {
		Hello mockedHello = Mockito.mock(Hello.class);

		Mockito.doThrow(IllegalArgumentException.class).when(mockedHello).PrintFactorial(-5);
		// Mockito.doCallRealMethod().when(mockedHello).PrintFactorial(-5);
		mockedHello.PrintFactorial(-5);
	}
	/*
	 * .any is used to specify any value without any specific value eg..
	 * .anyInt->will take any integer value,anyString can take any string value
	 */

	@Test
	public void f7() {
		Hello mockedHello = Mockito.mock(Hello.class);
		/*
		 * mockedHello.sayHello("Ashwini"); mockedHello.sayHello("Ravi");
		 * Mockito.verify(mockedHello,
		 * Mockito.times(2)).sayHello(Mockito.anyString());//Mockito.times(3)-->leads to
		 * failer
		 */
		Mockito.verify(mockedHello,Mockito.never()).sayHello(Mockito.anyString());//since it has not executed even once it will pass
	}
}
