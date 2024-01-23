   package While;

   public class PallindromeNumber {
	 public static void main(String[] args) {
		int n=5115;
		int t=n;
		int sum=0;
		while(n>0) {
			int r = n%10;
			n= n/10;
			sum=(sum*10)+r;
		}
		if (t==sum)
			System.out.println(t+ " is Pallindrome");
		else
			System.out.println(t+ " is Not Pallindrome");
     }
    }