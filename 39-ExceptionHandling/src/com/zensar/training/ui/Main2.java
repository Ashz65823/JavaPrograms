package com.zensar.training.ui;

public class Main2 {

	public static void main(String[] args) {
		System.out.println("Program Begins....");
		int [] arr= {10,20,30};
		String str="125";
		try {
		System.out.println(arr[0]);
		//System.out.println(arr[10]);//index out of bound
		int x=Integer.parseInt(str);//error
		x++;
		System.out.println(x);
		System.out.println(12.0/0);//only int is not possible double will work
		String s=null;
		System.out.println(s.toUpperCase());
		}catch(ArithmeticException e)
		{
			System.out.println("Arithmetic error");
		}
		catch(NumberFormatException | ArrayIndexOutOfBoundsException e)
		{if(e instanceof NumberFormatException)
			System.out.println("Number Fomat Error");
		if(e instanceof ArrayIndexOutOfBoundsException)
			System.out.println("Array index is out of bound");
		}
		//catch(Exception e)
		catch(Throwable e)//All the above exception can be of runtime exception
		{
		System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finally run always");
		}
		/*
		 * catch(NumberFormatException e) { System.out.println(e.getMessage()); }//This
		 * catch will not work whn arr[6] catch (ArithmeticException e) {
		 * System.out.println(e.getMessage()); }
		 * exception can of exact type 
		 * exception type
		 * run time exception
		 * Trowable exception
		 * but not object
		 * Throwable should be last when nothing is specified in list throwable will be excuted
		 */
		
		System.out.println("Program Ends...");

	}

}
