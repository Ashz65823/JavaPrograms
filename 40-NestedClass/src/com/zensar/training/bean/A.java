package com.zensar.training.bean;

public class A {
	private int x;
	private static int y; 
	/*inside a class if we defined a class it is called nested class
	 * Outer class A can access variables of inner class by creating object
	 * inner class can access outer class variable even it is private because they belong to the same class
	 * if the variable is static then it can be accessed by static class and non static class
	 * if the variable is non static then it can be accesses only by non static class */
	void test()
	{
		B b=new B(9);
		System.out.println(b.a);
	}
	public class B
	{ //constructor inside a inner class
		public B(int a) {
			super();
			this.a = a;
		}
		private int a;
		void m1()
		{
			System.out.println(x);
			System.out.println(y);
		}
	}
	public static class c{
		//static inner class
		void m2()
		{
			System.out.println(y);// x is not possible because x is of instance type not accessable in static class 
		}
	}
	public void calc()
	{
		class Calculator
		{
			int sum(int a,int b) {
				System.out.println(x);
				System.out.println(y);
			return a+b;
			}
			int sub(int a,int b) {
				return a-b;
				}
			int multi(int a,int b) {
				return a*b;
				}
			int div(int a,int b) {
				return a/b;
				}
			//method local inner class can be access within the method 
		}
	}

}
