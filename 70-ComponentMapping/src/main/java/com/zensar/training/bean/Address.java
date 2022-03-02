package com.zensar.training.bean;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	@Column(name="e_doorNo")
	String doorNo;
	
	@Column(name="e_areaName")
	String areaName;
	
	@Column(name="e_cityName")
	String cityName;
	public Address(String doorNo, String areaName, String cityName) {
		super();
		this.doorNo = doorNo;
		this.areaName = areaName;
		this.cityName = cityName;
	}
	public Address() {
		super();
	}
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", areaName=" + areaName + ", cityName=" + cityName + "]";
	}
	

}
