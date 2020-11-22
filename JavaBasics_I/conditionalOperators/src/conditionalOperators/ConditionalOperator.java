package conditionalOperators;

public class ConditionalOperator {

	public static void main(String[] args) {

		int a = (7 > 3) ? 7 : 3;

		// same statement below
		if (7 > 3) {
			a = 7;
		} else {
			a = 3;
		}

		System.out.println(a);

		String b = "hello";
		String result = b.equals("hello") ? "hello Johnny" : "You DUMB!";
		Integer result2 = b.equals("howdy") ? -0 : 57;
		System.out.println(result);
		System.out.println(result2);

	}

}
