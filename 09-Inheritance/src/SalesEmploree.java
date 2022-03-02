
public class SalesEmploree extends Employee{
	private double incentive;

	double getIncentive() {
		return incentive;
	}

	void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	double computeNetSalary()
	{
		return this.getBasicSalary()+this.computeAllowance()-this.computeTax()+incentive;
	}
	

}
