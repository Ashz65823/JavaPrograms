package com.zensar.training.ui;

import com.zensar.training.bean.pack1.Addition;
import com.zensar.training.bean.pack1.Multiplication;
import com.zensar.training.bean.pack1.Task;

public class Main1 {

	public static void main(String[] args) {
		Task task;
		//method reference for static method
		task=Addition::add;//replacement for (a,b)->a+b; because we are writing same methods in a class we are trying to replace them with method reference 
		System.out.println(task.execute(10, 10));
		
		task=(a,b)->a*b;
		System.out.println(task.execute(10, 10));
		
		task=Multiplication::multip;//method reference for static method
		System.out.println(task.execute(3, 5));
	}

}
