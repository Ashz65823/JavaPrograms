package com.zensar.training.ui;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Square;

public class Main4 {

	public static void main(String[] args) {
		Object[] object;//-->Object Type
		object=new Object[5];
		object[0]=new Circle(5);
		object[1]=new Square(10);
		object[2]=new String("Welcome");
		object[3]=75;//autoboxing
		object[4]=new Double(80.9);//autoboxing
		
		for(Object object2:object)//-->only object method will be executed
		{
			if(object2 instanceof Circle)//-> check if object2 is instance of Circle if so downcase to circle and display
			{
				Circle circle=(Circle) object2;
				System.out.println("Circle ="+circle.getRadius()+" Area ="+ circle.ComputeArea());
			}
			if(object2 instanceof Square)//-> check if object2 is instance of Square if so downcase to circle and display
			{
				Square square=(Square) object2;
				System.out.println("Square ="+square.getSize()+" Area="+ square.calculateArea());
			}
			if(object2 instanceof String)//-> check if object2 is instance of String if so downcase to circle and display
			{
				String str=(String) object2;
				System.out.println("String ="+str.toUpperCase());
			}
			if(object2 instanceof Integer)//-> check if object2 is instance of Integer if so downcase to circle and display
			{
				Integer temp=(Integer) object2;
				System.out.println("Integer ="+temp.intValue());
			}
			if(object2 instanceof Double)//-> check if object2 is instance of Double if so downcase to circle and display
			{
				Double temp=(Double) object2;
				System.out.println("Double ="+temp.doubleValue());
			}
		}

	}

}
