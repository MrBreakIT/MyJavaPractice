package comparisonOperators;

public class ComparisonOperators {

	public static void main(String[] args) {

		// == is equal to
		// != not equal to
		// <= less than or equal to
		// < less than
		// < greater than
		// >= greater than or equal to
		// || OR
		// && AND

		int a = 5;
		int b = 4;
		double c = 4.2;
		double d = 5.5;

		boolean e = (a != b);
		System.out.println(e);

		boolean f = (c > d);
		System.out.println(f);

		if (a == 5) {
			System.out.println("Yes, they are equal!");
		}
		if (a != d) {
			System.out.println("Yes, they are NOT equal!");
		}
		if (a == 5 || a == 4 || a == 6) {
			System.out.println("A is either 5, 4, or 6.");
		}
		if (a != 5 || a != 4) {
			System.out.println("A is 5 but not 4. This is false then true.");
		}
		if (a >= 0 && a < 100) {
			System.out.println("A is in range between 0 and 100.");
		}
	}

}
