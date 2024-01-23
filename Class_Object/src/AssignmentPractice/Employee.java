package AssignmentPractice;

public class Employee {

	int id;
	String name;
	double salary;
	
	void accept (int a, String nm, double s) {
		id = a;
		name = nm;
		salary = s;
	}
	void display () {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
}
