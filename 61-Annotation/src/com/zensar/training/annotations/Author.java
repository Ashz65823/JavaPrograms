package com.zensar.training.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)//go onto .class file
@Target(ElementType.TYPE)//if i try give after class name it will return error
public @interface Author {
	String name() default "Ashwini";//mandatory element
}
