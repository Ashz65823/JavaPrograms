package com.zensar.training.ui;

import java.util.Collections;
import java.util.List;

import com.zensar.training.bean.CollectionFactory;
import com.zensar.training.bean.Student;
import com.zensar.training.bean.comparator.StudentDepartmentComparator;
import com.zensar.training.bean.comparator.StudentMarkComparator;

public class Main1 {
	public static void main(String[] args) {

		List<Student>students;
		students=CollectionFactory.getStudentList();
		System.out.println(students);//sort based on sort in student comparator
		System.out.println("--------------After Sort------------");
		Collections.sort(students);
		System.out.println(students);
		
		StudentDepartmentComparator sdc=new StudentDepartmentComparator();
		Collections.sort(students, sdc);
		System.out.println("------------Based on department-------------- \n"+students);
		
		StudentMarkComparator smc=new StudentMarkComparator();
		Collections.sort(students, smc);
		System.out.println("---------------Based on Marks---------------- \n"+ students);
		
		Student s1=new Student();
		Collections.addAll(students, new Student(),new Student(),s1);
		System.out.println(students);//add 2 with  default value
		Collections.sort(students);
		System.out.println(Collections.binarySearch(students, new Student(2503)));
		
		System.out.println("Max on Roll number"+Collections.max(students));//based on roll no
		System.out.println("Max Mark"+Collections.max(students,new StudentMarkComparator()));
		
		System.out.println("Minimum by deafult of roll no"+Collections.min(students));
		System.out.println("Mininum based on marks comparator"+ Collections.min(students, new StudentMarkComparator()));
		
		Collections.rotate(students, 3);//rotate by 3 elements
		System.out.println("Rotate \n"+students);
		
		Collections.shuffle(students);
		System.out.println("Shuffle \n"+students);
		
		Collections.reverse(students);
		System.out.println("Reverse"+students);
		
	}
}
