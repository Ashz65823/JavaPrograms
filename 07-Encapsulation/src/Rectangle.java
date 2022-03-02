
public class Rectangle {
	private int width;
	private int height;

	Rectangle(int width, int height) {//parameterized constructor
		this.width = width;
		this.height = height;
	}
	
	Rectangle() {//default constructor
		
	}
	int getWidth() {
		return width;
	}
	void setWidth(int width) {
		this.width = width;
	}
	int getHeight() {
		return height;
	}
	void setHeight(int height) {
		this.height = height;
	}
	long getArea()
	{
		return this.height*this.width;
	}

}
