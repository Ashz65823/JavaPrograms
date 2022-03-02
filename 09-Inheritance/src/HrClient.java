
public class HrClient {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(101);
		e.setName("Ash");
		e.setBasicSalary(10000);
		System.out.println(e.computeNetSalary());
		
		SalesEmploree sEmploree=new SalesEmploree();
		sEmploree.setId(202);
		sEmploree.setName("Savi");
		sEmploree.setBasicSalary(12000);
		sEmploree.setIncentive(2000);
		System.out.println(sEmploree.computeNetSalary());
		
		Manager manager=new Manager();
		manager.setId(404);
		manager.setName("Aishu");
		manager.setBasicSalary(15000);
		manager.setVehicleAllowance(3000);
		System.out.println(manager.computeNetSalary() );
		System.out.println(manager.getId());
		
	}
}
