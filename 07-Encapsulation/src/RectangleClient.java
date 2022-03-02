
public class RectangleClient {

	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle();//calling a default constructor;
		rectangle.setHeight(10);
		rectangle.setWidth(60);
		System.out.println(rectangle.getArea());
		
		Rectangle rectangle2=new Rectangle(4,5);//Parameterized constructor
		System.out.println(rectangle2.getArea());

	}

}
