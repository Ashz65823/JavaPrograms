package com.zensar.training.ui;

public class Main3 {

	public static void main(String[] args) {
		
		CountryPrintingTask cp=new CountryPrintingTask();
		Thread t1,t2;
		t2=new Thread(cp);
		
		CityPrintingThread cpt=new CityPrintingThread();
		cpt.start();
		
	}

}
