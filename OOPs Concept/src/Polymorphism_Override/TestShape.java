package Polymorphism_Override;

public class TestShape {
	public static void main(String[] args) {
		float area;
		Rectangle r1 = new Rectangle(4.5f,5.5f);
		area = r1.CalArea();
		System.out.println("Area of Rectangle is: "+ area);

		Circle c1 = new Circle(5.0f);
		area = c1.CalArea();
		System.out.println("Area of Circle is: "+ area);

		Square s1 = new Square(4.5f);
		area = s1.CalArea();
		System.out.println("Area of Square is: "+ area);
	}
}
