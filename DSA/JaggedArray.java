package programs.programs.DSA;

import java.util.Scanner;

public class JaggedArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of rows: ");
		int rows = sc.nextInt();
		System.out.println("enter the number of columns: ");
		int columns = sc.nextInt();
		
		int[][] arr = new int[rows][columns];
		
		for(int i =0; i< arr.length; i++) {
			for(int j =0; j< arr[i].length; j++) {
				System.out.println("enter ["+i +"]" + "["+j+"]"+":");
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i =0; i< arr.length; i++) {
			for(int j =0; j< arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
