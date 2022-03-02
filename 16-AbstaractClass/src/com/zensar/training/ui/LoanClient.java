package com.zensar.training.ui;

import com.zensar.training.bean.CarLoan;
import com.zensar.training.bean.HomeLoan;
import com.zensar.training.bean.Loan;

public class LoanClient {
	public static void main(String[] args) {
		
		Loan loan;
		loan= new CarLoan(300000,24,"TN-34-509");
		System.out.println(loan.getIntrestAmount());
		
		loan=new HomeLoan(300000,24,"Bangalore");
		System.out.println(loan.getIntrestAmount());
	}

}
