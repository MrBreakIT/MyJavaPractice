package forLoop;

public class ForLoop {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println("I love dogs!");
		}
		System.out.println("**********");

		for (int i = 0; i <= 15; i++) {
			System.out.print(i + ", ");
		}
		System.out.println();
		System.out.println("**********");

		int[] grades = { 98, 100, 85, 76 };
		for (int i = 0; i < grades.length; i++) {
			System.out.println(grades[i]);
		}
		System.out.println("**********");
	}

}
