package Pack2;

import Pack1.A;

public class E extends A {

	public void test3()
	{
		//System.out.println(v1); private
		//System.out.println(v2);// not friend
		System.out.println(v3);//Subclass this is protected level so accessable in other package
		System.out.println(v4);
	}
	public void test4()
	{
		A obj=new A();
		//System.out.println(obj.v1); not aceess able
		//System.out.println(obj.v2); 
		//System.out.println(obj.v3); 
		System.out.println(obj.v4); 
	}

}
