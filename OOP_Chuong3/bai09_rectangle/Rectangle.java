package bai09_rectangle;

public class Rectangle extends Shape {
	// Object's Properties
	protected int length;
	protected int width;

	// Constructors Methods
	public Rectangle() {
		super();
	}

	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}

	// Getters
	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	// Setters
	public void setLength(int length) {
		this.length = length;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	// Others
	@Override
	public String toString() {
		return super.toString() + "Rectangle [base=" + length + ", height=" + width + "]";
	}

	@Override
	public double getArea() {
		double s = (double) length * width;
		return s;
	}

}
