package com.zensar.training.bean;

import java.util.Comparator;

public class StudentMarkComaprator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.mark>o2.mark)
			return 1;
		if(o1.mark<o2.mark)
			return -1;
		return 0;
	}
	

}
