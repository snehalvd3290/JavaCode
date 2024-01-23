package AssignmentPractice;

public class TestCustomer {
public static void main(String[] args) {
	
	Customer c1 = new Customer ();
	c1.accept(123456789,"Snehal",1224364854);
	c1.display();
	
	Customer c2 = new Customer ();
	c2.accept(569874321,"Saba",98508853);
	c2.display();
	
	Customer c3 = new Customer ();
	c3.accept(326598741,"Pratiksha",955216645);
	c3.display();
}
}
