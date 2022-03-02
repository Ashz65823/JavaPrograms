package com.zensar.training.ui;

public class BankAccount {
	private int balance;
	boolean maxReach;
	boolean minReach;

	public BankAccount(int balance) {
		super();
		this.balance = balance;
	}

	public synchronized void withdraw(int amt) {
		for (int i = 1; i <= amt; i++) {
			if (this.balance <= 5) {
				minReach = true;
				try {
					notify();
					wait();
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
			
			this.balance = this.balance - 1;// Subtract by rupeee
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			System.out.print(Thread.currentThread().getName() + " : ");
			System.out.println(" Amount Withdrawn " + i + " Balance =" + this.balance);
		}notify();
		System.out.println("\t\t\t Final amount after all the transaction: "+this.balance);
	}

	public synchronized void deposit(int amt) {// if synchronized was not given then they will be conflict in output
		for (int i = 1; i <= amt; i++) {
			if (this.balance >= 25) {
				maxReach = true;// signal to jvm
				try {
					notify();
					wait();
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
			
			this.balance = this.balance + 1;// add by rupeee
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			System.out.print(Thread.currentThread().getName() + " : ");
			System.out.println(" Amount Deposited " + i + " Balance =" + this.balance);
		}
		notify();
		
	}
}
