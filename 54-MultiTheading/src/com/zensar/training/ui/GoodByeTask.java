package com.zensar.training.ui;

public class GoodByeTask implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<10;i++)
		{
			System.out.println("Goodbyeee");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	
}
