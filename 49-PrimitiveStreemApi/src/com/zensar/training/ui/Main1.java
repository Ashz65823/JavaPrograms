package com.zensar.training.ui;

import java.awt.font.NumericShaper.Range;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main1 {
	public static void main(String[] args) {

		IntStream stream=IntStream.rangeClosed(1,10);
		stream.forEach((i)->System.out.println(i));
		//int[]arr= {3,7,1,6,7,10,12,3,6};
		/*
		 *  IntStream
		 * stream=Arrays.stream(arr); stream.forEach((i)->System.out.println(i));
		 * 
		 * IntStream stream2=Arrays.stream(arr); OptionalInt optionalInt=stream2.max();
		 * if(optionalInt.isPresent()) System.out.println(optionalInt.getAsInt()); else
		 * System.out.println("Source is empty");
		 * 
		 *///OptionalInt optionalInt=stream.min();
		/*
		 * if(optionalInt.isPresent()) System.out.println(optionalInt.getAsInt()); else
		 * System.out.println("Source is empty");
		 */
		/*
		 * long cnt=stream.count(); System.out.println(cnt);
		 */
		/*
		 * OptionalDouble optionalDouble=stream.average();
		 * if(optionalDouble.isPresent())
		 * System.out.println(optionalDouble.getAsDouble()); else
		 * System.out.println("No Source");
		 */
		//stream.distinct().forEach((i)->System.out.println(i));
		//stream.filter((i)->i%2==0).forEach((i)->System.out.println(i));
		//stream.filter((i)->i%2==0).distinct().forEach((i)->System.out.println(i));
		/*
		 * int total=stream.filter((i)->i%2==0).distinct().sum();
		 * System.out.println(total);
		 */
		/*
		 * boolean res=stream.allMatch((i)->i%2!=0); System.out.println(res);
		 */
		/*
		 * boolean res=stream.anyMatch((i)->i%2!=0); System.out.println(res);
		 */
		/*
		 * boolean res=stream.noneMatch((i)->i%2!=0); System.out.println(res);
		 */
		//System.out.println(stream.reduce((i,j)->i+j));//3+7=10 now i is 10 and j is 1 it sum and go on..
		/*
		 * OptionalInt optionalInt=stream.reduce((i,j)->i+j);
		 * System.out.println(optionalInt.getAsInt());
		 */
		/*
		 * List<Integer>list=stream.boxed().collect(Collectors.toList());//collectors
		 * class provide set of function to collect System.out.println(list);
		 */
	
	}
}
