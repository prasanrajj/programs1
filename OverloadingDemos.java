package programs.programs;

class Calculator {

    //Overload 1
    int add(int a, int b) {
        return a + b;
    }

    //Overload 2 (different data types)
    double add(double a, double b) {
        return a + b;
    }

    //Overload 3 (different number of params)
    int add(int a, int b, int c) {
        return a + b + c;
    }

    //Overload 4 (different order)
    String add(String a, int b) {
        return a + b;
    }
}

public class OverloadingDemos {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println(c.add(10, 20));         // calls add(int,int)
        System.out.println(c.add(10.5, 20.5));     // calls add(double,double)
        System.out.println(c.add(1, 2, 3));        // calls add(int,int,int)
        System.out.println(c.add("Sum = ", 100));  // calls add(String,int)
    }
}

