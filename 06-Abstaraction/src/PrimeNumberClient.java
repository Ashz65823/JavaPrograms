
public class PrimeNumberClient {

	public static void main(String[] args) {
		
		PrimeNumberDecider prDecider=new PrimeNumberDecider();
		prDecider.number=5;
		System.out.println(prDecider.isPrimeNumber());
		
		PrimeNumberDecider pDecider=new PrimeNumberDecider();
		pDecider.number=10;
		System.out.println(pDecider.isPrimeNumber());
		
		PrimeNumberDecider decider=new PrimeNumberDecider();
		decider.number=3;
		System.out.println(decider.isPrimeNumber());

	}

}
