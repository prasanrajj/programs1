package programs.programs;

import java.util.Arrays;

public class DeepCopyDemo {
	public static void main(String[] args) {
		int[][] original = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };

		// Deep copy
		int[][] deep = new int[original.length][];

		// METHOD 1 to copy or use method 2
		for (int i = 0; i < original.length; i++) {
			deep[i] = original[i].clone(); // copying each inner array
		}

		// METHOD 2 to copy or use method 1
//        for(int i = 0; i < original.length; i++){
//            deep[i] = Arrays.copyOf(original[i], original[i].length);
//        }

		// Change deep copy inner element
		deep[0][0] = 999;

		System.out.println("Original: " + Arrays.deepToString(original));
		System.out.println("Deep    : " + Arrays.deepToString(deep));
	}
}
