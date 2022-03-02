package com.zensar.training.ui;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import com.zensar.training.bean.CollectionFactory;
import com.zensar.training.bean.Student;

public class Main7 {

	public static void main(String[] args) throws IOException {
		List<Student> students=CollectionFactory.getStudentList();
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("student.dat"));
		oos.writeObject(students);
		oos.flush();
		oos.close();

	}

}
