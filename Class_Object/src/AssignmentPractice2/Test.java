package AssignmentPractice2;

public class Test {
	public static void main(String[] args) {
		Product p1 = new Product();
		p1.id=45;
		p1.name= "Pen";
		p1.price= 20;

		Product p2 = new Product();
		p2.id=12;
		p2.name= "Pencil";
		p2.price= 10;

		Product p3 = new Product();
		p3.id=12;
		p3.name= "Notebook";
		p3.price= 100;

		Bill bill = new Bill();
		Order t = bill.calBill(p1, p2, p3);
		System.out.println(t.id);
		System.out.println(t.items);
		System.out.println(t.finalbill);

	}
}
