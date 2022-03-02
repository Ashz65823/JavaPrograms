package com.zensar.training.ui;

public class tryMain {

	public static void main(String[] args) {
		int[][]arr=new int[3][];
		arr[0]=new int[] {1,2,3};
		arr[1]=new int[] {10,20};
		byte b=110;
		arr[2]=new int[] {50,60,b};
		System.out.println(arr.length+arr[2][2]);
	}

}
