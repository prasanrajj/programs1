package programs.programs;

public class MainOverlaoding {

    public static void main(String[] args) {
        System.out.println(" JVM starts from main(String[] args)");

        main(10);                 // calling overloaded main manually
        main("Java");             // calling overloaded main manually
    }

    public static void main(int a) {
        System.out.println("Overloaded main(int a) | a = " + a);
    }

    public static void main(String name) {
        System.out.println("Overloaded main(String name) | name = " + name);
    }
}

