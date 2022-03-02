package com.zensar.training.ui;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.zensar.training.bean.CollectionFactory;
import com.zensar.training.bean.Customer;

public class Main3 {

	public static void main(String[] args) {
		List<Customer> cList = CollectionFactory.getCustomerList();
		Map<Boolean, List<Customer>> custPrice;
		custPrice = cList.stream().collect(Collectors.partitioningBy(p -> p.getBalanceAmount() > 2000));
		System.out.println(custPrice);

	}

}
