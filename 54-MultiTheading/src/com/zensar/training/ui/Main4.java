package com.zensar.training.ui;

public class Main4 {

	public static void main(String[] args) throws InterruptedException {
	Runnable countryPrintingRunnable;
	countryPrintingRunnable=()->{
		String countries[]= {"India","Sri Lank","German","Italy","Canada","France"};
		for(String str:countries)
		{
			System.out.println(Thread.currentThread().getName()+":"+str);
		}
	};
	Thread t1=new Thread(countryPrintingRunnable);
	//t1.start();
	Thread t2=new Thread(()->{
		String countries[]= {"India","Sri Lank","German","Italy","Canada","France"};
		for(String str:countries)
		{
			System.out.println(Thread.currentThread().getName()+":"+str);
		}
	});
	t2.start();
	t2.join();
	t1.start();
	
	//t1.setPriority(Thread.MIN_PRIORITY);//-->10
	//t2.setPriority(Thread.MAX_PRIORITY);
	
	}
/*Totally we have 3 threads
 * Main threads start and doesn't mean it will finish and started next but main will start 1st
 * According to this program 
 * main thread start 
 * then t2 finish its execution
 * then t1 will finish  it
 * Since this is small code they will be no diffence when we set priority*/
}
