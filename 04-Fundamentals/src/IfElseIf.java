/*
 * 100-90=A
 * 70-89=B
 * 50-69=C
 * 0-50=D
 * <0=invalid value*/
import java.util.*;
public class IfElseIf {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your mark to see your grade");
		int mark=sc.nextInt();
		if(mark >=90)
			System.out.println("A");
		else if(mark >=70)
			System.out.println("B");
		else if(mark >=50)
			System.out.println("C");
		else 
			System.out.println("D");

	}

}
