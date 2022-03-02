
public class TypeCasting {

	public static void main(String[] args) {
		int age;
		float v2=4000.00f;
		//age=v2 throw error so we type cast because float is bigger than int
		age=(int)v2;//explicit type casting
		System.out.println(age);
		
		byte v3=80;//implicit type casting 
		short v4=v3;
		int v5=909;
		v2=v5;//implicit
		//doesn't throw error because byte is small than i
		long v6=v5;
		v6=(long)v2;//explicit type casting since long is smaller than float
		float v7=(float)88768.90;
		boolean v8=true;
		short s=900;
		
	}

}
