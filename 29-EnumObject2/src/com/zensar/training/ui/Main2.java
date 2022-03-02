package com.zensar.training.ui;

import com.zensar.training.bean.Scale;

public class Main2 {

	public static void main(String[] args) {

		Scale scale=Scale.FULL;
		System.out.println(scale.getQuantity());
		scale=Scale.HALF;
		System.out.println(scale.getQuantity());
		
		Scale[] arr=scale.values();
		for(Scale s:arr)
		{
			System.out.println(s);
		}
		
		

	}

}
