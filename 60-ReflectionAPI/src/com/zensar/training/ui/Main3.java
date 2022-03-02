package com.zensar.training.ui;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.zensar.training.bean.Circle;

public class Main3 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class myClass=Circle.class;//refrence is created-->Refere to structer of circle-->this is to load the Structute
		Object obj=myClass.newInstance();//obj point to circle-->object reference
		
		Method method=myClass.getMethod("setRadius",int.class);//getting refrence-->name of method and datatype it takes-->created a object for loaded circle
		method.invoke(obj, 10);//invole set radius method
		Method method2=myClass.getMethod("computeArea");
		System.out.println(method2.invoke(obj));
				
		
		

	}

}
