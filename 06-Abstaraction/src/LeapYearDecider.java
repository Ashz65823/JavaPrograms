
public class LeapYearDecider {

	int year;
	boolean isLeapYear()
	{
		 if ((year % 400 == 0)|| ((year % 4 == 0) && (year % 100 != 0)))
			 return true;
		return false;
		
	}
}
