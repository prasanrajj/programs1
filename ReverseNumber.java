package programs;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        // Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number; // to keep original value
        int reverse = 0;             // will store reversed number

        // Loop runs until all digits are processed
        while (number > 0) {

            // Step 1: Get last digit
            int digit = number % 10;

            // Step 2: Shift existing digits left and add new digit
            reverse = reverse * 10 + digit;

            // Step 3: Remove last digit from number
            number /= 10;
        }

        // Print result
        System.out.println("Original Number: " + originalNumber);
        System.out.println("Reversed Number: " + reverse);

        sc.close();
    }
}

