package Assignment2;

public class TestEmployee {
public static void main(String[] args) {

	Employee a1 = new Employee ();
	a1.aadhar_id = 987654321;
	a1.name = "Saba pathan";
	a1.age = 21;
	a1.mobile = 985088531;
	a1.email = "sabapathan21@gmail.com";
	a1.gender = 'F';
	a1.isMarried = false;
	a1.salary = 12000.00;
	System.out.println(a1.aadhar_id);
	System.out.println(a1.name);
	System.out.println(a1.age);
	System.out.println(a1.mobile);
	System.out.println(a1.email);
	System.out.println(a1.gender);
	System.out.println(a1.isMarried);
	System.out.println(a1.salary);
}
}
