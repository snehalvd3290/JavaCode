package MethodsAssignment;

public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.accept(1,"Snehal",58.8f);
		s1.display();

		Student s2 = new Student();
		s2.accept(2,"Saba",72.1f);
		s2.display();
	}

}
