package com.zensar.training.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.SOURCE)//-->Avaiable only in source code not in other file
@Target(ElementType.METHOD)
public @interface Calculation {
	String description();
}
