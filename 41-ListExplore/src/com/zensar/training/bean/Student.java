package com.zensar.training.bean;

import java.util.Comparator;
import java.util.Objects;

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

	public Student(int rollno) {
		super();
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "\n Student [rollno=" + rollno + ", name=" + name + ", department=" + department + ", mark=" + mark + "]";
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(rollno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		return rollno == other.rollno;
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
	

