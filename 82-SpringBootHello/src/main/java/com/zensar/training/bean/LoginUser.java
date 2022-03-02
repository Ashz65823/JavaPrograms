package com.zensar.training.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LoginUser10")//table name
public class LoginUser {

	@Id//this is the main property tht make the class as entity
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String password;
	String emailId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "LoginUser [id=" + id + ", name=" + name + ", password=" + password + ", emailId=" + emailId + "]";
	}

}
