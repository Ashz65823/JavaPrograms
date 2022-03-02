package com.zensar.training.ui;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ThreadToCount implements Runnable
{
	@Override
	public void run() {
		RandomAccessFile accessFile = null;
		try {
			accessFile=new RandomAccessFile("intro.txt", "r");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		int count=0;
		while(true) {
			String str = null;
			try {
				str = accessFile.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//read one line 
			if(str==null)
				break;
			count++;
			}
			System.out.println(Thread.currentThread().getName()+" "+count);
			//accessFile.close();		
	}
	
}
