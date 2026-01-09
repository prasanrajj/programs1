package programs.programs.DSA.algorithms;

public class SlidingWindow {
	public static void main(String[] args) {
		int[] arr = { 2, 1, 5, 1, 3, 2 };
		int k = 3;

		int windowSum = 0;
		int maxSum = 0;
		int index = Integer.MIN_VALUE;

		// first window
		for (int i = 0; i < k; i++) {
			windowSum += arr[i];
		}
		maxSum = windowSum;

		// slide the window
		for (int i = k; i < arr.length; i++) {
			windowSum = windowSum - arr[i - k] + arr[i];
			if (windowSum > maxSum) {
				maxSum = windowSum;
				index = i;
			}
			maxSum = Math.max(maxSum, windowSum);

		}
System.out.println("the maximum sum value of subarray is " + maxSum + " @index = " + index);
	}
}
