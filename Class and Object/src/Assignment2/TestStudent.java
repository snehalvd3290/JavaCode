package Assignment2;

public class TestStudent {
public static void main(String[] args) {
	Student s1 = new Student ();
	s1.name = "Shubhangi Paygude";
	s1.roll_no = 30;
	s1.aadhar_id = 120032652;
	s1.add = "Pune";
	s1.gender = 'F';
	s1.isMarried = false;
	s1.email = "shubhpaygude322@gmail.com";
	
	System.out.println(s1.name);
	System.out.println(s1.roll_no);
	System.out.println(s1.aadhar_id);
	System.out.println(s1.add);
	System.out.println(s1.gender);
	System.out.println(s1.isMarried);
	System.out.println(s1.email);
}
}
