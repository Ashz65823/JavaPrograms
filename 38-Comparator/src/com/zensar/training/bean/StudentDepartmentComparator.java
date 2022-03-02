package com.zensar.training.bean;

import java.util.Comparator;

public class StudentDepartmentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.department.compareTo(o2.department);
	}
	

}
