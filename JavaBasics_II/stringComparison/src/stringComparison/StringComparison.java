package stringComparison;

public class StringComparison {

	public static void main(String[] args) {

		String a = "Hello";
		String b = "Hello";

		String c = new String("Hello");// this is called the Constructor with name of class on each side (String) and
		// word new using parenthesis. So it's a method that helps to create an object
		String d = new String("Hello"); // both c & d are objects that has methods the programs know about.

		String e = "I am the Sherriff around THESE parts";

		if (a == b) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		System.out.println("-------------------------------------");

		if (c == d) { // cannot compare 2 objects with the == operator, so result is False
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		System.out.println("-------------------------------------");

		if (c.equals(d)) { // because c & d are objects- to compare them we must use method parameters not
							// comparison operators
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		System.out.println("-------------------------------------");

		if (e.toLowerCase().equals("i am the sherriff around these parts")) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
