
public class FactorialCalculater {
	int number;
	long getFactorial()
	{
		long fact=1;
		for(int i=1;i<=number;i++)
			fact=fact*i;
		return fact;
	}

}
