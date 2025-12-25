package programs;

import java.util.Scanner;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;

        while (number > 0) {//while loop till the number becomes 0 and nothing to divide further
            int digit = number % 10; // getting the last digit
            sum += digit;            // digit added to the sum
            number /= 10;            // removing the last digit
        }

        System.out.println("Sum of digits: " + sum);
        sc.close();
    }
}

