package exponents;

public class Exponents {

	public static void main(String[] args) {

//		int a = 5;
//		System.out.println(5 * 5);

//		if you wanted to store to a double
		double exponent = Math.pow(5, 3);
		System.out.println(exponent);

		System.out.println((int) Math.pow(5, 2));
//			for the exponent, first # is the base and second # is the exponent
//			the (int) before Math.pow changes result to an integer vs a double... 25 vs 25.0

		System.out.println(Math.pow(8, 5));
		System.out.println(Math.pow(5.5, 3.9));
	}

}
