package ScannerClass_Logical;

import java.util.Scanner;

public class CalculateArea_Rectangle {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double length = 4.5;
		double width = 8.0;
		double area = length*width;
		System.out.println("Area of Rectangle is: " + area);
	}
}
