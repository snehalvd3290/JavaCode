package Constructor;

public class Customer {
int ac_no;
String name;
double amount;

Customer(int ac, String nm, double a) {
	ac_no = ac;
	name = nm;
	amount = a;
}

void display() {
	System.out.println(ac_no);
	System.out.println(name);
	System.out.println(amount);
}
}
