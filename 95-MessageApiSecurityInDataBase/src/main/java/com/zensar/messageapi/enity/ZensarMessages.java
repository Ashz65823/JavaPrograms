package com.zensar.messageapi.enity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ZensarMessages {
	
	@Id
	private int id;
	@Column(nullable = true)
	private String message;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ZensarMessages [id=" + id + ", message=" + message + "]";
	}
	
}
