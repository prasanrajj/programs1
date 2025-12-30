package programs.programs;

import java.util.Scanner;

public class ToggleCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter string: ");
		String s = sc.nextLine();
		StringBuilder sb = new StringBuilder(s);
		for(int i =0; i < s.length(); i++) {
			if(i%2==0 || i == 0) {
				sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
			}
			else {
				sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
			}
		}
		System.out.println(sb.toString());
	}

}
