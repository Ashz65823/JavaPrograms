package com.zensar.training.bean;

public class IdGenetator {// singleton class design --single object class// single tone class design partten

	private int number=0;
	private static IdGenetator genetator;//--->because the id geneator method is static since static method can access static variable
	
	public static IdGenetator getInstance()//-->method to create only one object that is when the class is invoked for the 1st time later same object is made as reference
	{
		if(genetator==null)
			genetator=new IdGenetator();
		return genetator;
	}
	
	private IdGenetator()
	{
		//we have made the constructor as private because only the author of the class is suppose to create object for single ton class--> this constructor will override default constructor which is of public type
	}
	
	public int getNextId () {
		return ++ this.number;//-->++number
	}
}
