package com.zensar.training.ui;

import java.util.Arrays;

public class Main3 {

	//Jagged Array
	public static void main(String[] args) {
		int [][]data;
		data=new int[5][];//if column is not specified then we can specify at run time
		data[0]=new int[] {35,45};
		data[1]=new int[] {1,2,3,4};
		data[2]=new int[] {};//empty
		int[]x= {90,91};
		int[]y=new int[] {100,200,300};
		data[3]=x;
		data[4]=y;
		for(int[]row:data)
		{
			System.out.println(Arrays.toString(row));
		}
		data=null;//-->remove reference
	}

}
