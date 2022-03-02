
public class EmpClient
{

	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.basicSalary=10000.0;
		e1.grade='B';
		System.out.println(e1.getAllowance());
		System.out.println(e1.getNetSalary());
		
		System.out.println("2nd Object");
		Employee employee=new Employee();
		employee.basicSalary=15000.0;
		employee.grade='A';
		System.out.println(employee.getAllowance());
		System.out.println(employee.getNetSalary());
		
		System.out.println("3rd Object");
		Employee employee2=new Employee();
		employee2.basicSalary=7000;
		employee2.grade='C';
		System.out.println(employee2.getAllowance());
		System.out.println(employee2.getNetSalary());
		
	}

}
