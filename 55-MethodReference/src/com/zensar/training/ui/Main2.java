package com.zensar.training.ui;

import com.zensar.training.bean.pack2.GoodBye;
import com.zensar.training.bean.pack2.Hello;
import com.zensar.training.bean.pack2.Welcome;

public class Main2 {

	public static void main(String[] args) {

		Hello hello;
		//hello=()->System.out.println("How are you");
		
		//method Reference to the method inside a object since method are not static in implemented class
		Welcome welcome=new Welcome();
		hello=welcome::sayWelcome; 
		hello.doIt();
		
		GoodBye bye=new GoodBye();
		hello=bye::sayGoodBye;
		hello.doIt();
		
	}

}
