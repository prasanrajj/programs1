package programs.programs;

class Student {
    int id;
    String name;

    // Constructor
    Student() {
        System.out.println("Constructor called ✅ (Initialization happens here)");
        id = 101;
        name = "Prasanna";
    }
}

public class MainConstructorDemo {
    public static void main(String[] args) {
        Student s = new Student(); // new creates object, constructor initializes it
    }
}

