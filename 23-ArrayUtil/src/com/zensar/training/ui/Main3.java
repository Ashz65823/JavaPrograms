package com.zensar.training.ui;

import java.util.Arrays;
import static java.util.Arrays.*;
public class Main3 {

	public static void main(String[] args) {
		String[]cities=new String[] {"Delhi","Banaglore","Chennai","Pune"};
		
		String str=Arrays.toString(cities);
		System.out.println(str);
		sort(cities);
		System.out.println(binarySearch(cities, "Delhi"));

	}

}
