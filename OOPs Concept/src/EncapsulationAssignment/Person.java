package EncapsulationAssignment;

public class Person {
	private int age;

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + "]";
	}


}
