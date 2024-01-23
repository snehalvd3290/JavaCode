package While;

public class ReverseNumber {
	public static void main(String[] args) {
		int n=125;
		int sum=0;
		while(n>0) {
			int r = n%10;
			n= n/10;
			sum=(sum*10)+r;
		}
		System.out.println("Reverse No is "+sum);
		System.out.println(sum+11);
	}
}