package com.zensar.training.ui;

import java.util.ArrayList;
import java.util.List;

public class Main4 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Welcome");
		list.add("Hello");
		list.add("Zensar");
		list.add("Training");
		list.add("Welcome");
		list.add("Home");
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		System.out.println("First "+list.get(0));
		System.out.println("Last "+list.get(list.size()-1));//last index
		list.set(1, "Bangalore");//replace
		System.out.println("Position "+list.indexOf("Zensar"));
		list.indexOf("Zensar");
		list.indexOf("Training");
		list.contains("Home");
		list.add(2,"Chennai");
		System.out.println(list);
		System.out.println(list.size());
		for(String list2:list)
		{
			System.out.println(list2.charAt(0));
		}
		
	}

}
