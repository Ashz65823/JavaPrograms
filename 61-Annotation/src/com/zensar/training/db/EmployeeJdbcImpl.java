package com.zensar.training.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.zensar.training.bean.Employee;
import com.zensar.training.bean.Gender;

public class EmployeeJdbcImpl implements EmployeeDAO {

	@Override
	public boolean addEmployee(Connection connection, Employee employee) throws Exception {// add employee deatils into
																							// db
		PreparedStatement statement = connection.prepareStatement(INSERT_QRY);// user data so prepare we are using
		statement.setString(1, employee.getName());// adding name

		LocalDate localDate = employee.getHiredDate();// adding date
		Date doj = DateConversion.convertToSQLDate(localDate);// convert to sql format(01-05-2022) to get inserted into
																// db
		statement.setDate(2, doj);

		statement.setString(3, employee.getGrade() + "");// add grade
		statement.setDouble(4, employee.getBasicSalary());// add basic salary
		statement.setString(5, employee.getGender().toString().charAt(0) + "");// adding gender

		int count = statement.executeUpdate();
		if (count > 0)
			return true;
		return false;
		// throws exception will be handle else whereException is handled at is time
	}

	@Override
	public boolean updateEmployee(Connection connection, Employee employee) throws Exception {
		PreparedStatement statement = connection.prepareStatement(UPDATE_QRY);// user data so prepare we are using
		statement.setString(1, employee.getName());// adding name

		LocalDate localDate = employee.getHiredDate();// adding date
		Date doj = DateConversion.convertToSQLDate(localDate);// convert to sql format(01-05-2022) to get inserted into
																// db
		statement.setDate(2, doj);

		statement.setString(3, employee.getGrade() + "");// add grade
		statement.setDouble(4, employee.getBasicSalary());// add basic salary
		statement.setString(5, employee.getGender().toString().charAt(0) + "");// adding gender
		statement.setInt(6, employee.getId());

		int count = statement.executeUpdate();
		if (count > 0)
			return true;
		return false;
	}

	@Override
	public boolean deleteEmployee(Connection connection, Employee employee) throws Exception {
		PreparedStatement statement = connection.prepareStatement(DELETE_QRY);// user data so prepare we are using
		statement.setInt(1, employee.getId());
		int count = statement.executeUpdate();
		if (count > 0)
			return true;
		return false;
	}

	@Override
	public Employee findEmployee(Connection connection, int empId) throws Exception {
		PreparedStatement statement = connection.prepareStatement(FIND_QRY);
		statement.setInt(1, empId);
		ResultSet rs = statement.executeQuery();
		if (rs.next()) {
			Employee employee = new Employee();
			employee.setId(rs.getInt(1));
			employee.setName(rs.getString(2));
			Date date = rs.getDate(3);
			LocalDate localDate = DateConversion.convertToLocalDate(date);
			employee.setHiredDate(localDate);
			employee.setGrade(rs.getString(4).charAt(0));
			employee.setBasicSalary(rs.getDouble(5));
			char gender = rs.getString(6).charAt(0);
			if (gender == 'M')
				employee.setGender(Gender.MALE);
			if (gender == 'F')
				employee.setGender(Gender.FEMALE);

			return employee;
		}
		return null;
	}

	@Override
	public List<Employee> findAllEmployees(Connection connection) throws Exception {
		List<Employee> empList = new ArrayList<>();
		PreparedStatement statement = connection.prepareStatement(FIND_ALL_QRY);
		ResultSet rs = statement.executeQuery();
		while (rs.next()) {
			Employee employee = new Employee();
			employee.setId(rs.getInt(1));
			employee.setName(rs.getString(2));
			Date date = rs.getDate(3);
			LocalDate localDate = DateConversion.convertToLocalDate(date);
			employee.setHiredDate(localDate);
			employee.setGrade(rs.getString(4).charAt(0));
			employee.setBasicSalary(rs.getDouble(5));
			char gender = rs.getString(6).charAt(0);
			if (gender == 'M')
				employee.setGender(Gender.MALE);
			if (gender == 'F')
				employee.setGender(Gender.FEMALE);
			empList.add(employee);
		}
		return empList;
	}

}
