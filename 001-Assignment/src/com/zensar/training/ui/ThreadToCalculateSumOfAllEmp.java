package com.zensar.training.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ThreadToCalculateSumOfAllEmp implements Runnable {

	@Override
	public void run() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//System.out.println("Driver loaded");
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
			//System.out.println("Connected");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Statement statement = null;
		try {
			statement = connection.createStatement();
			//System.out.println("Statement creted");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		//Enter Select query the return is ResultSet
		String SQL = "select sum(basic_Salary) from temployees;";
		ResultSet rs = null;// to read all the data from table-->java.sql
		try {
			rs = statement.executeQuery(SQL);
			//System.out.println(SQL);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			while (rs.next())// from beginning logical record move to our first record
			{
					System.out.println(Thread.currentThread().getName()+""+rs.getDouble(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		//step 4(Close connection)
				try {
					statement.close();
					connection.close();
					//System.out.println("Connection close");
				} catch (SQLException e) {
					e.printStackTrace();
				}
		
	}
	

}
