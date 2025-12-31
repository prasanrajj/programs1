package programs.programs;

public class ArrayPlayground {

    public static void main(String[] args) {

        // 🔹 1. Array declaration & creation
        int[] numbers = new int[5];

        // JVM default values
        System.out.println("Default values:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + " = " + numbers[i]);
        }

        System.out.println("------------------");

        // 🔹 2. Assigning values
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        System.out.println("After assigning values:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + " = " + numbers[i]);
        }

        System.out.println("------------------");

        // 🔹 3. Accessing first & last elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);

        System.out.println("------------------");

        // 🔹 4. String array (non-primitive)
        String[] names = new String[3];

        System.out.println("Default String values:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]); // null
        }
        System.out.println();

        names[0] = "Java";
        names[1] = "Spring";
        names[2] = "AI";

        System.out.println("After assigning Strings:");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("------------------");

        // 🔹 5. Character array & Unicode
        char[] letters = new char[3];
        letters[0] = 'A';
        letters[1] = 66;   // Unicode of 'B'
        letters[2] = 'C';

        for (int i = 0; i < letters.length; i++) {
            System.out.println("letters[" + i + "] = " + letters[i]);
        }

        System.out.println("------------------");

        // 🔹 6. Size zero array
        int[] empty = new int[0];
        System.out.println("Empty array length: " + empty.length);

        System.out.println("------------------");

        // 🔹 7. ArrayIndexOutOfBoundsException demo (uncomment to test)
        // System.out.println(numbers[5]); // runtime exception

        System.out.println("------------------");


        // 🔹 8. Simple calculation using array//enhanced or for each loop
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of array elements = " + sum);
    }
}

