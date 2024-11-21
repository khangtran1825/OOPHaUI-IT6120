package bai07_resizablecircle;

public class Circle implements GeometricObject {
	// Object's Properties
	protected double radius = 1.0;

	// Constructor Methods
	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	// Getter Method
	public double getRadius() {
		return radius;
	}

	// Setter Method
	public void setRadius(double radius) {
		this.radius = radius;
	}

	// Other Methods
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	public double getPerimeter() {
		double p = 2 * 3.14 * radius;
		return p;
	}

	@Override
	public double getArea() {
		double s = 3.14 * radius * radius;
		return s;
	}

}
