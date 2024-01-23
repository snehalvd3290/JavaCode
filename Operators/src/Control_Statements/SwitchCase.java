package Control_Statements;

public class SwitchCase {
	public static void main(String[] args) {
		int a = 10;
		int b = 15;
		int n = 3;
		switch (n) {
		case 1:
			System.out.println("Addition is "+ a+b);
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid Input");
		}
	}
}
