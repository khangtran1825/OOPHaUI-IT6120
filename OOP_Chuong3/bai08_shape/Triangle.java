package bai08_shape;

public class Triangle extends Shape {
	// Object's Properties
	protected int base;
	protected int height;

	// Constructors Methods
	public Triangle() {
		super();
	}

	public Triangle(int length, int width) {
		super();
		this.base = length;
		this.height = width;
	}

	// Getters
	public int getBase() {
		return base;
	}

	public int getHeight() {
		return height;
	}

	// Setters
	public void setBase(int length) {
		this.base = length;
	}

	public void setHeight(int width) {
		this.height = width;
	}

	// Others
	@Override
	public String toString() {
		return super.toString() + "Rectangle [base=" + base + ", height=" + height + "]";
	}

	@Override
	public double getArea() {
		double s = (double) base * height * 0.5;
		return s;
	}

}
