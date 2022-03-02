package com.zensar.training.bean;

public class Customer implements Comparable<Customer>{
	int id;
	String name;
	double balance;
	@Override
	public int compareTo(Customer o) {
		/*
		 * if(this.balance<o.balance) return -1; if(this.balance>o.balance) return 1;
		 * return 0;
		 */
		int res=this.name.compareTo(o.name);
		return res;
	}
	public Customer(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "\n Customer [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
}
/*
 * Customer hav 3 values id name and balance
 * the Customer method is to sort
 * */
