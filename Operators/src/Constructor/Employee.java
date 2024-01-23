package Constructor;

public class Employee {
	int id;
	String name;
	String add;
	double salary;

	Employee(int p, String nm, String ad, double s) {
		id = p;
		name = nm;
		add = ad;
		salary = s;
	}

	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(add);
		System.out.println(salary);
	}
}
