package primeNumber2;

import java.util.Scanner;

public class PrimeNumber2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int num = 0;
		var total = 0;
		// Empty String
		String primeNumbers = "";
		System.out.println("**********************************************************");
		System.out.println("** Program that lists Prime Numbers up to User Entry 'n'**");
		System.out.println("**********************************************************");
		System.out.println("Enter the value of n:");
		int n = scanner.nextInt();
		scanner.close();
		for (i = 1; i <= n; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				// Appended the Prime number to the String
				primeNumbers = primeNumbers + i + " ";
				total++;
			}

		}

		System.out.println("There are " + total + " prime numbers up to your input.");
		System.out.println("Prime numbers from 1 to n are :");
		System.out.println(primeNumbers);
	}
}
