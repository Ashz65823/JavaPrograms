
public class Manager extends Employee {
	private double vehicleAllowance;

	double getVehicleAllowance() {
		return vehicleAllowance;
	}

	void setVehicleAllowance(double vehicleAllowance) {
		this.vehicleAllowance = vehicleAllowance;
	}
	double computeNetSalary()
	{
		return this.getBasicSalary()+this.computeAllowance()-this.computeTax()+vehicleAllowance;
	}
	
	
}
