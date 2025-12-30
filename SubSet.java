package programs.programs;

import java.util.Scanner;

public class SubSet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter string: ");
		String s ;//= sc.nextLine();
		s = "abcd";
		StringBuilder sb = new StringBuilder(s);
		
		for(int i = 0; i < sb.length() - 1; i++) {
			for(int j = i; j< sb.length()-1;j++) {
				for(int k = j+1; k< sb.length(); k++) {
					System.out.print(sb.charAt(k));
				}
				System.out.println();
			}
			System.out.println("=====================");
		}
	}

}
