package com.zensar.training.ui;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Main4 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile accessFile=new RandomAccessFile("marks.dat", "rw");//any extension can be given  like .dat or .txt
		int[]arr= {80,90,100};
		accessFile.writeInt(arr[0]);//write is of int type
		accessFile.writeInt(arr[1]);
		accessFile.writeInt(arr[2]);
		
		accessFile.close();

	}

}
