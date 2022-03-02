package com.zensar.training.ui;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

import com.zensar.training.bean.Employee;

public class Main4 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Employee employee=null;
		InputStream is=new FileInputStream("employee.dat");//Targeting the file to read 
		ObjectInputStream ois=new ObjectInputStream(is);//reading from targeted file to object stream
		employee=(Employee)ois.readObject();//reading object and down casting object type to employee type to store in employee object
		System.out.println(employee);//displaying object
		ois.close();
		is.close();
	}

}
