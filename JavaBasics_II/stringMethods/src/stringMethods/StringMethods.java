package stringMethods;

public class StringMethods {

	public static void main(String[] args) {

		String name = "Billy Bob Joe";
		System.out.println("Name: " + name);
		System.out.println("Uppercase: " + name.toUpperCase());
		System.out.println("Lowercase: " + name.toLowerCase());
		System.out.println("First character: " + name.charAt(0));
		System.out.println("Seventh character: " + name.charAt(7));
		System.out.println("String length: " + name.length());
		System.out.println("Last character: " + name.charAt(12));
		System.out.println("Substring: " + name.substring(10, 13));

	}

}
