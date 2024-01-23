package Encapsulation;

public class Employee {
	private int age;
	String name;

	Employee (int age, String name){
		this.age = age;
		this.name = name;

	}

	void setAge(int age) {
		if(age>0)
			this.age = age;
			else
				System.out.println(age + "<< invalid age>>" );
	}

	int getAge() {
		return age;
	}
	
	void dispaly() {
		System.out.println(age+ " " + name);
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + "]";
	}
	
	
}
