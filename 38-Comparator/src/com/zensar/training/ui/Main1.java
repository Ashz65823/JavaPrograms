package com.zensar.training.ui;

import java.util.Arrays;

import com.zensar.training.bean.CustomeNameComparator;
import com.zensar.training.bean.Customer;
import com.zensar.training.bean.CustomerBalanceComparator;
import com.zensar.training.bean.CustomerIdComparator;

public class Main1 {

	public static void main(String[] args) {
		Customer customer1=new Customer(101,"John",2000);
		Customer customer2=new Customer(21,"Ash",2100);
		Customer customer3=new Customer(901,"Savi",1500);
		Customer customer4=new Customer(91,"Aishu",1300);
		
		Customer[] customers= {customer1,customer2,customer3,customer4};
		System.out.println(Arrays.toString(customers));
		Arrays.sort(customers);
		System.out.println("------------------Before-----------------");
		System.out.println(Arrays.toString(customers));//sort on name
		
		CustomerIdComparator comparator1=new CustomerIdComparator();
		CustomerBalanceComparator comparator2=new CustomerBalanceComparator();
		CustomeNameComparator comparator3=new CustomeNameComparator();
		System.out.println("-----------------------ID -----------------------------");
		Arrays.sort(customers,comparator1);
		System.out.println(Arrays.toString(customers));
		System.out.println("-----------------------Balance -----------------------------");
		Arrays.sort(customers,comparator2);
		System.out.println(Arrays.toString(customers));
		System.out.println("-----------------------Name -----------------------------");
		Arrays.sort(customers,comparator3);
		System.out.println(Arrays.toString(customers));
		
		
	}
}
