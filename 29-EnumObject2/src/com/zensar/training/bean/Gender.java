package com.zensar.training.bean;

public enum Gender {
	MALE(170,60,'M'),FEMALE(160,50,'F');//-->predefind value with same signature of constructor
	
	int avgHeight;
	int avgWeight;
	char value;
	
	
	private Gender(int avgHeight, int avgWeight, char value) {
		this.avgHeight = avgHeight;
		this.avgWeight = avgWeight;
		this.value = value;
	}
	
	public int getAvgHeight() {
		return avgHeight;
	}
	public void setAvgHeight(int avgHeight) {
		this.avgHeight = avgHeight;
	}
	public int getAvgWeight() {
		return avgWeight;
	}
	public void setAvgWeight(int avgWeight) {
		this.avgWeight = avgWeight;
	}
	public char getValue() {
		return value;
	}
	public void setValue(char value) {
		this.value = value;
	}
	
	
	

}
