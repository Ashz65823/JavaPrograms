package com.zensar.training.ui;

import java.util.Arrays;

import com.zensar.training.bean.DemoClass;
import com.zensar.training.bean.Squar;

public class Main {

	public static void main(String[] args) {
		
		DemoClass dClass=new DemoClass();
		long a=80l;
		System.out.println("Before invocation "+a);
		
		//dClass.demo1(a);
		dClass.demo1(a);//-->static method of same class;
		System.out.println("After invocation "+a);
		System.out.println("--------------------------------------------------");
		
		int[] arr=new int[] {1,2,3};
		System.out.println("Before invocation"+Arrays.toString(arr));
		
		dClass.demo2(arr);
		System.out.println("After invocation"+Arrays.toString(arr));
		System.out.println("-------------------------------------------");
		
		Squar squar=new Squar(5);
		System.out.println("Before Invocation" +squar);
		DemoClass.demo3(squar);
		System.out.println("After Invocation "+squar);

	}

}
