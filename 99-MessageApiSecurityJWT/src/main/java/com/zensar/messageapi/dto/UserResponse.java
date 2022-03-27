package com.zensar.messageapi.dto;

//This is the class to send response to the client
public class UserResponse {

	private String jwt;

	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}

	@Override
	public String toString() {
		return "UserResponse [jwt=" + jwt + "]";
	}
	
}
