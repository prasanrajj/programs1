package programs.programs.ground;

public class ExceptionDemo {

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            int result = a / b; // risky code
            System.out.println(result);

        } catch (ArithmeticException e) {
            // handling the exception
            System.out.println("Cannot divide by zero. Please check the input.");
        }

        // program continues normally
        System.out.println("Program is still running...");
    }
}

