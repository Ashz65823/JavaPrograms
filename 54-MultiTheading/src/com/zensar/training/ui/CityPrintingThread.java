package com.zensar.training.ui;

public class CityPrintingThread extends Thread{

	@Override
	public void run()
	{
		String []city= {"Mumbai","Delhi","Bangalore"};
		for(String str:city)
		{
			System.out.println(Thread.currentThread().getName()+":"+str);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		
	}	

}
