package com.zensar.training.ui;

import com.zensar.training.bean.Car;

public class Main1 {
	public static void main(String[] args) {
		Car car=new Car();
		//when car object is called the constructor inside car will create engine and wheel object
		//only when car object is created the engine and wheel object will be created
		System.out.println(car);
		
		Car car2=new Car();
		/*
		 * car2.setEngine(engine2);//use the same object(engine) of car... same engine
		 * cannot be access by both car object car2.setWheel(wheels2);//use the same
		 * wheel of first car object so what we do is that we create new engine and
		 * wheel for new car
		 */		
		Car car3=new Car();
		//create new engine or use existing engine this is week relationship
		/*
		 * car3.setEngine(engine2); car3.setWheel(wheels2);
		 */
		/*the relationship between car and engine is week relationship
		 * the client can only have car class*/
	}

}
