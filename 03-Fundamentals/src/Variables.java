
public class Variables {
	int v1;//Instance variable
	static int v2;//global 
	public static void main(String[] args) {
		int age;//local variable
		//can not access out of main
		
	}
	public void Demo(double x)//parameter variable x can be used without initializing though it is local variable
	{
		int a=100;
		System.out.println(a);
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(x);
		if(a==10)
		{
			int y=9;
			System.out.println(y);
		}
		//System.out.println(y); cant use y here because it's out of scope 
	}

}
