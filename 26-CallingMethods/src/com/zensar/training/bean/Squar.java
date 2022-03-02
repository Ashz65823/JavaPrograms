package com.zensar.training.bean;

public class Squar {
	
	private int size;

	public Squar(int size) {
		super();
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Squar [size=" + size + "]";
	}
	

}
