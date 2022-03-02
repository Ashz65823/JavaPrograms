package com.zensar.training.ui;

import com.zensar.training.bean.Square;

public class Main2 {

	public static void main(String[] args) {
		Square[] squares=new Square[4];
		squares[0]=new Square(4);
		squares[1]=new Square(6);
		squares[2]=new Square(8);
		squares[3]=new Square(2);
		
		for(int i=0;i<squares.length;i++)
		{
			System.out.println(squares[i].getSize()+" Area= "+squares[i].calculateArea());
		}
		for(Square square:squares)
		{
			System.out.println(square);
		}
		squares=null;
	}
}
/*
 * to String to get data of object other than hash-code
 *  */
 