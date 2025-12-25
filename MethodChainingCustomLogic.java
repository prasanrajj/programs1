package programs;

import java.util.Scanner;

public class MethodChainingCustomLogic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter 1 number");
		int one = sc.nextInt();
		System.out.println("enter 2 number");
		int two = sc.nextInt();
		int s = square(one);
		System.out.println(s);
		
		
		
	}
	static int square(int num) {
		return (num * num);
	}
	static int power(int number ,int power) {
		 {
			while(power!=0) {
				number *= number;
				power--;
			}
			return number;
		}
	}
}
