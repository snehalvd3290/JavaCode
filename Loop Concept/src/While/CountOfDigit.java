package While;

public class CountOfDigit {
	public static void main(String[] args) {
		int n=125;
		int sum=0;
		int cnt=0;
		while(n>0) {
			int r = n%10;
			n= n/10;
			sum=sum+r;
			cnt++;
		}
		System.out.println("Sum of Digit is "+sum);
		System.out.println("Count of Digit is "+cnt);
	}
}