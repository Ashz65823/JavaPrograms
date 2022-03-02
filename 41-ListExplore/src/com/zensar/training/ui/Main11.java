package com.zensar.training.ui;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main11 {

	public static void main(String[] args) {
		Map<String, String> map1;
		map1=new HashMap<>();
		map1.put("CountryName", "India");
		String s1="Capital";
		String s2="Delhi";
		map1.put(s1, s2);
		map1.put("President", "Ramnath Govind");
		System.out.println(map1);
		map1.put("President", "Modi");//key will not get duplicated so President--Ramnath Govind will be replaced by modi 
		System.out.println(map1);
		
		System.out.println(map1.get("Capital"));
		Set<String> allkey=map1.keySet();//It will contain all the keys in the map
		for(String key:allkey)
		{
			System.out.println(key+" "+map1.get(key));//get
		}
			Collection<String> allValues=map1.values();
			System.out.println(allValues);
	}

}
