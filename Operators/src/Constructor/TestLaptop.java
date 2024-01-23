package Constructor;

public class TestLaptop {
	public static void main(String[] args) {

		Laptop l1 = new Laptop (12,"Lenovo", 2, 32000);
		l1.calculate();
		l1.display();

		Laptop l2 = new Laptop(15,"HP", 3, 25000);
		l2.calculate();
		l2.display();
	}
}