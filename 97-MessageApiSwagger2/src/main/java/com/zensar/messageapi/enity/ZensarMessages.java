package com.zensar.messageapi.enity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel(value="MessageModel",description = "This represent Message Model object on Angular")
public class ZensarMessages {
	
	@Id
	@ApiModelProperty(notes = "This is an Id attribute ")
	private int id;
	@Column(nullable = true)
	private String name;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "ZensarMessages [id=" + id + ", name=" + name + "]";
	}
	
}
