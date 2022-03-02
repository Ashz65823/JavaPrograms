
public class FactorialClient {

	public static void main(String[] args) {
		FactorialCalculater fc=new FactorialCalculater();
		fc.number=5;
		System.out.println(fc.getFactorial());
		
		FactorialCalculater fc1,fc2;
		fc1=new FactorialCalculater();
		fc1.number=6;
		System.out.println(fc1.getFactorial());
		
		fc2=new FactorialCalculater();
		fc2.number=7;
		System.out.println(fc2.getFactorial());

	}

}
