package Pack1;

public class B {
	
	public void test1()
	{
		A obj=new A();
		//System.out.println(obj.v1); Private variable
		System.out.println(obj.v2);//can be access able by friend
		System.out.println(obj.v3);//can be access by subclass and friend class
		System.out.println(obj.v4);
	}

}
