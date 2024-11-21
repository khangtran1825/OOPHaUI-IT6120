package bai09_rectangle;

public abstract class Shape {
	// Object's Properties
	protected String color;

	// Abstract Method
	public abstract double getArea();

	// Others
	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}
}
