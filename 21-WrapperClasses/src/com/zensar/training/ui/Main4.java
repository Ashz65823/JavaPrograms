package com.zensar.training.ui;

public class Main4 {

	public static void main(String[] args) {
		double d=800.00;
		//Double obj=new Double(d);-->value her acnnot be cahne
		//this can be done even like this
		Double obj=d;
		Double d1=obj;//this is auto boxing
		double d2=obj.doubleValue();
		double obj2=d2;//auto unboxing
		obj2++;//autoboxing without trying to store them in same class obj
		System.out.println(obj2);
		
		//------------------------------------
		/*
		 * double f=obj1.doubleValue();-->boxing
		 * f++;
		 * Double temp=new Double(f)
		 * obj1=temp
		 * obj++
		 * */
		/////////////////////
		double k=10+obj2;
		System.out.println(obj2);
	}

}
