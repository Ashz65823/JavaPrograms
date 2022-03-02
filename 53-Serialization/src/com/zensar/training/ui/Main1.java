package com.zensar.training.ui;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import com.zensar.training.bean.Circle;

public class Main1 {
	public static void main(String[] args) throws IOException {
		Circle circle=new Circle(10);//Transition object
		OutputStream os=new FileOutputStream("circle.dat");
		ObjectOutputStream oos;
		oos=new ObjectOutputStream(os);//stream object is created
		
		oos.writeObject(circle);//storing the strem
		oos.flush();
		os.flush();
		oos.close();
		os.close();
	}
}
/*Trying to store data in outputsteam
 *
 * */
 