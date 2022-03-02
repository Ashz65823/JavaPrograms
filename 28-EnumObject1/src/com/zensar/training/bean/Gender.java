package com.zensar.training.bean;

public class Gender {
	private int avgHeight;
	private int avgWeight;
	
	 public static final Gender MALE=new Gender(170, 60);
	 public static final Gender FEMALE=new Gender(160, 50);
	 
	private Gender(int avgHeight, int avgWeight) {
		super();
		this.avgHeight = avgHeight;
		this.avgWeight = avgWeight;
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
	

}
