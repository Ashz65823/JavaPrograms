package com.zensar.training.ui;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.zensar.training.bean.CollectionFactory;
import com.zensar.training.bean.Customer;

public class Main2 {

	public static void main(String[] args) {
		List<Customer> cList = CollectionFactory.getCustomerList();
		Map<String, List<Customer>> custMap;
		custMap = cList.stream().collect(Collectors.groupingBy(Customer::getCity));
		System.out.println("Customer City Group \n" + custMap);

	}

}
