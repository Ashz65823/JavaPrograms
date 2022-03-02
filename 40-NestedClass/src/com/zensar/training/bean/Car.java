package com.zensar.training.bean;

import java.util.Arrays;

public class Car {
	Engine engine;//has a relationship
	Wheel[] wheel=new Wheel[4];//has a relationship
	//Aggregate object car wheel and engine
	public Car()//constructor
	{
		this.engine=new Engine();
		this.wheel=new Wheel[] {new Wheel(),new Wheel(),new Wheel(),new Wheel()};
	}
	
	
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Wheel[] getWheel() {
		return wheel;
	}
	public void setWheel(Wheel[] wheel) {
		this.wheel = wheel;
	}
	@Override
	public String toString() {
		return "Car [engine=" + engine + ", wheel=" + Arrays.toString(wheel) + "]";
	}
	//------------------------------------------------------------------------------------
	//class within class-->nested class or inner class
	private class Engine {

		@Override
		public String toString() {
			return "Engine []";
		}

	}
	public class Wheel {
		@Override
		public String toString() {
			return "Wheel []";
		}

	}


}
