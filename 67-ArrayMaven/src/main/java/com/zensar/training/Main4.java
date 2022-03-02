package com.zensar.training;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zensar.training.bean.Bill;
import com.zensar.training.bean.BillItem;
import com.zensar.training.util.HibernateUtil;

public class Main4 {

	static void insertTest()
	{
		Bill bill=new Bill();
		bill.setCustomerName("Ash");
		bill.setBillDate(LocalDate.of(2022, 1, 4));
		
		BillItem billItem=new BillItem();
		billItem.setProductName("pen");
		billItem.setPrice(10.00);
		billItem.setQuantity(4);
		
		BillItem billItem2=new BillItem();
		billItem2.setProductName("Pencil");
		billItem2.setPrice(25.00);
		billItem2.setQuantity(5);
		
		BillItem billItem3=new BillItem();
		billItem3.setProductName("Book");
		billItem3.setPrice(150.00);
		billItem3.setQuantity(3);
		
		bill.addBillItems(billItem);
		bill.addBillItems(billItem2);
		bill.addBillItems(billItem3);
		
		
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		session.save(bill);
		tx.commit();
		HibernateUtil.cleanUp();
	}
	public static void main(String[] args) {
		
		insertTest();
	}

}
