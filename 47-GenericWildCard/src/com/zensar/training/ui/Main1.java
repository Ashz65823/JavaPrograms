package com.zensar.training.ui;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.zensar.training.bean.CarLoan;
import com.zensar.training.bean.CollegeEducationLoan;
import com.zensar.training.bean.EducationLoan;
import com.zensar.training.bean.Loan;

public class Main1 {

	static void print1(List<? extends Loan>list)//Upper boundry 
	{
		System.out.println(list);
	}
	static void print2(List<? super EducationLoan>list)//Lower Boundry
	{
		System.out.println(list);
	}
	static void print3(List <?>list)//unbounded wildcard
	{
		System.out.println(list);
	}
	public static void main(String[] args) {
		List<Loan>loanList1=new ArrayList<>();
		print1(loanList1);
		print2(loanList1);
		print3(loanList1);
		List<CarLoan>loanlist2=new ArrayList<>();
		print1(loanlist2);
		print2(loanList2);
		print3(loanlist2);
		List<EducationLoan>loanlist3=new ArrayList<>();
		print1(loanlist3);
		print2(loanlist3);
		print3(loanlist3);
		List<CollegeEducationLoan>loanList4=new LinkedList<>();
		print1(loanList4);
		print2(loanlist4);
		print3(loanList4);
		List<Integer>intlist=new LinkedList<>();
		print1(IntList);//error because it's under loan
		print2(intlist);
		print3(intlist);
		
		List<Object>list6=new ArryList<>();
		print2(list6);
		print3(list6);
	}

}
/*
 * Upper bounded:
 * Loan class and all the subclass of Loan class(Car,Home,Education,College Education) can access
 * ------------------------------------------------------------------------------------------------
 * Lower Boundary:
 * Education loan and it's super class (Loan and college loan)can access other class are not super class for educational loan so it will not execute
 * -----------------------------------------------------------------------------------------------------------------------------------------------------------
 * Unbounded wild card:
 * This can use all loan class and it's subclass... Object class as well as Integer class since there is no boundary for this all class can access this method
 * -----------------------------------------------------------------------------------------------------------------------------------------------------------------
 * */
