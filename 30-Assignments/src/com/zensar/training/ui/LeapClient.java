package com.zensar.training.ui;

import com.zensar.training.bean.LeapYear;

public class LeapClient {

	public static void main(String[] args) {
		LeapYear leap=new LeapYear();
		leap.setYear(2012);
		System.out.println(leap.isLeapYear());

	}

}
