
public class Account {
	double balance;
	int typeOfAccount;//1 0r 2
	
	double getIntrestAmount()
	{
		double amount=0.0;
		switch(typeOfAccount)
		{
		case 1:
			amount=balance*0.35;
			return amount;
		case 2:
			amount=balance*0.20;
			return amount;
		default:
			System.out.println("Invalid input");
			return amount;
		}
	}

}
