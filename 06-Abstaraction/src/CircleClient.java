
public class CircleClient {

	public static void main(String[] args) {
		Circle c1=new Circle();
		c1.radius=10;
		double result=c1.getArea();
		System.out.println(result);
		
		Circle c2=new Circle();
		c2.radius=7;
		System.out.println(c2.getArea());
		
		Circle c3=new Circle();
		c3.radius=15;
		System.out.println(c3.getArea());
	}
/*
 * When a class is not created with main it can be treated as a class type(Data type)
 * class without main will be called in other class with main function using object(OBJECT WILL BE CREATED IN MAIN CLASS)
 * When each instance of the class is created an new object in heap is created 
 * The instance will have a unique hexadecimal value referring to it
 * */
}
