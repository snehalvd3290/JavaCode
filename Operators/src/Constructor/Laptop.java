package Constructor;

public class Laptop {
	int pid;
	String name;
	int qty;
	double cost;
	double total_cost;

	Laptop (int pid, String name, int qty, double cost) {
		this.pid = pid;
		this.name = name;
		this.qty = qty;
		this.cost = cost;
	}

	void calculate() {
		total_cost = cost* qty;
	}

	void display() {
		System.out.println(pid + " " + name + " " + total_cost);
	}
}
