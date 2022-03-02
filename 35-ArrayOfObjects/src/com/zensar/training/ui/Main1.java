package com.zensar.training.ui;

import com.zensar.training.bean.Circle;
import com.zensar.training.bean.Square;

public class Main1 {

	public static void main(String[] args) {
		Circle[] circles;//-->Class type array
		circles=new Circle[3];//new int [3] same as that [] is for array of object
		
		circles[0]=new Circle(5);
		circles[1]=new Circle(6);
		circles[2]=new Circle(7);
		
		for(int i=0;i<circles.length;i++)
		{
			System.out.println(circles[i].getRadius()+" Area= "+ circles[i].ComputeArea());
		}
		for(Circle circle:circles)
		{
			System.out.println(circle);
		}
		
		circles=null;	
	}
}
