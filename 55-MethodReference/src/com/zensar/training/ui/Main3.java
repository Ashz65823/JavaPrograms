package com.zensar.training.ui;

import java.util.LinkedList;
import java.util.List;

public class Main3 {

	public static void main(String[] args) {
		List<String> names=new LinkedList<>();
		names.add("Ash");
		names.add("Bala");
		names.add("chandana");//ash bala chandana are arbitrary object
		
		names.stream().map(String::toUpperCase).forEach((s)->System.out.println(s));
		
		/*Methos reference for arbitrary object of a particular type
		 * # STring object
		 * */
		
	}

}
