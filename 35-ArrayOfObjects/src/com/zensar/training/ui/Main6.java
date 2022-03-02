package com.zensar.training.ui;

import com.zensar.training.bean.Circle;

public class Main6 {

	public static void main(String[] args) {
		Circle c1=new Circle(11);
		Circle c2=new Circle(22);
		Circle c3=new Circle(11);
		System.out.println(c1.compareTo(c2));//comparing objects
		System.out.println(c2.compareTo(c1));
		System.out.println(c1.compareTo(c3));

	}

}
