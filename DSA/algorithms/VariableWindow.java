package programs.programs.DSA.algorithms;

import java.util.Arrays;

import java.util.Arrays;

public class VariableWindow {

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 7;

        int start = 0;
        int sum = 0;
        int maxLen = 0;

        for (int end = 0; end < arr.length; end++) {

            sum += arr[end]; // expand window

            while (sum > k) { // shrink until valid
                sum -= arr[start];
                start++;
            }

            maxLen = Math.max(maxLen, end - start + 1); // state tracking
        }

        System.out.println(maxLen);
    }
}

