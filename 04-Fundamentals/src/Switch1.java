
public class Switch1 {

	public static void main(String[] args) {
		byte b=50;
		switch(b)//value in case should be inside range 32769 will be an error
		{
		case 20: System.out.println("A1");
		   					break;
		case 30: System.out.println("A2");
			break;
		case 40: System.out.println("A3");
			break;
		case 50: System.out.println("A4");
				break;
		default :System.out.println("Invalid Input");
		}
final short v1=10;//can be used in switch case only when we declared as final 
final short v2=20;
final short v3=30;
switch(b)//value in case should be inside range 32769 will be an error
{
case v1: System.out.println("A1");
   					break;
case v2: System.out.println("A2");
	break;
case v3: System.out.println("A3");
	break;
case v1+v3: System.out.println("A3");
default :System.out.println("Invalid Input");
}
	}
}
