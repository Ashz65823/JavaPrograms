package com.zensar.training.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main1 {

	public static void main(String[] args) {
		
		//Step 1:Connect to drive
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
		} catch (ClassNotFoundException e) {
			System.out.println("Drive connection issue");
			e.printStackTrace();
		} 
		
		//Step 2 connection interface---> to database
		Connection connection=null;
		String url="jdbc:mysql://localhost:3306/TrainingDB";
		String username="root";
		String password="root";
		try {
			connection=DriverManager.getConnection(url, username, password);
			System.out.println("Connected");
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		//step 3 (insertion, update delete into table)
		//String SQL="insert into TEMPLOYEES(name,doj,grade,basic_salary,gender)values('Jeya','2021-08-15','A',12000.00,'F')";-->Inserted record
		//String SQL="update TEMPLOYEES set basic_salary=50000.00 where id=2";//-->updating record
		String SQL="delete from temployees where id=2";//deleting record
		Statement statement=null;//java.sql
		try {
			statement=connection.createStatement();
			System.out.println("Statement created");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		int count;
		try {
			count = statement.executeUpdate(SQL);
			System.out.println(count);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//step 4(Close connection)
		try {
			statement.close();
			connection.close();
			System.out.println("Connection close");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
