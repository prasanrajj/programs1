package programs;

import java.util.Scanner;

public class PrimeNumbersBetweenRange {
	public static void main(String[] args) {
		long beforeTime = System.currentTimeMillis();
		methodExection();
		long afterTime = System.currentTimeMillis();

		System.out.println(afterTime - beforeTime + " MILLI SECONDS");

	}

	private static void methodExection() {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter lower range: ");
		int lowerRanage = sc.nextInt();

		System.out.println("enter upper range: ");
		int upperRanage = sc.nextInt();

		int count = 0;

		for (int i = lowerRanage; i <= upperRanage; i++) {
			if (isPrime(i)) {
				count++;
				System.out.println("prime number " + count + ": " + i);
			}
		}

		System.out.println("the count of primes in between " + lowerRanage + " & " + upperRanage + " = " + count);

	}

	private static boolean isPrime(int check) {

		for (int i = 2; i <= Math.sqrt(check); i++) {
			if (check % i == 0) {
				return false;
			}
		}
		return true;
	}
}
