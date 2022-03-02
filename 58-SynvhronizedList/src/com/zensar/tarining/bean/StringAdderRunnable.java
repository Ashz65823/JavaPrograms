package com.zensar.tarining.bean;

import java.util.ArrayList;
import java.util.List;

public class StringAdderRunnable implements Runnable {

	List<String> list=new ArrayList<>();

	
	public StringAdderRunnable(List<String> list) {
		super();
		this.list = list;
	}
	
	@Override
	public void run() {
		synchronized (list) {
			list.add("Bangalore");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			list.add("Delhi");
		}
		
		
	}

	
	
}
