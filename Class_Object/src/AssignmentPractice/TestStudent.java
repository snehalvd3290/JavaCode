package AssignmentPractice;

public class TestStudent {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.id=4;
		s1.name= "Snehal";
		s1.per= 50.5f;

		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.per);

		s1.DoStudy();
		s1.AttendExam();
	}
}
