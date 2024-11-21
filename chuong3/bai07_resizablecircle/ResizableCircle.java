package bai07_resizablecircle;

public class ResizableCircle extends Circle implements Resizable {
	// Constructor Methods
	public ResizableCircle() {
		super();
	}

	public ResizableCircle(double radius) {
		super(radius);
	}

	// Other Method
	@Override
	public void resize(int percent) {
		radius = (double) percent / 100 * radius;
	}

}
