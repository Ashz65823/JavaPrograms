package Pack2;

import Pack1.A;

public class D {
	public void test2()
	{
		A obj=new A();
		//System.out.println(obj.v2);//not access able package level
		//System.out.println(obj.v3);//not access able protected 
		System.out.println(obj.v4);//public
	}

}
