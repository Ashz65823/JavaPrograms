package com.zensar.training;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zensar.training.bean.Product;


public class Main2 {

	public static void main(String[] args) {
		insertTesting();
		// loadTesting(2);

		// loadAllTesting();

		// updateTesting(1);
		// deleteTesting(2);
	}

	private static void insertTesting() {
		Product product=new Product();
		product.setId(1001);
		product.setName("Dall");
		product.setDiscount(0,5);
		product.setDiscount(1, 10);
		product.setDiscount(2, 15);
		product.setDiscount(3, 20);
		
	
	}

}
