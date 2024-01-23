package Polymorphism;

public class Circle extends Shape {
	float r;
	public Circle(float f) {	
	}
	@Override
	void CalArea() {
		System.out.println("Area of Circle: ");
	}
	void drawShape() {
		System.out.println("Circle is Drawing: ");
	}
	void FillShape() {
		System.out.println("Circle is Filled: ");
	}
	void m1() {
		System.out.println("Circle is m1..");
	}
	void m2() {	
		System.out.println("Circle is m2..");
	}
}
