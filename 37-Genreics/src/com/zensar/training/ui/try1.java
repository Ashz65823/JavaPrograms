package com.zensar.training.ui;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class try1 {
	static void printList(List<? extends Number> list){
		 System.out.println(list);
		}
	public static void main(String[] args) {
		List<Object> objectList=new LinkedList<>();
		//printList(objectList);
		List<Double> doubleList=new ArrayList<>();
		printList(doubleList);
		List<Integer> intList=new ArrayList<>();
		printList(intList);
		List<String> stringList=new LinkedList<>();
		//printList(stringList);
	}

}
