package com.zensar.training.ui;

import java.util.Set;
import java.util.TreeSet;

public class TreeMain {

	public static void main(String[] args) {
		Set<String> myset=new TreeSet<>();
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
 * tree should have comparable to sort
 * tree will accomplish with comparable*/
}
