package com.zensar.training.ui;

public class Main9 {

	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(new GoodByeTask());
		t1.setDaemon(true);//true is used to set daemon
		t1.start();
		System.out.println(t1.isDaemon());
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"..."+i);
			Thread.sleep(1000);
		}
		
	}

}
/*
 * Daemon is a service trade for other running thread
 * it has low priority
 * when other non Daemon threads die then the demon thread also will die
 * but only after all die it will die.. even if it's function is finished it will die after all are dead
 * --------------------------- 
 * */
