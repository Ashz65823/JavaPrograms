package com.zensar.training.bean;

import java.util.Comparator;

public class Student implements Comparable<Student> {
	int rollno;
	String name;
	String department;
	int mark;
	
	public Student(int rollno, String name, String department, int mark) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.department = department;
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "\n Student [rollno=" + rollno + ", name=" + name + ", department=" + department + ", mark=" + mark + "]";
	}

	@Override
	public int compareTo(Student o) {
		if(this.rollno>o.rollno)
			return 1;
		if(this.rollno<o.rollno)
			return -1;
		return 0;
	}
	
	
	}
	

