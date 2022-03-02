package com.zensar.training.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.zensar.training.bean.Customer;

public class Main12 {

	public static void main(String[] args) {
		Double obj1=new Double(99.0);//max
		Double obj2=new Double(40.0);//min
		Double obj3=new Double(68.71);//avg
		
		Map<String, Double> result=new HashMap<>();
		result.put("Max", obj1);
		result.put("Min", obj2);
		result.put("Avg", obj3);
		System.out.println(result);//random output
		
		Set<String> allKey=result.keySet();
		for(String key:allKey)
		{
			System.out.println(key+"="+result.get(key));
		}
		Customer customer1=new Customer(101, "Ash", 1001.0);
		Customer customer2=new Customer(100, "Jan", 2091.10);
		Customer customer3=new Customer(103, "Aishu",7890.90);
		Customer customer4=new Customer(14, "Mary", 5679.70);
		Customer customer5=new Customer(18, "Julli", 9890.90);
		Customer customer6=new Customer(15, "Ruthu", 7679.70);
		List<Customer> bangalore=new ArrayList<>();
		bangalore.add(customer1);
		bangalore.add(customer2);
		List<Customer> mumbai=new ArrayList<>();
		mumbai.add(customer3);
		mumbai.add(customer4);
		mumbai.add(customer5);
		mumbai.add(customer6);
		Map<String, List<Customer>> cityMap=new TreeMap<>();//key is string and value is list of customer
		cityMap.put("Bangalore", bangalore);
		cityMap.put("Mumbai", mumbai);
		System.out.println(cityMap);
		//print banglore customer
		Set<String> keys=(Set<String>) cityMap.keySet();
		System.out.println("---------------Bangalore---------");
		int count=0;
		double sum=0.0;
		for(String key:keys)
		{
			if(key.matches("Bangalore"))
			{
				System.out.println(cityMap.get(key));
			}
			if(key.equalsIgnoreCase("mumbai"))
			{
				List<Customer> listMum=cityMap.get(key);
				System.out.println(listMum.size());
			}
		}
		System.out.println(count);
		//how many mumbai customer
		
		//total of balance for mumbai customer
		
		
	}

}
