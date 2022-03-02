
public class OddEvenDeciderClient {

	public static void main(String[] args) {
		OddEvenDecider oDecider,oDecider2,oDecider3;
		
		oDecider=new OddEvenDecider();
		oDecider.number=8;
		System.out.println(oDecider.checkNumber());
		
		oDecider2=new OddEvenDecider();
		oDecider2.number=15;
		System.out.println(oDecider2.checkNumber());
		
		oDecider3=new OddEvenDecider();
		oDecider3.number=7;
		System.out.println(oDecider3.checkNumber());

	}

}
