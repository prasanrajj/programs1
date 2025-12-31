package programs.programs;

import java.util.Arrays;
import java.util.Scanner;


public class ReverseArrayUsingSwap {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Before Reverse: " + Arrays.toString(arr));

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            // swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("After Reverse: " + Arrays.toString(arr));
    }
}
