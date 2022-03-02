package com.zensar.training.ui;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetMain {

	public static void main(String[] args) {
		Set<String> myset=new LinkedHashSet<>();
		myset.add("Welcome");
		myset.add("To");
		myset.add("Zensar");
		myset.add("Training");
		myset.add("Bangalore");
		myset.add("Welcome");
		System.out.println(myset);//tree set is an sorted collection
		System.out.println(myset.isEmpty());
	}
	/*
	 * Maintain insertion order
	 * used for search faster
	 * 
	 * */
}


