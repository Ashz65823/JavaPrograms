package com.zensar.training.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main1 {

	public static void main(String[] args) {
		Collection<String> collection;//inteface
		collection=new ArrayList<String>();//string is not necessary
		collection.add("Welcome");
		collection.add("To");
		collection.add("Zensar");
		collection.add("Happy");
		collection.add("being ");
		collection.add("Zensar");		
		System.out.println(collection);
		collection.remove("Zensar");//remove 1st element that match
		System.out.println(collection);
		System.out.println(collection.size());
		System.out.println(collection.contains("To"));//collection is case sencetive
		System.out.println(collection.isEmpty());
		
		//iterator
				Iterator<String> it=collection.iterator();
				while(it.hasNext())//check if elements there in collection-->While is the traditional way..
				{
					String str=it.next();//next object is checked
					System.out.println(str.toUpperCase());
				}
				
				
				for(String string:collection)//morden way
				{
					System.out.println("String "+string);
				}
				//remove all element
		collection.clear();
		System.out.println(collection.isEmpty());
		System.out.println(collection.size());
		
		
	}

}
