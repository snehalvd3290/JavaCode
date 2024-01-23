package Inheritance;

public class Doctor extends Person {
	String spec;
	double fees;
	public Doctor() {
	}

	public Doctor(String spec, double fees) {
		this.spec = spec;
		this.fees = fees;
	}

	public Doctor(int id, String name, String add,
			String spec, double fees) {
		super(id, name, add);
		this.spec = spec;
		this.fees = fees;
	}

	void display() {
		System.out.println(id+" "+ name+" "+add+" "+
				spec+" "+fees);
	}
}