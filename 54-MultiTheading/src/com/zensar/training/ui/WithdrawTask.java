package com.zensar.training.ui;

public class WithdrawTask implements Runnable{

	BankAccount account;
	
	//constructor 
	public WithdrawTask(BankAccount account) {
		super();
		this.account = account;
	}
	
	@Override
	public void run() {
		account.withdraw(25);//will be in waiting state
		
	}

	
	
}
