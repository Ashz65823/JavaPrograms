package com.zensar.training.ui;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.DefaultEditorKit.CutAction;

import com.zensar.training.bean.Customer;
import com.zensar.training.bean.CustomerBalanceComparator;
import com.zensar.training.bean.CustomerIdComparator;

public class Main9 {

	public static void main(String[] args) {
	CustomerBalanceComparator baComparator=new CustomerBalanceComparator();
	CustomerIdComparator iComparator=new CustomerIdComparator();
	//Set<Customer> customers=new TreeSet<>(baComparator);//compare based on balance
	Set<Customer> customers=new TreeSet<>(iComparator);
	Customer customer1=new Customer(101, "Ash", 1001.0);
	Customer customer2=new Customer(100, "Jan", 2091.10);
	Customer customer3=new Customer(103, "Aishu", 7890.90);
	Customer customer4=new Customer(14, "Mary", 5679.70);
	Customer customer5=new Customer();
	customer5.setId(104);//trying to add 104 which is already exit
	
	System.out.println(customers.add(customer1));
	System.out.println(customers.add(customer2));
	System.out.println(customers.add(customer3));
	System.out.println(customers.add(customer4));
	//System.out.println(customers.add(customer5));//duplicate value will not be added
	System.out.println(customers);
	
	
	
	}

}
