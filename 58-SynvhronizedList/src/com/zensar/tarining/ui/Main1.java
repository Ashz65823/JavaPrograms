package com.zensar.tarining.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.zensar.tarining.bean.LengthCountingRunnble;
import com.zensar.tarining.bean.StringAdderRunnable;

public class Main1 {

	public static void main(String[] args) throws InterruptedException {
		List<String>myList=new ArrayList<>();
		myList.add("Zensar");
		myList.add("Training");
		Collection <String> synchList=Collections.synchronizedCollection(myList);
		
		List<String> synchlist=Collections.synchronizedList(myList);
		
		
		StringAdderRunnable adderRunnable=new StringAdderRunnable(synchlist);
		LengthCountingRunnble countingRunnble=new LengthCountingRunnble(synchlist);
		
		Thread t1=new Thread(adderRunnable);
		Thread t2=new Thread(countingRunnble);
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println(myList);
		System.out.println(countingRunnble.sum);

	}

}
