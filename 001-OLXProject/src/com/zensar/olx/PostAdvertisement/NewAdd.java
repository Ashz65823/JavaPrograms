package com.zensar.olx.PostAdvertisement;

import java.time.LocalDate;

import com.zensar.olx.advertise.AdStatus;
import com.zensar.olx.advertise.Status;
import com.zensar.olx.login.Registration;

public class NewAdd {
	
	int id;
	String title;
	double price;
	String category;
	String discription;
	String photo;
	LocalDate createdDate;
	LocalDate modifiedDate;
	AdStatus status;
	Registration userName;
}
