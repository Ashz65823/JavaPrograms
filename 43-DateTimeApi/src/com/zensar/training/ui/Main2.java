package com.zensar.training.ui;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Main2 {
public static void main(String[] args) {
	Calendar calendar=Calendar.getInstance();
	System.out.println(calendar);
	System.out.println(calendar.getTime());
	calendar.add(calendar.HOUR, 12);//add on current time
	System.out.println("After adding :"+calendar.getTime());
	calendar.add(calendar.MINUTE, 40);//add on previsionly displayed time
	System.out.println(calendar.getTime());
	Date date =calendar.getTime();
	SimpleDateFormat sdf=new SimpleDateFormat("dd MMM yyyy",Locale.ITALIAN);
	String str=sdf.format(date);
	System.out.println(str);
}
}
