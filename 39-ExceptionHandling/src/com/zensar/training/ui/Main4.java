package com.zensar.training.ui;

import com.zensar.training.bean.Customer;

public class Main4 {

	public static void main(String[] args) {
		Customer customer = null;
		try {
			customer = new Customer(101, "John", -101);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 * try { customer.setBalance(1000);//this throw an exception and throw an error
		 * either use try catch or throws exception } catch (Exception e) {
		 * System.out.println(e.getMessage()); }
		 */
		/*
		 * try { customer.setBalance(-1000.00);//take double as parameter }catch
		 * (RuntimeException e) { System.out.println(e.getMessage()); }
		 */
		System.out.println(customer);
	}

}
