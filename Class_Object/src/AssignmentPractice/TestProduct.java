package AssignmentPractice;

public class TestProduct {
public static void main(String[] args) {
	Product p1 = new Product ();
	p1.accept(30000,"Laptop",65.5f);
	p1.display();
	
	Product p2 = new Product ();
	p2.accept(10000,"Mobile",80.2f);
	p2.display();
	
	Product p3 = new Product ();
	p3.accept(15000,"Airpods",52.5f);
	p3.display();
}
}
