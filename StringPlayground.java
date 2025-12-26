package programs.programs;

public class StringPlayground {

    public static void main(String[] args) {

        // 🔹 String creation
        String s1 = "Java";                  // literal (String Constant Pool)
        String s2 = "Java";                  // same SCP reference
        String s3 = new String("Java");      // new object in heap
        String s4 = new String("Java");      // another heap object

        System.out.println("== vs equals()");
        System.out.println(s1 == s2);        // true (same reference)
        System.out.println(s3 == s4);        // false (different objects)
        System.out.println(s1.equals(s4));  // true (same content)

        System.out.println("------------");

        // 🔹 Case sensitivity
        String s5 = "Reality";
        String s6 = "reality";

        System.out.println(s5.equals(s6));              // false
        System.out.println(s5.equalsIgnoreCase(s6));    // true

        System.out.println("------------");

        // 🔹 Length & indexing
//        			   012345678910;//11
        String word = "Programming";

        System.out.println("Length: " + word.length());      // total characters
        System.out.println("First char: " + word.charAt(0)); // index 0
        System.out.println("Last char: " + word.charAt(word.length() - 1));
        System.out.println("Second last char: " + word.charAt(word.length() - 2));

        System.out.println("------------");

        // 🔹 Index search
        System.out.println(word.indexOf('g'));        // first occurrence
        System.out.println(word.lastIndexOf('g'));    // last occurrence
        System.out.println(word.indexOf('z'));        // -1 (not found)

        System.out.println("------------");

        // 🔹 Starts / Ends
        System.out.println(word.startsWith("Pro"));   // true
        System.out.println(word.endsWith("ing"));     // true

        System.out.println("------------");

        // 🔹 Contains
        System.out.println(word.contains("gram"));    // true
        System.out.println(word.contains("xyz"));     // false

        System.out.println("------------");

        // 🔹 Case conversion
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());

        System.out.println("------------");

        // 🔹 Trim
        String spaced = "   Java Full Stack   ";
        System.out.println(spaced.trim());

        System.out.println("------------");

        // 🔹 Empty vs Blank
        String empty = "";
        String blank = "   ";

        System.out.println(empty.isEmpty());  // true
        System.out.println(blank.isEmpty());  // false

        System.out.println(blank.isBlank());  // true
        System.out.println(empty.isBlank());  // true

        System.out.println("------------");

        // 🔹 Concatenation (immutability)
        String a = "Hello";
        a = a.concat(" World");
        System.out.println(a);

        System.out.println("------------");

        // 🔹 compareTo
        System.out.println("A".compareTo("B"));  // negative
        System.out.println("B".compareTo("A"));  // positive
        System.out.println("A".compareTo("A"));  // 0

        System.out.println("------------");

        // 🔹 Replace
        String replaced = "banana".replace('a', 'o');
        System.out.println(replaced);

        System.out.println("------------");

        // 🔹 Substring
        String sub = "Developer";

        System.out.println(sub.substring(3));        // from index 3 to end
        System.out.println(sub.substring(3, 6));     // index 3 to 5

        System.out.println("------------");

        // 🔹 Chaining methods (fun part)
        String chain = "   Java Developer   ";
        String result = chain.trim().toUpperCase().substring(0, 4);
        System.out.println(result); // JAVA
    }
}

