package com.zensar.training.ui;

import java.lang.reflect.Array;
import java.util.Arrays;

import com.zensar.training.bean.Student;
import com.zensar.training.bean.StudentDepartmentComparator;
import com.zensar.training.bean.StudentMarkComaprator;
import com.zensar.training.bean.StudentNameComparator;
import com.zensar.training.bean.StudentRollNoCamparator;

public class Main2 {

	public static void main(String[] args) {
		Student student1=new Student(11, "Aishu", "MCA",95);
		Student student2=new Student(1, "Mary", "BCA", 55);
		Student student3=new Student(2, "Bhavya", "BE",53);
		Student student4=new Student(15, "Uday", "BBA", 75);
		
		Student[] students= {student1,student2,student3,student4};
		System.out.println(Arrays.toString(students));
		Arrays.sort(students);
		System.out.println("----------------------Before Sort---------------------------------");
		System.out.println(Arrays.toString(students));
		
		StudentRollNoCamparator studentRollNoCamparator=new StudentRollNoCamparator();
		StudentNameComparator studentNameComparator=new StudentNameComparator();
		StudentDepartmentComparator studentDepartmentComparator=new StudentDepartmentComparator();
		StudentMarkComaprator studentMarkComaprator=new StudentMarkComaprator();
		
		System.out.println("----------------------After Sort--------------------------------");
		System.out.println("-------------------------------Name Sort------------------------------------------");
		Arrays.sort(students,studentNameComparator);
		System.out.println(Arrays.toString(students));
		System.out.println("-------------------------------Department Sort------------------------------------------");
		Arrays.sort(students,studentDepartmentComparator);
		System.out.println(Arrays.toString(students));
		System.out.println("-------------------------------Roll no Sort------------------------------------------");
		Arrays.sort(students,studentRollNoCamparator);
		System.out.println(Arrays.toString(students));
		System.out.println("-------------------------------Marks Sort------------------------------------------");
		Arrays.sort(students,studentMarkComaprator);
		System.out.println(Arrays.toString(students));
		/*equal and hash code is on roll no*/
		
		
		

	}

}
