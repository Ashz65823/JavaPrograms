package com.zensar.training.ui;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main1 {

	public static void main(String[] args) {
		Date today=new Date();//store object with today date
		System.out.println(today);
		
		Date otherdate=new Date(2017, 11, 14);
		System.out.println(otherdate);
		
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd MMM yyyy",Locale.GERMAN);
		String str=sdf.format(today);
		System.out.println(str);

	}
	/*MMM--Jan
	 *MM--12 */

}
