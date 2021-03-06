package com.zensar.training.db;

import java.sql.Date;
import java.time.LocalDate;

import com.zensar.training.annotations.Converter;

@Converter
public class DateConversion {
	public static Date convertToSQLDate(LocalDate localDate){
		Date date=Date.valueOf(localDate);
		return date;
	}//cover localdate to sqldate
	
	public static LocalDate convertToLocalDate(Date date) {
		LocalDate localDate=date.toLocalDate();
		return localDate;
	}//conver sqldate to localdate
}
