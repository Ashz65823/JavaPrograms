
public class EmpClient {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setBasicSalary(10000.0);
		e1.setGrade('A');
		e1.getBasicSalary();
		System.out.println(e1.getNetSalary());

		Employee e2 = new Employee();
		e2.setBasicSalary(-1.0);
		e2.setGrade('A');
		e2.getBasicSalary();
		System.out.println(e2.getNetSalary());

	}

}
