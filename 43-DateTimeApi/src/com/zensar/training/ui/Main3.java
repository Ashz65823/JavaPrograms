package com.zensar.training.ui;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Main3 {

	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		System.out.println(today);
		
		LocalDate tomorrow=LocalDate.of(2022,2,1 );
		System.out.println(tomorrow);
		
		String str="2022-06-25";
		LocalDate other=LocalDate.parse(str);
		System.out.println(other);
		
		String str1="15-08-2022";
		LocalDate independentday=LocalDate.parse(str1, DateTimeFormatter.ofPattern("dd-MM-yyyy"));//formating to our type
		System.out.println(independentday);
		
		LocalDate localDate=independentday.plusDays(10);
		System.out.println(localDate);
		
		LocalDate localDate2=independentday.minusDays(5);
		System.out.println(localDate2);
		
		System.out.println(independentday.isLeapYear());
		
		System.out.println(localDate2.isAfter(localDate));
		System.out.println(localDate.isAfter(localDate2));
		System.out.println(localDate2.isBefore(localDate));
		System.out.println(localDate.isEqual(localDate2));
		//instance reprensting 1st days of month
		
		LocalDateTime firstday=today.atStartOfDay();//day stated date
		System.out.println(firstday);
		
		LocalDate localDate3=today.with(TemporalAdjusters.firstDayOfMonth());//get 1st day of month
		System.out.println(localDate3);
		
		LocalDate localDate4=LocalDate.of(1998,2,15);
		LocalDate localDate5=localDate4.with(TemporalAdjusters.firstDayOfYear());
		System.out.println(localDate5);
		
	}

}
