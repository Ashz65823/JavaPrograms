package com.zensar.training.ui;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Square;

public class Main3 {

	public static void main(String[] args) {
		Object obj;
		obj=new Circle(5);//-->circle is subclass of obj-->This is upcasting (Implicitly)
		
		Circle temp=(Circle)obj;//->Down casting(Explicit)
		System.out.println(temp.getRadius()+" Area ="+ temp.ComputeArea());
		
		obj=new Square(10);
		Square temp2=(Square)obj;
		System.out.println(temp2.getSize()+" Area ="+temp2.calculateArea());
		
		obj=new String("Welcome");
		String tempString=(String)obj;
		System.out.println(tempString.toUpperCase());
		
		obj=new Integer(10);
		Integer tempInt=(Integer)obj;
		System.out.println(tempInt.intValue());
		
		obj=new Double(80.0);
		Double tempDouble=(Double)obj;
		System.out.println(tempDouble.intValue());
		
		Object obj1=new Square(10);
		//Square square=(Square)obj1;//exception class caste exception
		//System.out.println(obj1 instanceof Square);
		if(obj1 instanceof Circle)
		{
			Circle tep=(Circle)obj1;
			System.out.println("Temp ="+tep);
		}
		if(obj1 instanceof Square)
		{
			Square tmp=(Square) obj1;
			System.out.println("Temp ="+tmp);
		}
		if(obj1 instanceof String)
		{
			String tmp=(String) obj1;
			System.out.println("Temp ="+ tmp.toUpperCase());
		}
		
	}

}
/*
 * Obj can be used refere any class but it will have method of object class alone
 * to access the method of subclass we have to downcaste*/
