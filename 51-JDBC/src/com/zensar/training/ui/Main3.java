package com.zensar.training.ui;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
		} catch (ClassNotFoundException e) {
			System.out.println("Drive connection issue");
			e.printStackTrace();
		}

		// Step 2 connection interface---> to database
		Connection connection = null;
		String url = "jdbc:mysql://localhost:3306/TrainingDB";
		String username = "root";
		String password = "root";
		try {
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Connected");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		String name;
		LocalDate doj;
		char grade;
		double basic;
		char gender;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Name");
		name = scanner.next();
		
		System.out.println("Enter Date of Joining(dd-MMM-yyyy)eg(01-Jan-2022)");
		String temp = scanner.next();
		doj = LocalDate.parse(temp, DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
		
		System.out.println("Enter Grade");
		grade = scanner.next().charAt(0);
		
		System.out.println("Enter Basic Salary");
		basic = scanner.nextDouble();
		
		System.out.println("Enter Gender M-Male and F-Female");
		gender = scanner.next().charAt(0);
		
		String SQL = "insert into TEMPLOYEES(name,doj,grade,basic_salary,gender)values(?,?,?,?,?)";
		PreparedStatement statement=null;
		
		try {
			statement=connection.prepareStatement(SQL);//prepare a statement for given query
			System.out.println("Statement created");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			statement.setString(1, name);
			Date date=Date.valueOf(doj);//Date of sql 
			statement.setDate(2,date);
			statement.setString(3, grade+"");
			statement.setDouble(4, basic);
			statement.setString(5, gender+"");
			
			int count=statement.executeUpdate();//check update of how many rows affected 
			System.out.println(count);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
}
