package com.zensar.training.bean;

public class Customer implements Comparable<Customer>{
	int id;
	String name;
	double balance;
	public Customer(int id, String name, double balance) throws Exception {
		super();
		this.id = id;
		this.name = name;
		this.setBalance(balance);
	}
	@Override
	public int compareTo(Customer o) {
		int res=this.name.compareTo(o.name);
		return res;
	}
	@Override
	public String toString() {
		return "\n Customer [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) throws Exception {
		if(balance<0)
		{
			Exception e=new Exception("Invalid Balance");
			throw e;
			/*try{throw e;
			}catch (Exception ee) {
				System.out.println(ee.getMessage());
			}
			}*/
		}
		this.balance = balance;
	}
	
}
/*
 * Customer hav 3 values id name and balance
 * the Customer method is to sort
 * */
