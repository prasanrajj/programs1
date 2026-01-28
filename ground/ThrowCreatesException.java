package programs.programs.ground;

public class ThrowCreatesException {

    public static void main(String[] args) {

        try {
            int age = 20;

            if (age < 18) {
                throw new IllegalArgumentException("Age below 18");
            }

            System.out.println("Allowed");

        } catch (IllegalArgumentException e) {
        	System.out.println("exception handled");
            System.out.println(e.getMessage());
        }
    }
}
