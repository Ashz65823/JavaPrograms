package com.zensar.training.ui;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main2 {

	public static void main(String[] args) throws IOException {
		OutputStream os;
		os=new FileOutputStream("welcome.txt");
		byte[]arr= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		os.write(arr);//exception
		os.flush();//flush data from memory to hard disk
		os.close();
		
	}

}
