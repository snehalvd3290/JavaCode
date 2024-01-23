package Inheritance;

public class SavingsAccount extends Account {
	double min_bal;

	public SavingsAccount() {
	}

	public SavingsAccount(double min_bal) {
		super();
		this.min_bal = min_bal;
	}

	public SavingsAccount(int acc_no, String name, double balance, double min_bal) {
		super(acc_no, name, balance);
		this.min_bal = min_bal;
	}

	void display() {
		System.out.println(acc_no+" "+name+" "+balance+" "+min_bal );
	}
}
