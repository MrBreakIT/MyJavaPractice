package breakStatements;

public class BreakStatements {

	public static void main(String[] args) {

//		break; //break cannot be used outside a loop or switch

		int i = 0;

		while (i < 3) {
			System.out.println("Hello!");
			i++;
			break;

		}
		System.out.println("----------------------------------");

		int[] numbers = { 10, 20, 30, 40, 50 };
		for (int j = 0; j < numbers.length; j++) {
			if (numbers[j] > 30) {
				break;
			}
			System.out.println(numbers[j]);
		}

		System.out.println("----------------------------------");

		int a = 5;

		switch (a) {
		case 0:
			System.out.println("Zero!");
			break;
		case 1:
			System.out.println("One!");
			break;
		case 2:
			System.out.println("Two!");
			break;
		default:
			System.out.println("WTF man?!");

		}
		System.out.println("----------------------------------");

		for (int i1 = 0; i1 < 5; i1++) {
			for (int j = 0; j < 3; j++) { // dead code b/c it reads the break ahead
				System.out.println(i1 + ", " + j);
				break;
			}
		}
	}

}
