package com.zensar.training.ui;

public class DummyRunnable implements Runnable {

	@Override
	public synchronized void run() {
		System.out.println("[");
		for(int i=1;i<=6;i++)
		{
			System.out.print(i+",");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("]");
	}

}
