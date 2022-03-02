
public class LeapYearDeciderClient {

	public static void main(String[] args) {
		LeapYearDecider lDecider,lDecider2,lDecider3;
		
		lDecider=new LeapYearDecider();
		lDecider.year=2018;
		System.out.println(lDecider.isLeapYear());

		lDecider2 =new LeapYearDecider();
		lDecider2.year=2020;
		System.out.println(lDecider2 .isLeapYear());
		
		lDecider3 =new LeapYearDecider();
		lDecider3.year=2022;
		System.out.println(lDecider3 .isLeapYear());		
		
	}

}
