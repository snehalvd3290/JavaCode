package ScannerClass_Logical;

import java.util.Scanner;

public class AreaOfSquare_Scanner {
	public static void main(String[] args) {
		System.out.println("Enter Side of Square:");
		Scanner scanner = new Scanner(System.in);

		double side = scanner.nextDouble();

		double area = side*side;
		System.out.println("Area of Square is: " + area);
	}
}
