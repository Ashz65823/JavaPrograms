package com.zensar.training.ui;

import com.zensar.training.bean.Square;
import com.zensar.training.bean.SquareStackImpl;

public class Main5 {

	public static void main(String[] args) {
		Square sqr1,sqr2,sqr3,sqr4;
		sqr1=new Square(4);
		sqr2=new Square(2);
		sqr3=new Square(6);
		sqr4=new Square(8);
		SquareStackImpl sqImpl=new SquareStackImpl(10);
		sqImpl.push(sqr1);
		sqImpl.push(sqr2);
		sqImpl.push(sqr3);
		sqImpl.push(sqr4);
		System.out.println(sqImpl);
		System.out.println(sqImpl.pop());
		sqImpl.push(new Square(10));
		sqImpl.push(new Square(12));
		System.out.println(sqImpl.pop());
		System.out.println(sqImpl);
		

	}

}
