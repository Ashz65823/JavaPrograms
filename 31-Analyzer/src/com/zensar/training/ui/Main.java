package com.zensar.training.ui;

import com.zensar.training.bean.NumberProcessing;

public class Main {

	public static void main(String[] args) {
		
		NumberProcessing numberProcessing;
		numberProcessing=new NumberProcessing(10);
		System.out.println(numberProcessing.toString());
		numberProcessing.add(34);
		numberProcessing.add(18);
		numberProcessing.add(22);
		numberProcessing.add(13);
		numberProcessing.add(61);
		numberProcessing.add(89);
		numberProcessing.add(44);
		numberProcessing.add(10);
		numberProcessing.add(8);
		numberProcessing.add(1);
				
		System.out.println(numberProcessing.toString());
		System.out.println("Maximun="+numberProcessing.getMaximun());
		System.out.println("Sum="+numberProcessing.getSum());
		System.out.println("Minimun="+numberProcessing.getMinimun());

	}
}
