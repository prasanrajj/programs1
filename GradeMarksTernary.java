package programs;

import java.util.Scanner;

public class GradeMarksTernary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        String result =
                (marks < 0 || marks > 100) ? "Invalid marks" :
                (marks >= 90) ? "Grade A" :
                (marks >= 80) ? "Grade B" :
                (marks >= 70) ? "Grade C" :
                (marks >= 60) ? "Grade D" :
                (marks >= 40) ? "Grade E" :
                "Fail";

        System.out.println(result);

        sc.close();
    }
}
