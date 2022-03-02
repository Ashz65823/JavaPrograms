package com.zensar.training.bean;

public class LoginResponse {
	String jwt;

	public LoginResponse(String jwt) {
		super();
		this.jwt = jwt;//JSON Web Token
		/*
		 * that defines a compact and self-contained way for securely transmitting information
		 *  between parties as a JSON object.This information can be verified and trusted because 
		 *  it is digitally signed
		 * */
	}

	public LoginResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}

	@Override
	public String toString() {
		return "LoginResponse [jwt=" + jwt + "]";
	}
	
	
}
