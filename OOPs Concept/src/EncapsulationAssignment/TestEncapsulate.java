package EncapsulationAssignment;

public class TestEncapsulate {
	public static void main(String[] args) {
		Encapsulate obj = new Encapsulate();
		obj.setName("Snehal");
		obj.setRoll(11);
		obj.setAge(30);
		System.out.println("name: " +obj.getName());
		System.out.println("roll: " +obj.getRoll());
		System.out.println("age: " +obj.getAge());
	}
}
