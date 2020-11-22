package stringToInteger;

public class StringToInteger {

	public static void main(String[] args) {

		String s = "102";
//		Integer.parseInt(s);  using the Integer.parseInt keyword changes a string into an integer
		System.out.println(Integer.parseInt(s) + 4);

		int n = Integer.parseInt("3");
		System.out.println("3" + 4); // this simply places the string "3" next to integer 4
		System.out.println(n + 4);

		int x = 8;
		System.out.println(x + 1);
		System.out.println(Integer.toString(x) + 1); // the toString keyword reverses the integer into a string and
														// concatenates it to 81

		String m = "age: 47";
		m = m.replaceAll("\\D+", ""); // called a regular expression and only grabs the integers from a whole string
		System.out.println(m);

		int t = Integer.parseInt(m);
		System.out.println(t + 2);

	}

}
