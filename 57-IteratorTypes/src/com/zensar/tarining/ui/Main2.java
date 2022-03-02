package com.zensar.tarining.ui;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main2 {

	public static void main(String[] args) {
		List<String>names=new CopyOnWriteArrayList<>();
		names.add("John");
		names.add("jack");
		names.add("Ashwini");
		names.add("Savi");
		Iterator<String>it=names.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			names.add("Aishu");//this was not added on to list but not added 
		}
	}

}
