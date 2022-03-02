package com.zensar.training.ui;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.ObjectStackImpl;
import com.zensar.training.bean.Square;

public class ObjectStackMain {//hetro genious collection of object//-->Type

	public static void main(String[] args) {
		Circle c1=new Circle(6);
		Square sql=new Square(7);
		String str=new String("Hello");
		Double double1=new Double(300.00);
		Boolean boolean1=new Boolean(true);
		Integer integer=new Integer(75);
		
		ObjectStackImpl oImpl=new ObjectStackImpl(10);
		oImpl.push(c1);
		oImpl.push(sql);
		oImpl.push(str);
		oImpl.push(double1);
		oImpl.push(boolean1);
		oImpl.push(integer);
		System.out.println(oImpl);
		Integer popped=(Integer)oImpl.pop();
		System.out.println(popped);
		System.out.println(oImpl.pop());
		System.out.println(oImpl.pop());
		System.out.println(oImpl.pop());
		
		Object obj=oImpl.pop();
		if(obj instanceof Circle)
		{
			Circle circle=(Circle)obj;
			System.out.println(circle.getRadius()+", "+circle.ComputeArea());;
		}
		if(obj instanceof Square)
		{
			Square square=(Square)obj;
			System.out.println(square.getSize()+" , "+square.calculateArea());;
		}
		System.out.println(oImpl);
		
		
	}

}
