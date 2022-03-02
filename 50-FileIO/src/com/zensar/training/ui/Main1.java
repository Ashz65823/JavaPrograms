package com.zensar.training.ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main1 {
	public static void main(String[] args) throws IOException {
		InputStream is;//stream object is created
		is=new FileInputStream("intro.txt");//specify the location for stream where to read-->Throws exception
		while(true) {
		int i=is.read();
		if(i==-1) 
			break;
		char ch=(char)i;//throws exception-->reading ASCII value and converting to character
		System.out.print(ch);
		}
		
		is.close();

	}
}
