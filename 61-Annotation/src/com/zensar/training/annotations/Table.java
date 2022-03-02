package com.zensar.training.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)//can go to run time 
public @interface Table {

	String tableName();
	String dbName();
}

