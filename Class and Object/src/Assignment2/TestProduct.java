package Assignment2;

public class TestProduct {
public static void main(String[] args) {
	Product p1 = new Product ();
	p1.product_code = 123456;
	p1.name = "Laptop";
	p1.company = "Lenovo";
	p1.type = "Electronics";
	p1.colour = "Black";
	p1.price = 30000.00;
	p1.availibility = true;
	System.out.println(p1.product_code);
	System.out.println(p1.name);
	System.out.println(p1.company);
	System.out.println(p1.type);
	System.out.println(p1.colour);
	System.out.println(p1.price);
	System.out.println(p1.availibility);
}
}
