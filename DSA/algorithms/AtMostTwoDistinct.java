package programs.programs.DSA.algorithms;

import java.util.HashMap;

import java.util.HashMap;

public class AtMostTwoDistinct {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 1, 2, 3 };

		int start = 0;
		int maxLen = 0;

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int end = 0; end < arr.length; end++) {

			map.put(arr[end], map.getOrDefault(arr[end], 0) + 1);// HashMap counting

			// if >2 distinct
			while (map.size() > 2) {
				int left = arr[start];
				map.put(left, map.get(left) - 1);// removing the start

				if (map.get(left) == 0) {// removing the entire item
					map.remove(left);
				}

				start++;// increasing start
			}

			maxLen = Math.max(maxLen, end - start + 1);// noting every max length
		}

		System.out.println(maxLen);
	}
}
