package com.zensar.training.bean;

public class Manager extends Employee{
	public double incentive;
	
	/*
	 * public Manager() { System.out.println("Manager"); }
	 */
	
	@Override//telling complier your overiding
	public double computeNetSalary()
	{
		System.out.println("Manager net salary");
		//return this.basicSalary+this.basicSalary*0.35+incentive;//code repetation
		return super.computeNetSalary()+incentive;//-->Super. is used to call the function from super class-->if any changes it will reflet in all
	}
	
	/*
	 * //@Override-> This is not allowed to override this is redefining since this
	 * is already available public static void m2() {
	 * System.out.println("m2 is employee");
	 * 
	 * }
	 * 
	 * //@Override-> The private method is up-casted to public since the class from
	 * employee is not visible to main method it cannot overridden public void
	 * m1(int a,int b) { System.out.println(a*a+b); }
	 */
}
