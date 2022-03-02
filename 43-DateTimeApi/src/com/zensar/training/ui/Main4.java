package com.zensar.training.ui;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;

public class Main4 {

	public static void main(String[] args) {
		LocalTime locTime=LocalTime.now();
		System.out.println(locTime);//instance of current time
		System.out.println("Hour "+locTime.getHour());
		System.out.println("Minute "+locTime.getMinute());
		System.out.println("Second "+locTime.getSecond());
		
		LocalTime lunchTime=locTime.plusMinutes(45);
		System.out.println("Lunch break"+lunchTime);
		
		LocalTime resumTime=lunchTime.minus(60,ChronoUnit.MINUTES);
		System.out.println("Minute "+resumTime);
		LocalTime resumTime2=lunchTime.minus(1,ChronoUnit.HOURS);
		System.out.println("Hour "+resumTime2);
		
		String str=resumTime.format(DateTimeFormatter.ofPattern("hh:mm:ss"));
		System.out.println(str);
	
	}

}
