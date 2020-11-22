package methods;

public class Methods {

	public static void main(String[] args) {

		multiply(5, 100);
		welcome();
		multiply(2, 3);
		multiply(6, 8);
		divide(20, 5);
		divide(100, 10);
		divide(66, 11);
	}

	public static void welcome() {
		System.out.println("Welcome to my calculator.");
	}

	public static void multiply(int a, int b) {
		System.out.println(a * b);
	}

	public static void divide(int a, int b) {
		System.out.println(a / b);
	}
}
