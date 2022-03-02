package com.zensar.training.ui;

public class CountryPrintingTask implements Runnable{

	@Override
	public void run() {
		String countries[]= {"India","Sri Lank","German","Italy","Canada","France"};
		for(String str:countries)
		{
			System.out.println(Thread.currentThread().getName()+":"+str);
		}
		
	}

}
