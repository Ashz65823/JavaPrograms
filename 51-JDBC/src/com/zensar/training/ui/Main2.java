package com.zensar.training.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main2 {

	public static void main(String[] args) {
		// Step 1:Connect to drive
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

		// step 3:select-->Statement object is created 
		Statement statement = null;
		try {
			statement = connection.createStatement();
			System.out.println("Statement creted");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		//Enter Select query the return is ResultSet
		String SQL = "select * from temployees";
		ResultSet rs = null;// to read all the data from table-->java.sql
		try {
			rs = statement.executeQuery(SQL);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			while (rs.next())// from beginning logical record move to our first record
			{
				System.out.print(rs.getInt(1) + ",");//id
				System.out.print(rs.getString(2) + ",");//name

				java.sql.Date doj = rs.getDate(3);// -->For date-- date of joing
				long ms = doj.getTime();// return long value
				java.util.Date udoj = new java.util.Date(ms);
				System.out.print(udoj + ",");

				System.out.print(rs.getString(4).charAt(0) + ",");//grade
				System.out.print(rs.getDouble(5) + ",");//salary
				System.out.print(rs.getString(6).charAt(0)+"\n");//gender
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// step 4-->Closing connection
		try {
			statement.close();
			rs.close();
			connection.close();
			System.out.println("Closing Connection");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
