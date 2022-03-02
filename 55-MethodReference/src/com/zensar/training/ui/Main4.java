package com.zensar.training.ui;

import com.zensar.training.bean.pack3.Circle;
import com.zensar.training.bean.pack3.Geomentry;

public class Main4 {

	public static void main(String[] args) {
		Geomentry geomentry;
		geomentry=(i)->new Circle(i);
		Circle circle=geomentry.doPrepare(10);
		System.out.println(circle);
	}
}
