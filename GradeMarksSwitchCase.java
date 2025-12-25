package programs;

import java.util.Scanner;

public class GradeMarksSwitchCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks");
            } else {
                switch (marks / 10) {
                    case 10:
                    case 9:
                        System.out.println("Grade A");
                        break;
                    case 8:
                        System.out.println("Grade B");
                        break;
                    case 7:
                        System.out.println("Grade C");
                        break;
                    case 6:
                        System.out.println("Grade D");
                        break;
                    case 5:
                    case 4:
                        System.out.println("Grade E");
                        break;
                    default:
                        System.out.println("Fail");
                }
            }

        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numbers only.");
        }

        sc.close();
    }
}
