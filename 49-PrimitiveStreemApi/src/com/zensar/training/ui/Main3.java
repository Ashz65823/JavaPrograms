package com.zensar.training.ui;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import com.zensar.training.bean.CollectionFactory;
import com.zensar.training.bean.Student;
import com.zensar.training.bean.comparator.StudentMarkComparator;

public class Main3 {

	public static void main(String[] args) {
		List<Student>students=CollectionFactory.getStudentList();//collection of student
		Stream<Student> studStream=students.stream();//putting student list into stream 
		Stream<Student> studStream2=students.stream();
		Stream<Student> studStream3=students.stream();
		studStream3.sorted().filter((s)->s.getAverageMark()>80.0).forEach((s)->
		System.out.println(s.getRollNo()+"\t"+s.getName()+"\t"+s.getAverageMark()));
		/*
		 * studStream.sorted().filter((s)->s.getAverageMark()>80.0).forEach((s)->//
		 * sorting them--filtering on average marks--- iterating
		 * System.out.println(s.getRollNo()+"\t"+s.getName()+"\t"+s.getAverageMark()));/
		 * /printing roll no name and avg marks
		 */	
		DoubleStream ds=studStream2.mapToDouble((s)->s.getAverageMark());
		OptionalDouble opDouble=ds.max();
		if(opDouble.isPresent())
		{
			System.out.println(opDouble.getAsDouble());
		}
		
		/*
		 * Optional<Student> minStud=studStream.min(new StudentMarkComparator());
		 * if(minStud.isPresent()) { System.out.println(minStud.get()); } min comparator
		 */
		Stream<Student> studStream4=students.stream();
		Optional<Student>minStud=studStream4.min(new StudentMarkComparator());
		if(minStud.isPresent())
			System.out.println(minStud.get());
		//minmum
		Optional<Student> maxStud=studStream.max(new StudentMarkComparator());
		if(maxStud.isPresent())
		{
			System.out.println(maxStud.get());
		}
		//maximum comparator
		Stream<Student> studStream5=students.stream();
		Optional<Student>optionalstud=studStream5.findAny();
		if(optionalstud.isPresent())
			System.out.println(optionalstud.get());
	
		Stream<Student> studStream6=students.stream();
		boolean result=studStream6.allMatch((s)->s.getAverageMark()>80);
		System.out.println(result);
		
		Stream<Student> studStream7=students.stream();
		boolean result2=studStream7.anyMatch((s)->s.getAverageMark()>80);
		System.out.println(result2);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		Stream<Student> studStream8=students.stream();
		Optional<Student> optionals=studStream8.findAny();
		System.out.println("Find any"+optionals.get());
		
		Stream<Student> studStream9=students.stream();
		Optional<Student> op= studStream9.findFirst();
		System.out.println("Find First"+op.get());
		
		Stream<Student> studStream10=students.stream();
		List<Student> list=studStream10.filter((s)->s.getAverageMark()>70).collect(Collectors.toList());
		System.out.println(list);
	}

}
