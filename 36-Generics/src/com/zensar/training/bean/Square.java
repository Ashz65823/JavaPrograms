package com.zensar.training.bean;

public class Square implements Comparable {
	
	private int size;

	public Square(int size) {
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
		return "Square [size=" + size + "]";
	}
	public double calculateArea()
	{
		return this.size*this.size;
	}

	@Override
	public int compareTo(Object o) {
		Square temp=(Square)o;//down-case
		if(this.size>temp.size)
			return 1;
		if(this.size<temp.size)
			return -1;				
		return 0;
	}

}
