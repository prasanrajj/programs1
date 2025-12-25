package programs;

import java.util.Scanner;

public class DigitCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = 0;

        // Special case: if number is 0, it has 1 digit
        if (number == 0) {
            count = 1;
        } else {
            // Loop runs until number becomes 0
            while (number > 0) {
                number /= 10; // remove last digit
                count++;     // count one digit
            }
        }

        System.out.println("Number of digits: " + count);
        sc.close();
    }
}
