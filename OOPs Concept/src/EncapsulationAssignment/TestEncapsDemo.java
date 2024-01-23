package EncapsulationAssignment;

public class TestEncapsDemo {
	public static void main(String[] args) {
		EncapsulationDemo obj = new EncapsulationDemo();
		obj.setEmpSSN(112233);
		obj.setEmpName("Snehal");
		obj.setEmpAge(30);
		System.out.println("Employee SSN: " +obj.getSSN());
		System.out.println("Employee Name: " +obj.getEmpName());
		System.out.println("Employee Age: " +obj.getEmpAge());
	}
}
