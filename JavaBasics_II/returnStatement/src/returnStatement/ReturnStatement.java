package returnStatement;

public class ReturnStatement {

	public static void main(String[] args) {

		printMessage();
		add(5, 4);

		int sum = add1(5, 4); // im setting the variable <SUM> to the result of another method <add1>
		System.out.println(sum);

		String shouting = allCaps("Why are you yelling?!");
		System.out.println(shouting);

		int[] awesomeArray = giveIntArray(3, 7, 1);
//		System.out.println(awesomeArray[0]);
//		System.out.println(awesomeArray[1]);
//		System.out.println(awesomeArray[2]);
		System.out.println(awesomeArray[0] + ", " + awesomeArray[1] + ", " + awesomeArray[2]);

	}

	public static void printMessage() {
		System.out.println("This is our first method!");
	}

	public static void add(int a, int b) { // void runs code and goes to next line- it doesn't return anything
		System.out.println(a + b);
	}

	public static int add1(int a, int b) { // replaced VOID with int.
		return a + b; // returns this to the function call
	}

	public static String allCaps(String s) {
		return s.toUpperCase();
	}

	public static int[] giveIntArray(int a, int b, int c) {
		int[] array = new int[3];
		array[0] = a;
		array[1] = b;
		array[2] = c;
		return array;

	}
}
