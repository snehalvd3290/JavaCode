package MethodsAssignment;

public class Student {
	int id;
	String name;
	float per;

	void doStudy() {
		System.out.println(" Student is Studying...");
	}
	void doAssignment() {
		System.out.println("Student is doing Assignment");
	}

	void accept(int a, String nm, float p) {
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
