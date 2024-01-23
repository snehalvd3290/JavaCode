package Assignment2;

public class TestCustomer {
public static void main(String[] args) {
	
	
	Customer c1 = new Customer ();
	c1.aadhar_id = 123456789;
	c1.name = "Snehal Darwatkar";
	c1.age = 32;
	c1.mobile = 985088531;
	c1.email = "snehalvd3290@gmail.com";
	c1.gender = 'F';
	c1.isMarried = true;
	c1.acc_type = "Saving";
	c1.amount = 5000.00;
  System.out.println(c1.aadhar_id);
  System.out.println(c1.name);
  System.out.println(c1.age);
  System.out.println(c1.mobile);
  System.out.println(c1.email);
  System.out.println(c1.gender);
  System.out.println(c1.isMarried);
  System.out.println(c1.acc_type);
  System.out.println(c1.amount);

}
}
