package programs.programs;

import java.util.Arrays;

public class ShallowCopyDemo {
    public static void main(String[] args) {
        int[][] original = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        // Shallow copy (only top-level copied)
        //array of 1d arrays addresses being copied here
        int[][] shallow = original.clone();

        // Changing shallow copy inner element
        shallow[0][0] = 999;

        System.out.println("Original: " + Arrays.deepToString(original));
        System.out.println("Shallow : " + Arrays.deepToString(shallow));
    }
}

