package programs.programs;

public class TypeCastingPlayground {

    public static void main(String[] args) {

        System.out.println("===== IMPLICIT TYPE CASTING (WIDENING) =====");

        byte b = 100;
        short s = b;      // byte -> short
        int i = s;        // short -> int
        long l = i;       // int -> long
        float f = l;      // long -> float
        double d = f;     // float -> double

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);

        System.out.println("\n===== EXPLICIT TYPE CASTING (NARROWING) =====");

        double d1 = 123.987;
        int i1 = (int) d1;   // decimal loss

        System.out.println("double value: " + d1);
        System.out.println("int after casting: " + i1);

        System.out.println("\n===== FLOAT TO INT (DATA LOSS) =====");

        float f1 = 45.99f;
        int i2 = (int) f1;

        System.out.println("float value: " + f1);
        System.out.println("int after casting: " + i2);

        System.out.println("\n===== CHARACTER CASTING =====");

        char c = 'A';        // Unicode 65
        int ascii = c;       // implicit

        System.out.println("char: " + c);
        System.out.println("char -> int: " + ascii);

        char c2 = (char) 66; // explicit
        System.out.println("int 66 -> char: " + c2);

        System.out.println("\n===== CHARACTER ARITHMETIC =====");

        System.out.println("'A' + 1 = " + ('A' + 1)); // numeric addition
        System.out.println("\"A\" + 1 = " + ("A" + 1)); // string concatenation

        System.out.println("\n===== OUT OF RANGE (RANGE LOOP / OVERFLOW) =====");

        byte maxByte = 127;
        System.out.println("byte max value: " + maxByte);

        maxByte++; // overflow
        System.out.println("after overflow (127 + 1): " + maxByte);

        byte minByte = -128;
        System.out.println("byte min value: " + minByte);

        minByte--; // underflow
        System.out.println("after underflow (-128 - 1): " + minByte);

        System.out.println("\n===== EXPLICIT CASTING CAUSING OVERFLOW =====");

        int bigNumber = 130;
        byte smallByte = (byte) bigNumber;

        System.out.println("int value: " + bigNumber);
        System.out.println("byte after casting: " + smallByte);

        System.out.println("\n===== FLOAT PRECISION EXAMPLE =====");

        float f2 = 12345678f;   // limited precision
        double d2 = f2;         // implicit

        System.out.println("float value: " + f2);
        System.out.println("double value: " + d2);

        System.out.println("\n===== DONE =====");
    }
}
