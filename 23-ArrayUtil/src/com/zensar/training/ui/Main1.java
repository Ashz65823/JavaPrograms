package com.zensar.training.ui;

import java.util.Arrays;
import static java.util.Arrays.sort;

public class Main1 {

	public static void main(String[] args) {
		int []arr1= {10,20,30,45,12,28};//-->Valid
		/*
		 * String str=""; for(int i:arr1) { str=str+i+",";
		 * 
		 * } System.out.println(str);
		 *
		 *this will happe array
		 */
		String str=Arrays.toString(arr1);
		System.out.println(str);
		
		sort(arr1);//if array.sort imported then we dont have to write Arrays.sort(arr1);
		str=Arrays.toString(arr1);
		System.out.println(str);
		
		System.out.println(Arrays.binarySearch(arr1, 30));
	}

}
