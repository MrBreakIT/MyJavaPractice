package logicalOperators;

public class LogicalOperators {

	public static void main(String[] args) {

		// &&, ||, !

		int a = 3;
		int b = 4;

		boolean c = !((a < b) && true);
		boolean isSunny = true;

		if (a > b && isSunny) {
			System.out.println("It's gonna be a good day.");
		} else {
			System.out.println("It's a boring day.");
		}

		System.out.println(c);

	}

}
