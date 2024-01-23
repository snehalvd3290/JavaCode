package Inheritance_Assignment;

public class Account {
double total_bal;
double min_bal;
double withdraw_amt;
double remain_bal;

Account(double total_bal){
	if (total_bal >= 1000) {
		this.total_bal = total_bal;
	}
}

void withdraw() {
	
}
}
