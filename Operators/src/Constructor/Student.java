package Constructor;

public class Student {
	int id;
	String name;
	float per;

	Student (int a, String nm, float p) {
		id = a;
		name = nm;
		per = p;
	}

	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(per);
	}
}
