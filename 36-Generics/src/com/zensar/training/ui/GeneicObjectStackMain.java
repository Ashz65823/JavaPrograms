package com.zensar.training.ui;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.ObjectStackImpl;
import com.zensar.training.bean.Square;

public class GeneicObjectStackMain {

	public static void main(String[] args) {
		ObjectStackImpl<Circle> impl=new ObjectStackImpl<Circle>(10);//T in Objectclass will be replaced by circle
		impl.push(new Circle(25));
		impl.push(new Circle(15));
		impl.push(new Circle(20));
		impl.push(new Circle(27));
		System.out.println(impl);
		Circle cl=impl.pop();
		System.out.println(cl.getRadius()+" , "+cl.ComputeArea());
		System.out.println(impl);
		
		ObjectStackImpl<String> impl2=new ObjectStackImpl<String>(10);
		impl2.push("Hello");
		impl2.push("How Are You");
		impl2.push("Doing ??");
		String s1=impl2.pop();
		System.out.println(s1.toUpperCase());
		System.out.println();
		System.out.println(impl2);
		
		ObjectStackImpl<Square> impl3=new ObjectStackImpl<Square>(10);
		impl3.push(new Square(20));
		impl3.push(new Square(23));
		impl3.push(new Square(25));
		impl3.push(new Square(26));
		impl3.push(new Square(27));
		Square s=impl3.pop();
		System.out.println(s.getSize()+" , "+ s.calculateArea());
		
		ObjectStackImpl<Double>impl4=new ObjectStackImpl<Double>(10);
		impl4.push(new Double(10.0));
		impl4.push(new Double(15.0));
		impl4.push(new Double(25.0));
		impl4.push(30.0);
		impl4.push(90.89);
		
		Double d=impl4.pop();
		System.out.println(d.intValue());
	}
}
