package com.zensar.training.bean;

import java.time.LocalDate;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name ="Bill50")
public class Bill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int billId;
	String customerName;
	LocalDate billDate;
	@Transient
	int index;
	
	
	@ElementCollection
	@OrderColumn(name="idx")
	@CollectionTable(name="BillItems50")
	BillItem[] billItems=new BillItem[3];
	//setter and getter expect index
	public int getBillId() {
		return billId;
	}
	public void setBillId(int billId) {
		this.billId = billId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public LocalDate getBillDate() {
		return billDate;
	}
	public void setBillDate(LocalDate billDate) {
		this.billDate = billDate;
	}
	public BillItem[] getBillItems() {
		return billItems;
	}
	public void setBillItems(BillItem[] billItems) {
		this.billItems = billItems;
	}
	
	public void addBillItems(BillItem billItem)
	{
		this.billItems[index++]=billItem;
	}
	
	

}
