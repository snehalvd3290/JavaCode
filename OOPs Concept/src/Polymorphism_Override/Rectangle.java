package Polymorphism_Override;

public class Rectangle extends Shape{
	float l;
	float w;
	public Rectangle() {
		super();
	}
	public Rectangle(float l, float w) {
		super();
		this.l = l;
		this.w = w;
	}

	float CalArea() {
		return (l * w);
	}

	@Override
	public String toString() {
		return "Rectangle [l=" + l + ", w=" + w + "]";
	}


}
