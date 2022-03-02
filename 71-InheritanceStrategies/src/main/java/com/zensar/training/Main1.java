package com.zensar.training;

import java.util.Date;
import javax.persistence.EntityManager;
import com.zensar.training.bean.pack1.CarLoan;
import com.zensar.training.bean.pack1.HomeLoan;
import com.zensar.training.bean.pack1.Loan;
import com.zensar.training.util.JPAUtil;

public class Main1 {
	public static void insert() {
		Loan loan = new Loan();
		loan.setCustomerName("Bala");
		loan.setLoanAmt(100000.00);
		loan.setLoanDate(new Date());

		CarLoan carLoan = new CarLoan();
		carLoan.setCustomerName("Rohit");
		carLoan.setLoanAmt(200000.0);
		carLoan.setLoanDate(new Date());
		carLoan.setCarDetails("KA-23-3355");
		carLoan.setRegisteredState("Karnataka");

		HomeLoan homeLoan = new HomeLoan();
		homeLoan.setCustomerName("Alice");
		homeLoan.setLoanAmt(300000.00);
		homeLoan.setLoanDate(new Date());
		homeLoan.setHomeAddress("No 362 JB nagar");
		homeLoan.setOwnedBy("Alice");

		EntityManager em = JPAUtil.createEntityManager("PU");
		em.getTransaction().begin();
		em.persist(loan);
		em.persist(homeLoan);
		em.persist(carLoan);
		em.getTransaction().commit();
		JPAUtil.shutDown();
	}

	public static void read() {

	}

	public static void update() {

	}

	public static void delete() {

	}

	public static void main(String[] args) {
		insert();
		// read();
		// update();
		// delete();

	}

}
