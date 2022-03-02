package com.zensar.training.ui;

public class DepositTask implements Runnable {

	BankAccount account;
	@Override
	public void run() {
		account.deposit(30);
		
	}
	//constructor 
	public DepositTask(BankAccount account)
	{
		super();
		this.account=account;
	}
}
