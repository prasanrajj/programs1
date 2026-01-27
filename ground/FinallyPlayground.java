package programs.programs.ground;
import java.util.Scanner;

public class FinallyPlayground {

    static int demoReturn() {
        try {
            System.out.println("Inside try");
            int x = 10 / 0; // ArithmeticException
            return 10;
        } catch (ArithmeticException e) {
            System.out.println("Inside catch");
            return 0;
        } finally {
            System.out.println("Inside finally");
            return 1; // overrides try/catch return
        }
    }

    static void demoFinallyExecution() {
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            System.out.println("Enter a number:");
            int n = sc.nextInt(); // InputMismatchException possible
            System.out.println("You entered: " + n);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getClass().getSimpleName());
        } finally {
            System.out.println("Closing resource in finally");
            if (sc != null) {
                sc.close(); // safe cleanup
            }
        }
    }

    static void demoSystemExit() {
        try {
            System.out.println("Before System.exit");
            System.exit(0); // JVM shutdown
        } finally {
            // This will NOT execute
            System.out.println("This finally will never run");
        }
    }

    public static void main(String[] args) {

        System.out.println("---- Return override demo ----");
        int result = demoReturn();
        System.out.println("Returned value = " + result);

        System.out.println("\n---- Finally cleanup demo ----");
        demoFinallyExecution();

        // Uncomment to test finally NOT executing
        // demoSystemExit();

        System.out.println("\nProgram ended normally");
    }
}
