package com.zensar.training.ui;


import java.util.LinkedList;
import java.util.List;

import com.zensar.training.bean.Square;

public class Main6 {

	public static void main(String[] args) {
		List<Square> AllSquare=new LinkedList<>();//<> means square
		Square s1=new Square(5);
		Square s2=new Square(6);
		Square s3=new Square(7);
		Square s4=new Square(8);
		Square s5=new Square(9);
		AllSquare.add(s1);
		AllSquare.add(s2);
		AllSquare.add(s3);
		AllSquare.add(s4);
		AllSquare.add(s5);
		System.out.println(AllSquare.get(AllSquare.size()-1));
		System.out.println(AllSquare);
		AllSquare.add(3,new Square(100));
		System.out.println(AllSquare);
		AllSquare.set(0, new Square(200));//replace
		System.out.println("All Square "+AllSquare);
		System.out.println(AllSquare.indexOf(new Square(6)));//check for index position if found 1 not found -1
		System.out.println(AllSquare.indexOf(new Square(1000) ));
		System.out.println(AllSquare.contains(new Square(9)));
		
		for(Square square:AllSquare)
		{
			System.out.println(square.calculateArea());
		}
		AllSquare.clear();
		AllSquare=null;
	}

}
