package com.zensar.training.bean;

public class Circle {
	int radius;
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override //overriding object class toString method
	public String toString()
	{
		return "Circle[Radius="+this.radius+"]";
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj==this)
			return true;
		if(!(obj instanceof Circle ))
			return false;
		
		if(obj==null)
			return false;
		
		Circle temp=(Circle)obj;//-->trying to downcast
		if(temp.radius==this.radius)
			return true;
		return false;
		
	}

}
