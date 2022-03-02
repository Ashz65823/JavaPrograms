package com.zensar.training.ui;

public class Main2 {

	public static void main(String[] args) throws InterruptedException {
		Thread t1=new CityPrintingThread();
		t1.start();//runnable
		//System.out.println(t1.isAlive());
		t1.join();//let t1 finish first
		for(int i=1;i<=25;i++)
		{
			System.out.println(i);
		}//Current running thread is main
		//t1->running state
		System.out.println(t1.isAlive());
	}

}
/*
 * Join is useful when we want an thread to finish it execute and start the next execution 
 * join is more like helping the thread to execute it's function and other thread doing it execution 
 * after join finish
 * */
