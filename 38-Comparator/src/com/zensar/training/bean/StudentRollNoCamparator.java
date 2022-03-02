package com.zensar.training.bean;

import java.util.Comparator;

public class StudentRollNoCamparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
			if(o1.rollno<o2.rollno)
				return -1;
			if(o1.rollno>o2.rollno)
				return 1;
		return 0;
	}

	

}
