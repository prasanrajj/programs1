package programs.programs.DSA;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,6,5,4,3,3,2,2,1,7};
		int max = arr [0];
		int secondMax = Integer.MIN_VALUE;

		for (int i = 1; i < arr.length; i++) {
		    if (arr[i] > max) {
		        secondMax = max;
		        max = arr[i];
		    } 
		    else if (arr[i] < max && arr[i] > secondMax) {
		        secondMax = arr[i];
		    }
		}

		System.out.println("the first max is: " + max);
		System.out.println("the second max is: " + secondMax);

	}
}
