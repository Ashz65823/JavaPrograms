package com.zensar.training.ui;

import com.zensar.training.bean.Gender;

public class Main1 {

	public static void main(String[] args) {
		
		Gender gender=Gender.FEMALE;//Restrict class to have object of only 2
		//gender=Gender.MALE;
		
		System.out.println(gender.getAvgHeight());
		System.out.println(gender.getAvgWeight());

	}

}
