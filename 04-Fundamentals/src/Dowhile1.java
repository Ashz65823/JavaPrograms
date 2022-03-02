import java.util.Scanner;

public class Dowhile1 {

	public static void main(String[] args) {
		int ch;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("5. Exit");
		
		System.out.println("Enter your choose");
		ch=sc.nextInt();
		}while(ch!=5);

	}

}
