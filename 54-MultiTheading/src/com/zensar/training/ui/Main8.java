package com.zensar.training.ui;

public class Main8 {

	public static void main(String[] args) {

		BankAccount account=new BankAccount(6);
		DepositTask dTask=new DepositTask(account);
		WithdrawTask wTask=new WithdrawTask(account);
		
		Thread t1=new Thread(dTask,"DT ");
		Thread t2=new Thread(wTask,"WT ");
		
		t1.start();
		t2.start();
		
		/*when the object is made synchronized then when t1.start is called it will execute
		 * as long as the task t1 is completed  only after deposit task withdraw task will be start its execution
		 * before this main thread is started then t1 starts and end after t1, T2 starts and end finally main end
		 * if any one of this is not synchronized then the object give access to the non-synchronized method 
		 * minReach and MaxReach is used to give a signal to jvm that the class have reached it max and min it will stop there 
		 * to make a notification for wait to start will give notification to start the thread when it get the notification
		 * if the notification is not given then the thread will not execute it will say in wait
		 *    */
	}

}
