package programs.programs.DSA;

public class LargestDigitOfANumber {
	public static void main(String[] args) {
		int n = 867;
		int largest=0;
		while(n!=0) {
			int digit = (n%10);
			if(digit > largest)
				largest = digit;
			
			n=n/10;
			
		}
		System.out.println(largest);
	}
}
