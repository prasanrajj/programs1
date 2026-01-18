package programs.programs;

import java.awt.print.Printable;

public class JaggedArrayDemo {
    public static void main(String[] args) {
        int[][] marks = new int[3][];

        marks[0] = new int[] {10, 20};
        marks[1] = new int[] {1, 2, 3, 4};
        marks[2] = new int[] {7, 8, 9};

// Another way to declare array ⬇️ 
//        int[][] marks = {
//        	    {90, 80},
//        	    {88, 92, 70, 60, 85},
//        	    {75, 89, 91}
//        	};
        
        //altering the array values according to the indexing[rows][columns]
        marks[1][2] = 100;  // row 1 col 2 becomes 100
        
        //altering the entire row
        marks[0] = new int[] {99, 98, 97, 96}; // old row replaced with new row
        
        print(marks);

    }
    
    static void print(int[][] arr) {
    	for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

