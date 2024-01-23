package Polymorphism_Override;

public class Circle extends Shape {
	float r;

	public Circle() {

	}

	public Circle(float r) {
		super();
		this.r = r;
	}

	float CalArea() {
		return (pi*r*r);
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + "]";
	}



}