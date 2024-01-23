package AssignmentPractice;

public class Customer {

	long aadhar_id;
	String name;
	int mobile_no;
	
	void accept (long a, String nm, int mob) {
		aadhar_id = a;
		name = nm;
		mobile_no = mob;
	}
	void display () {
		System.out.println(aadhar_id);
		System.out.println(name);
		System.out.println(mobile_no);
}
}