package PracticeAssignment;

public class DataType_Boolean {
boolean a = true;
	void check() {
	if(a == true) {
		a = false;
		System.out.println("The Boolean value is: " + a);
	}
}
public static void main(String[] args) {
	DataType_Boolean obj = new DataType_Boolean();
	obj.check();
	System.out.println(obj.a);
}
}
