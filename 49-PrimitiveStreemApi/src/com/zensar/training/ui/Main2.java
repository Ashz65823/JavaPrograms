package com.zensar.training.ui;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class Main2 {

	public static void main(String[] args) {
		DoubleStream ds1 = DoubleStream.of(16.0, 22.0, 7.0);
		// sum min max avg count
		// print all elements and above 15
		long count = ds1.count();
		System.out.println("Count " + count);

		DoubleStream ds = DoubleStream.of(16.0, 22.0, 7.0);
		System.out.println("Sum " + ds.sum());

		DoubleStream ds2 = DoubleStream.of(16.0, 22.0, 7.0);
		OptionalDouble optionalDouble = ds2.min();
		System.out.println("Minimum " + optionalDouble.getAsDouble());

		DoubleStream ds3 = DoubleStream.of(16.0, 22.0, 7.0);
		OptionalDouble optionalDouble2 = ds3.max();
		System.out.println("Maximum " + optionalDouble2.getAsDouble());

		DoubleStream ds4 = DoubleStream.of(16.0, 22.0, 7.0);
		OptionalDouble optionalDouble3 = ds4.average();
		System.out.println("Average " + optionalDouble3.getAsDouble());

		DoubleStream ds5 = DoubleStream.of(16.0, 22.0, 7.0);
		ds5.forEach((i) -> System.out.println(i));

		DoubleStream ds6 = DoubleStream.of(16.0, 22.0, 7.0);
		ds6.filter((i) -> i >= 15).forEach((i) -> System.out.println(i));
		
		DoubleStream ds7 = DoubleStream.of();
		OptionalDouble optionalDouble4 = ds7.max();
		if(optionalDouble4.isPresent())
			System.out.println(optionalDouble4.getAsDouble());
		else
			System.out.println("Empty");
		
		
	}

}
