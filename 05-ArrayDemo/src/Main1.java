import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		int a=30;
		System.out.println(a);

		int [] marks;//legal way of declaration
		//int marks1[]; not prefered 
		int n=new Scanner(System.in).nextInt();//run time declaration of array
		marks=new int [3];
		marks[0]=80;
		marks[1]=50;
		marks[2]=69;
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks.length);
		for(int i=marks.length-1;i>=0;i--)
		{
			System.out.println(marks[i]);
		}
		for(int value:marks)
		{
			System.out.println(value);
		}
		marks=null;
		/*
		 * the reference will be deleted when it is refered to null
		 * */
		marks=new int[] {10,20,30,40,50};//reinitalizating for the same array
		float []cir=new float[] {20.9f,30.8f,90.3f,100.5f};
		for(float c:cir)
		{
			System.out.println(c);
		}
	}

}
