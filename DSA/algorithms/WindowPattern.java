package programs.programs.DSA.algorithms;

import java.util.HashMap;

public class WindowPattern {
	public static void main(String[] args) {

		int[] arr = { 2, 1, 5, 1, 3, 2 };
		int k = 3;
		int max = 0;
		int index = Integer.MIN_VALUE;

		// first window creation to slide till end
		for (int i = 0; i < k; i++) {
			max += arr[i];
		}
		int window = max;

//		 slide the created window, by adding next value and
		// removing the old value from the same window
		// without adding by brute but by using the window
		for (int i = k; i < arr.length; i++) {
			System.out.println(window + " + " + arr[i]+" - "+ arr[i-k] + " = " + (window + (arr[k]) - (arr[(i-k)]) + "i = "+(i-k)));
			window = window + arr[i] - arr[(i - k)];
			System.out.println(window);
			if (window > max) {
				max = window;
				index = i;
			}
		}

		System.out.println("the maximum sum of subarray is " + max + " from index " + index);

//brute force below
//		int[] arr = {2, 1, 5, 1, 3, 2};
//		int k = 3;
//		int sum = 0;
//		int max = 0;
//		int index = Integer.MIN_VALUE;
//		
//		for(int i = 0; i < arr.length - k; i++) {
//			sum = arr[i] + arr[i+1] + arr[i+2];
//			if(max < sum) {
//				max = sum;
//				index = i;
//			}
//		}
//		System.out.println("the maximum sum of subarray is " + max +" from index "+ index);

// HashMap Storing Value
//		HashMap<Integer, Integer> map = new HashMap<>();
//
//		for (int i = 0; i < arr.length; i++) {
//			int value = arr[i];
//			if (map.containsKey(value)) {
//				map.put(value, map.get(value) + 1);
//			} else {
//				map.put(arr[i], 1);
//			}
//		}
//
//		for (var i : map.entrySet()) {
//			System.out.println(i);
//		}

	}

}
