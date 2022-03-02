package com.zensar.training.bean;

public interface Checked {
	public static void checkInit() {
		System.out.println("Initializd");
	}
	default public void check(int i) {
		System.out.println(i);		
	}
	public abstract void greet(String s);//abstract method
}
