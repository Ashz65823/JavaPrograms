package com.zensar.training.ui;

import com.zensar.training.bean.Processing;

public class MainProcessing {

	public static void main(String[] args) {
		Processing<String> processing=new Processing<String>();
		processing.setData("Welcome");
		String s=processing.gettData();
		System.out.println(s.toUpperCase());

		Processing<Integer> processing2=new Processing<Integer>();
		processing2.setData(100);
		Integer i=processing2.gettData();
		System.out.println(i.intValue());
		
	}

}
