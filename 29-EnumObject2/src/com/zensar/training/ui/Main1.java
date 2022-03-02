package com.zensar.training.ui;

import com.zensar.training.bean.Gender;

public class Main1 {
	public static void main(String[] args) {
		
		Gender gender=Gender.FEMALE;
		Gender gender2=Gender.MALE;
		
		System.out.println(gender.getAvgHeight());
		System.out.println(gender.getAvgWeight());
		
		Gender[]arr=gender.values();//values will have all the value of enum stored
		for(Gender i:arr)
		{
			System.out.println(i);
		}
		
	}

}
