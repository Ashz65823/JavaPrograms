
public class CircleClient {

	public static void main(String[] args) {
		Circle circle, circle2,circle3;
		circle=new Circle();
		circle2=new Circle();
		circle3=new Circle();

		circle.setRadius(5);
		System.out.println(circle.PI);//not a method / standard
		circle2.setRadius(7);
		circle2.PI=5.9;
		System.out.println("Pi in circle 2="+circle2.PI);
		circle3.setRadius(10);
		System.out.println(circle3.PI);
		System.out.println(Circle.PI);//Standard format
		
		//Circle.greet();//Standard way
		System.out.println(circle.getArea());
		System.out.println(circle2.getArea());
		System.out.println(circle3.getArea());
	}
/*
 * Static will be saved in class loader area.
 * when a complier ,complies the program the class is loaded into class loader area
 * with that static variable is also loaded
 * To access static variable we can use object but its not the Standard format
 * we have to access using class name
 * A method can be static only if it doesn't have any instance in it
 * instance method can access both static and instance method
 * Staitc should be only for member of the class not for instance 
 * */
}
