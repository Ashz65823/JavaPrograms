package com.zensar.training.ui;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main8 {

	public static void main(String[] args) {
		Set<String> myset=new HashSet<>();
		myset.add("Welcome");
		myset.add("To");
		myset.add("Zensar");
		myset.add("Training");
		myset.add("Bangalore");
		myset.add("Welcome");//will not get duplicated since already added
		System.out.println(myset);
		System.out.println(myset.size());
		System.out.println(myset.contains("Welcome"));
		System.out.println(myset.isEmpty());
		myset.remove("Zensar");
		Iterator<String> it=myset.iterator();
		while(it.hasNext())
		{
			String str=it.next();
			System.out.println(str.toUpperCase());
		}
		for(String str:myset)
		{
			System.out.println(str.toUpperCase());
		}
		
		myset.clear();
		System.out.println(myset.isEmpty());
		//---------------------------------------------------------------------
	}
	/*
	 * does not duplicate values
	 * Insertion order is not maintained*/

}
