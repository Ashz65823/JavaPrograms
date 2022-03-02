package com.zensar.training.ui;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Gender;

public class Main9 {
	public static void main(String[] args) throws FileNotFoundException {
		RandomAccessFile accessFile=new RandomAccessFile("employee.dat", "rw");
		List<Employee> employees=new LinkedList<>();
		while(true)
		{
			try {
				int id=accessFile.readInt();
				String name=accessFile.readUTF();
				char grade=accessFile.readChar();
				String doj=accessFile.readUTF();
				LocalDate date=LocalDate.parse(doj,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
				//LocalDate date=LocalDate.parse(doj);
				double basic=accessFile.readDouble();
				String gender=accessFile.readUTF();
				//Gender gender2=Gender.valueOf(gender.toString());
				
				  Gender empgender; 
				  if(gender.equals("MALE")) 
					  empgender=Gender.MALE;
				  else
					  empgender=Gender.FEMALE;
				 
				Employee employee=new Employee(id, name, grade, date, basic, empgender);//should be in constructor format
				employees.add(employee);
				
			} catch (Exception e) {
				//System.out.println(e.getMessage());
				System.out.println(employees);
				return;
			}
		}
	}

}
