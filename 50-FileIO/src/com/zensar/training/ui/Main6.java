package com.zensar.training.ui;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;

import com.zensar.training.bean.CollectionFactory;
import com.zensar.training.bean.Customer;

public class Main6 {

	public static void main(String[] args) throws IOException {
		List<Customer> customers=CollectionFactory.getCustomerList();
		RandomAccessFile accessFile=new RandomAccessFile("customers.dat", "rw");
		for(Customer customer:customers)
		{
			accessFile.writeUTF(customer.getName());//universal text format--> 8 bit
			accessFile.writeDouble(customer.getBalanceAmount());
			accessFile.writeUTF(customer.getCity());
		}
		accessFile.close();
	}

}
/*Some junk data is saved for double
 * main 8-->employee data into employee.dat file
 * main 9--> read all the employee data */
