package com.zensar.training;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.zensar.training.bean.CarLoan;
import com.zensar.training.bean.HomeLoan;
import com.zensar.training.bean.Loan;
import com.zensar.training.util.HibernateUtil;

public class Main {
	
	static void insert(){
		Loan loan=new Loan();
		loan.setCustomerName("James");
		loan.setLoanAmt(9000);
		loan.setLoanDate(new Date());
		loan.setLoanId(101);
		
		CarLoan carLoan=new CarLoan();
		carLoan.setCustomerName("Abhi");
		carLoan.setLoanAmt(75000);
		carLoan.setLoanDate(new Date());
		carLoan.setCarDetails("KA-09 5555");
		carLoan.setRegisteredState("Karnataka");
		carLoan.setLoanId(102);
		
		HomeLoan homeLoan=new HomeLoan();
		homeLoan.setCustomerName("Savitha");
		homeLoan.setLoanAmt(2500000);
		homeLoan.setLoanDate(new Date());
		homeLoan.setHomeAddress("210..BDA Layout..Bangalore");
		homeLoan.setOwnedBy("Savitha");
		homeLoan.setLoanId(103);
		
		HibernateUtil.init();
		Session session=HibernateUtil.getSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(loan);
		session.save(carLoan);
		session.save(homeLoan);
		
		tx.commit();
		System.out.println("Loan Objects Saved");
		
		HibernateUtil.cleanUp();
		
	}

	public static void main(String[] args) {
		insert();

	}

}
