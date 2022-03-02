package com.zensar.training.bean;

public interface SalaryCalculater {

	public double computeAllowance(double basic) throws Throwable;
}
/*
 * interface should have throws when an exception is occurred in implemented  class
 *Throwable can handle any exception thrown by the implemented class 
 *The exception in main or interface should have narrow exception here Throwable is the super class and the exception is the subclass of throwable  
 * */
 