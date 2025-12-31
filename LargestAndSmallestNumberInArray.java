package programs.programs;
import java.util.Scanner;

public class LargestAndSmallestNumberInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User enters size
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();
        System.out.println();
        int[] numbers = new int[size];
        
        // Fill array with random numbers (1–100)
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 100) + 1;
        }
        
        // Print array without trailing comma
        System.out.print("Array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("Largest number: " + findLargest(numbers));
        System.out.println("Smallest number: " + findSmallest(numbers));
        
        sc.close();
    }
    static int findLargest(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    static int findSmallest(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
