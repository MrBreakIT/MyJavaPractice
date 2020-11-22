package ifElse;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a grade: ");

		int n = scan.nextInt();
//		System.out.println(n);

		if (n >= 90 && n <= 100) {
			System.out.println("You earned an 'A'");

		} else if (n > 80 && n <= 89) {
			System.out.println("You earned an 'B'");

		} else if (n > 70 && n <= 79) {
			System.out.println("You earned an 'C'");

		} else if (n > 60 && n <= 69) {
			System.out.println("You earned an 'D'");

		} else if (n > 0 && n <= 59) {
			System.out.println("You didn't learn crap!'");

		} else {
			System.out.println("The number entered is not in range.");
		}
	}

}
