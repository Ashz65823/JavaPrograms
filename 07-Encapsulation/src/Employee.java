
public class Employee // noun
{
	private double basicSalary;// camel case
	private char grade;

	double getBasicSalary() {
		return basicSalary;
	}

	void setBasicSalary(double bs) {
		if (bs < 0)
			System.out.println("Invalid data");
		basicSalary = bs;
	}

	char getGrade() {
		return grade;
	}

	void setGrade(char gr) {
		grade = gr;
	}

	double getAllowance() {
		double allowance;
		switch (grade) {
		case 'A':
			allowance = basicSalary * 0.35;
			break;
		case 'B':
			allowance = basicSalary * 0.28;
			break;
		case 'C':
			allowance = basicSalary * 0.20;
			break;
		default:
			System.out.println("Invalid Grade");
			allowance = 0;
		}
		return allowance;
	}

	double getNetSalary() {
		return basicSalary + getAllowance();
	}
}
