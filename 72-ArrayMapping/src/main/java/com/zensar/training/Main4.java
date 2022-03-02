package com.zensar.training;

import java.time.LocalDate;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zensar.training.bean.Bill;
import com.zensar.training.bean.BillItem;
import com.zensar.training.util.JPAUtil;


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
		
		EntityManager em=JPAUtil.createEntityManager("PU");
		em.getTransaction().begin();
		em.persist(bill);
		em.getTransaction().commit();
		JPAUtil.shutDown();
		
	}
	public static void main(String[] args) {
		
		insertTest();
	}

}
