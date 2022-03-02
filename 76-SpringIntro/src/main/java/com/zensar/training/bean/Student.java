package com.zensar.training.bean;

public class Student {

	int rollNo;
	String name;
	double averageMark;
	public Student(int rollNo, String name, double averageMark) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.averageMark = averageMark;
	}
	public Student() {
		super();
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAverageMark() {
		return averageMark;
	}
	public void setAverageMark(double averageMark) {
		this.averageMark = averageMark;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", averageMark=" + averageMark + "]";
	}
	
}
