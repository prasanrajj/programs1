package programs.programs.DSA.algorithms;

import java.util.Arrays;

public class BubbleSortExample {

    public static void main(String[] args) {

        int[] arr = {5, 1, 4, 2, 8};

        System.out.println("Before Sorting: " + Arrays.toString(arr));

        int n = arr.length;

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {

                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}
