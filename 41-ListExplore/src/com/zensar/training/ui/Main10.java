package com.zensar.training.ui;

import java.util.Set;
import java.util.TreeSet;

import com.zensar.training.bean.Rectangle;
import com.zensar.training.bean.RectangleHeightComparator;

public class Main10 {

	public static void main(String[] args) {
		RectangleHeightComparator comparator=new RectangleHeightComparator();
		Set<Rectangle>myset=new TreeSet<>(comparator);
		myset.add(new Rectangle(100,200));
		myset.add(new Rectangle(1000, 500));
		
		System.out.println(myset);//Tree set works only comparator is implement 
	}
/*
 * Comparator can either be created in a different class(RectangleHeightComparator) or in the same class as Rectangle or in the main class but it has to be created based on any condition to execute tree set*/
}
