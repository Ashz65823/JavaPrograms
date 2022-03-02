
public class InitializationMain {

	public static void main(String[] args) {
		int a=30;
		float b=40.0F;
		float c;
		int d;
		d=(int)(a+b);
		c=a+b;//mixed mode expression
		byte b1=20,b2=30;
		short s1=200;
		//short s3=b1+b2+s1 will result in error because compailer add numberic value and store it as int 
		int res=b1+b2+s1;
		// short b3=b1+b2; result in error
		final int f;
		f=25;
		//f++ will result in error because we are trying to modify
		System.out.println(f+1);//doesn't give error because we are not assigning 1 to f or making change to f
		
	}

}
