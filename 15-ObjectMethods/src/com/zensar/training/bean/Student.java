package com.zensar.training.bean;

import java.util.Objects;

public class Student {
	public String name;
	public int mark;
	public char grade;
	
	@Override//-->if we don't over ride we get class name with hash code
	public String toString() {
		return "Student [name=" + this.name + ", mark=" + this.mark + ", grade=" + this.grade + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(grade, mark);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		return grade == other.grade && mark == other.mark && Objects.equals(name, other.name);
	}
	
	public void finalize()
	{
		System.out.println("Object deleted");
	}
	
	
	/*
	 * public int hashCode() { int result =name.length()*20; return result; }
	 * 
	 * public boolean equals(Object obj) { Student temp=(Student)obj;//-->trying to
	 * downcast if(this.name.equals(temp.name)) return true; return false;
	 * 
	 * }
	 */
	

}
