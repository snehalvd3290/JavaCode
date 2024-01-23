package Polymorphism;

public class TestAllShapes {

	void runShapes(Shape s) {
		s.CalArea();
		s.drawShape();
		s.FillShape();
		s.m1();
		s.m2();
	} 

	public static void main(String[] args) {


		TestAllShapes ts1 = new TestAllShapes();
		Circle c1 = new Circle(5.0f);
		ts1.runShapes(c1);
		System.out.println("=========");

		Square s1 = new Square();
		ts1.runShapes(s1);
		System.out.println("=========");

		Rectangle r1 = new Rectangle();
		ts1.runShapes(r1);
		System.out.println("=========");

	}
}
