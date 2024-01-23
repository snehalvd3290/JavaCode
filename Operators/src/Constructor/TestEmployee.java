package Constructor;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee(21,"Snehal", "Pune", 12000);
		e1.display();

		Employee e2 = new Employee(10,"Saba", "Mumbai", 10000);
		e2.display();
	}
}
