package programs.programs.ground;

class Calculator {

    static void divide() throws ArithmeticException {
        int a = 10;
        int b = 0;
        System.out.println(a / b); // exception thrown
    }
}
public class ThrowsExceptionHandledAtCaller {

    public static void main(String[] args) {

        try {
            Calculator.divide(); // exception propagated here

        } catch (ArithmeticException e) {
            // handling at caller
            System.out.println("Division by zero handled in main.");
        }

        // program continues
        System.out.println("Program continues after handling.");
    }
}

