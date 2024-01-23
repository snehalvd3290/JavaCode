package Encapsulation;

public class TestEmployee {
public static void main(String[] args) {
	Employee e1 = new Employee(25, "Snehal");
	System.out.println(e1.getAge());
	e1.dispaly();
	
	//e1.age = 27;
	e1.setAge(27);
	e1.dispaly();
	
	//e1.age = -7;
	e1.setAge(-7);
	e1.dispaly();
	
	Employee e2 = new Employee(21, "Saba");
	e2.dispaly();
	System.out.println(e2.toString());
}
}
