package com.zensar.training.ui;

import com.zensar.training.bean.IntStackImpl;

public class StackMain {

	public static void main(String[] args) {
		IntStackImpl intStack=new IntStackImpl(10);
		
		intStack.push(25);
		intStack.push(20);
		intStack.push(30);
		intStack.push(40);
		intStack.push(27);
		intStack.push(4);
		intStack.push(7);
		System.out.println(intStack.toString());
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		System.out.println(intStack.toString());
		

	}

}
