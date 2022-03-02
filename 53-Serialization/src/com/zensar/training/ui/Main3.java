package com.zensar.training.ui;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.time.LocalDate;

import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Gender;

public class Main3 {

	public static void main(String[] args) throws IOException {
		Employee employee=new Employee(901, "Ashwini", 'B', LocalDate.now(), 19000.60, Gender.FEMALE);//creating object 
		OutputStream os=new FileOutputStream("employee.dat");//Output stream file to store data is created
		ObjectOutputStream oos= new ObjectOutputStream(os);//Streaming data from object is send to file output steam
		oos.writeObject(employee);//Storing the data into file write will write a stream of data into a file
		oos.flush();
		os.flush();
		os.close();
		oos.close();

	}

}
