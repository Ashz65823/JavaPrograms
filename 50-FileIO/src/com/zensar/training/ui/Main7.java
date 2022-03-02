package com.zensar.training.ui;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.LinkedList;
import java.util.List;

import org.xml.sax.helpers.NamespaceSupport;

import com.zensar.training.bean.Customer;

public class Main7 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile accessFile=new RandomAccessFile("customers.dat", "rw");
		List<Customer> customers=new LinkedList<>();
        while(true)
        {
        	try {
				String name=accessFile.readUTF();
				double balnce=accessFile.readDouble();
	        	String city=accessFile.readUTF();
	        	Customer customer=new Customer(name, balnce, city);
	        	customers.add(customer);
	        	//System.out.println(name+", "+balnce+", "+city);
			} catch (IOException e) {
				System.out.println(e.getMessage());
				System.out.println(customers);
				return;
				//e.printStackTrace();
			}
        		       	
        }
        //accessFile.close(); 
        
	}
	

}
