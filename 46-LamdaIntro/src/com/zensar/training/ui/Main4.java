package com.zensar.training.ui;

import com.zensar.training.bean.Exectable;

public class Main4 {

	public static void main(String[] args) {
		Exectable<String> exectable;
		exectable=(String s)->{//String is not mandatory
			System.out.println(s.toUpperCase());
		};
		exectable.execute("zensar");
		
		Exectable<Integer> exectable1 =(i)->{
			System.out.println(i.doubleValue());
		};
		exectable1.execute(234);
	}

}
