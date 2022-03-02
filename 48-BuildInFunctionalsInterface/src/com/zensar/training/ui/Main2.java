package com.zensar.training.ui;

import java.util.function.Supplier;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Gender;
import com.zensar.training.bean.Square;
import com.zensar.training.bean.Student;

public class Main2 {

	public static void main(String[] args) {
		Supplier<Integer> supplier1;
		supplier1=()->new Integer(100);
		System.out.println(supplier1.get());
		
		Supplier<Circle> supplier2=()->new Circle(25);
		System.out.println(supplier2.get().computeArea());
		
		Supplier<Square> supplier3=()->new Square(20);
		System.out.println(supplier3.get().calculateArea());

		Supplier<Student>supplier4=()->new Student(101, "Uday", Gender.MALE, 450, "BCA");
		System.out.println(supplier4.get().getName());
		System.out.println(supplier4.get().getDepartment()+" , "+supplier4.get().getAverageMark());
	}
}
/*
 * In Supplier there no parameter() taken and return a type T of variable
 * In Lambda -> means return, we don't have to explicitly call return
 * Get will return object which in turn call the to String method */
