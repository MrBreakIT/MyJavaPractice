package tryCatch;

import java.util.Scanner;

public class TryCatchExamples {

	public static void main(String[] args) {

		try {
			int[] a = { 4, 5, 1 };
			System.out.println(a[3]);
		} catch (Exception e) {
			System.out.println("An exception happened!");
		}

		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("What's your favorite number?");

			int n = scan.nextInt();
			System.out.println(n);

		} catch (Exception e) {
			System.out.println("Sorry, please enter a number.");
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			System.out.println(n);
		}
		try {
//			int[] a = null;
			int[] b = { 4 };
//			System.out.println(a[1]);
			System.out.println(b[1]);
		} catch (NullPointerException e) {
			System.out.println("Your array is NULL!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Your array is OUT OF BOUNDS!");
		} catch (Exception e) {
			System.out.println("Something else went wrong.");
		}

	}

}
