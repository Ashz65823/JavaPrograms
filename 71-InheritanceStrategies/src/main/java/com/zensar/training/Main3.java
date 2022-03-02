package com.zensar.training;

import java.util.Date;

import javax.persistence.EntityManager;

import com.zensar.training.bean.pack3.CarLoan;
import com.zensar.training.bean.pack3.HomeLoan;
import com.zensar.training.bean.pack3.Loan;
import com.zensar.training.util.JPAUtil;

public class Main3 {

	public static void insert() {
		Loan loan = new Loan();
		//loan.setLoanId(100);
		loan.setCustomerName("Simbu");
		loan.setLoanAmt(200000.00);
		loan.setLoanDate(new Date());

		CarLoan carLoan = new CarLoan();
		//carLoan.setLoanId(101);
		carLoan.setCustomerName("Vijay");
		carLoan.setLoanAmt(300000.0);
		carLoan.setLoanDate(new Date());
		carLoan.setCarDetails("KL-03-0055");
		carLoan.setRegisteredState("Kerla");

		HomeLoan homeLoan = new HomeLoan();
		//homeLoan.setLoanId(102);
		homeLoan.setCustomerName("Ajith");
		homeLoan.setLoanAmt(500000.00);
		homeLoan.setLoanDate(new Date());
		homeLoan.setHomeAddress("No 576 RT nagar");
		homeLoan.setOwnedBy("Ajith");

		EntityManager em = JPAUtil.createEntityManager("PU");
		em.getTransaction().begin();
		em.persist(loan);
		em.persist(homeLoan);
		em.persist(carLoan);
		em.getTransaction().commit();
		JPAUtil.shutDown();
	}
	public static void main(String[] args) {
		insert();
	}
}
