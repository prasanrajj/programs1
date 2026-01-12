package programs.programs.DSA.algorithms;

import java.util.HashMap;

public class PatternSlidingWindowUniqueMax {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2,2, 1, 2, 2};
        int k = 3;

        HashMap<Integer, Integer> map = new HashMap<>();
        int windowSum = 0;
        int maxSum = 0;

        // first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        if (map.size() == k) {
            maxSum = windowSum;
        }

        // slide the window
        for (int i = k; i < arr.length; i++) {

            // add new element
            windowSum += arr[i];
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            // remove old element
            int left = arr[i - k];
            windowSum -= left;

            map.put(left, map.get(left) - 1);
            if (map.get(left) == 0) {
                map.remove(left);
            }

            // check validity
            if (map.size() == k) {
                maxSum = Math.max(maxSum, windowSum);
            }
        }

        System.out.println(maxSum);
    }
}






