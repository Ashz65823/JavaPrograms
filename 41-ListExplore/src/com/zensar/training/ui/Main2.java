package com.zensar.training.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main2 {

	public static void main(String[] args) {
		Collection<Double> collection;
		collection=new ArrayList<Double>();
		collection.add(1001.90);
		collection.add(2345.09);
		collection.add(301.90);
		collection.add(235.09);
		collection.add(901.00);
		collection.add(395.89);
		System.out.println(collection.size());
		System.out.println(collection);
		System.out.println(collection.contains(1001.90));
		collection.remove(901.0);//type should be of same type
		System.out.println(collection);
		System.out.println(collection.size());
		System.out.println(collection.isEmpty());
		//Iterate of java util class
		Iterator<Double> it=collection.iterator();
		while(it.hasNext())//traditional way
		{
			Double d1=it.next();//d1 is object of double-->get's next element of array like i++
			System.out.println(d1);
		}
		for(Double double1:collection)
		{
			System.out.println("Double "+double1);
		}
		collection.clear();
		System.out.println(collection.isEmpty());
		System.out.println(collection.size());
		/*Array list to string method will call when we print collection*/
	}

}
