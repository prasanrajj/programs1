package programs.programs;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchPlayground {
 public static void main(String[] args) {
     System.out.println("Program started 🚀");
     Scanner sc = new Scanner(System.in);
     int a = 0;
     int b = 0;

     try {//try with multi catch
         System.out.println("Enter first number:");
         a = sc.nextInt();   // InputMismatchException possible

         System.out.println("Enter second number:");
         b = sc.nextInt();   // InputMismatchException possible

         int result = a / b; // ArithmeticException possible
         System.out.println("Result = " + result);

         System.out.println("This line runs only if no exception happens");

         // Nested try-catch inside try
         try {
             String s = null;
             System.out.println(s.length()); // NullPointerException
         } catch (NullPointerException e) {
             System.out.println("Handled NullPointerException inside nested try-catch 🧩");
         }

     }
     catch (InputMismatchException e) {
         System.out.println("Please enter numbers only");
         System.out.println("Message: " + e.getMessage());
     }
     catch (ArithmeticException e) {
         System.out.println("Division by zero is not allowed");
         System.out.println("Message: " + e.getMessage());
     }
     catch (RuntimeException e) {
         System.out.println("Some runtime exception occurred");
     }
     catch (Exception e) {
         System.out.println("General exception handler");
     }

     System.out.println("After try-catch execution continues");

     // Try-catch inside catch demo
     try {
         int x = 10 / 0;
     } catch (ArithmeticException e) {
         System.out.println("Outer catch triggered");

         try {
             String s = "abc";
             int n = Integer.parseInt(s); // NumberFormatException
         } catch (NumberFormatException ex) {
             System.out.println("Nested try-catch inside catch handled NumberFormatException");
         }
     }

     // Multi-catch demo
     try { 
         System.out.println("Enter a number for multi-catch demo:");
         int n = sc.nextInt();
         int r = 10 / n;
         System.out.println("Result = " + r);
     }
     catch (InputMismatchException | ArithmeticException e) {
         System.out.println("Either input is wrong or division by zero happened");
     }

     System.out.println("Program ended normally");
//     sc.close();
 }
}

