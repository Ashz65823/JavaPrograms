package com.zensar.training.ui;

import com.zensar.training.bean.IdGenetator;

public class Main1 {
public static void main(String[] args) {
	
	IdGenetator g1=IdGenetator.getInstance();
	System.out.println(g1.getNextId());
	System.out.println(g1.getNextId());
	System.out.println(g1.getNextId());
	System.out.println(g1.getNextId());
	
	IdGenetator g2=IdGenetator.getInstance();//-->starts with 0;
	System.out.println(g2.getNextId());
	System.out.println(g2.getNextId());
	System.out.println(g2.getNextId());
	System.out.println(g2.getNextId());
	System.out.println(g2.getNextId());
	
	IdGenetator g3=IdGenetator.getInstance();
	System.out.println(g3.getNextId());
	System.out.println(g3.getNextId());
	System.out.println(g3.getNextId());
}
}
