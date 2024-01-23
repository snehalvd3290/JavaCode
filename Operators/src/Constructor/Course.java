package Constructor;

public class Course {
	int course_id;
	String name;
	double fees;

	Course (int a, String nm, double f) {
		course_id = a;
		name = nm;
		fees = f;
	}
	void display() {
		System.out.println(course_id);
		System.out.println(name);
		System.out.println(fees);
	}
}
