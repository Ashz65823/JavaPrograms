package com.zensar.tarining.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		List<String>names=new ArrayList<>();
		names.add("John");
		names.add("jack");
		names.add("Ashwini");
		names.add("Savi");
		Iterator<String> it=names.iterator();//fail fast iterator
		while(it.hasNext())
		{
			//String str=(it.next());
			/*
			 * if(str.length()==4) it.remove();
			 */
			//names.add("Jackson");//exception java.util.ConcurrentModificationException
			names.set(1, "Giri");
			System.out.println(it.next());
		}
		

	}

}
/*
 * Concurrent hash map is fail safe version of hash map
 * Like array list hash map is file fast iterator
 * concurrent hah map is fail safe iterator*/
