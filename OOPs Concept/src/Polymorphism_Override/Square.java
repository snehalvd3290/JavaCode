package Polymorphism_Override;

public class Square extends Shape{
	float r;

	public Square() {
		super();
	}

	public Square(float r) {
		super();
		this.r = r;
	}

	float CalArea() {
		return (r*r);
	}

	@Override
	public String toString() {
		return "Square [r=" + r + "]";
	}


}
