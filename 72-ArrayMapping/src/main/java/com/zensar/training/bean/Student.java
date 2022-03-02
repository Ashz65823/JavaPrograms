package com.zensar.training.bean;

import java.util.Arrays;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Students50")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int rollNo;
	
	@Column(name="S_Name")
	String name;
	
	@ElementCollection//specifying collection
	@OrderColumn(name="idx")//-->index stored in db of the object
	@CollectionTable(name="students50_marks50")//--telling table name for collection to store
	double[] marks=new double[3];
	
	@Transient//->is used to tell the db not to include this column.. if we want this column the specify @column we have to specify the name of column  
	int index;//index is a keyword in db 
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double[] getMarks() {
		return marks;
	}
	public void setMarks(double[] marks) {
		this.marks = marks;
	}
	
	public void setMark(int position, double mark){
		marks[position]=mark;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks="
				+ Arrays.toString(marks)+"]";
	}
	
	

}
