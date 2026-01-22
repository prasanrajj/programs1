package programs.programs.DSA.algorithms;

public class PrefixSum {

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};

        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // example query: sum from L to R
        int L = 1;
        int R = 4;

        int rangeSum = prefix[R] - (L > 0 ? prefix[L - 1] : 0);

        System.out.println(rangeSum);
    }
}

