package com.zensar.training.ui;

import java.util.LinkedList;
import java.util.List;

import com.zensar.training.bean.Square;
import com.zensar.training.bean.Student;

public class Main7 {

	public static void main(String[] args) {
		Student student1=new Student(11, "Aishu", "MCA",95);
		Student student2=new Student(1, "Mary", "BCA", 55);
		Student student3=new Student(2, "Bhavya", "BE",53);
		Student student4=new Student(15, "Uday", "BBA", 75);
		List<Student> stList=new LinkedList<>();
		stList.add(student1);
		stList.add(student2);
		stList.add(student3);
		stList.add(student4);
		System.out.println(stList);
		System.out.println(stList.get(1));
		System.out.println(stList.get(stList.size()-1));
		stList.add(new Student(16, "Ram", "Printing", 80));
		stList.add(3,new Student(19, "Praveen", "Mec", 99));
		System.out.println(stList);
		stList.set(4, new Student(10, "Anandan", "Electronic", 75));
		System.out.println(stList);
		System.out.println(stList.indexOf(new Student(1)));//hash code and equal are of roll no type
		System.out.println(stList.indexOf(new Student(18)));
		System.out.println("contains "+stList.contains(new Student(15, "Uday", "BBA", 75)));
		Student temp=new Student(16);
		System.out.println("temp ="+stList.contains(temp));//returns true becoz conatins work on equals method wch check only roll no
		Student temp2=new Student(19, "uday", "Bcom", 45);
		System.out.println("Temp2="+stList.contains(temp2));//returns true since 19 roll no is present it doesn't look for other data
		for(Student student:stList)
		{
			System.out.println("student "+ student);
		}

	}

}
/*
 * Contains and index of works on equals methos*/
