package com.zensar.training.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.zensar.training.bean.Circle;

public class Main3 {

	public static void main(String[] args) {
		Collection<Circle> collection;
		
		collection=new ArrayList<Circle>();
		Circle c1=new Circle(14);
		Circle c2=new Circle(15);
		Circle c3=new Circle(16);
		
		collection.add(c1);
		collection.add(c2);
		collection.add(c3);
		collection.add(new Circle(17));//Anonymous object
		collection.add(new Circle(18));//Anonymous object
		System.out.println(collection);
		System.out.println(collection.contains(new Circle(15)));
		//collection.clear();
		Iterator<Circle> iterator=collection.iterator();
		while(iterator.hasNext())//traditional way
		{
			Circle circle=iterator.next();
			System.out.print("Radius = "+circle.getRadius());
			System.out.println(" Area = "+circle.ComputeArea());
		}
		for(Circle circle:collection)//morden way
		{
			System.out.println(circle.ComputeArea()+" "+circle);
		}
		System.out.println(collection.isEmpty());
		System.out.println(collection.size());
		
	}
/*
 * collect can be project specify type also
 * to string of array list will be called array list will in turn call circle class to string   */
}
