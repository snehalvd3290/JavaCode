package AssignmentPractice;

public class Product {

	int cost;
	String name;
	float sales;
	
	void accept (int a, String nm, float s) {
		cost = a;
		name = nm;
		sales = s;
	}
	void display () {
		System.out.println(cost);
		System.out.println(name);
		System.out.println(sales);
}
}