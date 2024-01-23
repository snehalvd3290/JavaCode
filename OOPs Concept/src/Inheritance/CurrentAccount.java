package Inheritance;

public class CurrentAccount extends Account {
	double min_bal;

	public CurrentAccount() {
	}

	public CurrentAccount(double min_bal) {
		super();
		this.min_bal = min_bal;
	}

	public CurrentAccount(int acc_no, String name, double balance, double min_bal) {
		super(acc_no, name, balance);
		this.min_bal = min_bal;
	}

	void display() {
		System.out.println(acc_no+" "+name+" "+balance+" "+min_bal);
	}
	
	
}
