package keywordFinally;

import java.util.Scanner;

public class KeywordFinally {

	public static void main(String[] args) {
//finally is about exceptions with the try & catch

		try {
			int a = 5 / 0;
		} catch (Exception e) {
			System.out.println(e + "\n <<< this is the exception that was caught >>>");
		} finally {
			System.out.println("This is in 'finally', it always gets run; exception or not");
		}

		System.out.println("--------------------------------------------------------------");

		try {
			int b = 5 / 1;
		} catch (Exception e) {
			System.out.println(e + "\n <<< this is the exception that was caught >>>");
		} finally {
			System.out.println("This is in 'finally', it always gets run; exception or not");
		}

		System.out.println("--------------------------------------------------------------");

		Scanner scan = new Scanner(System.in);
		System.out.println("Type any word!");
		System.out.println(scan.next());

		System.out.println("--------------------------------------------------------------");
		System.out.println("                  <<<    Another Example   >>>                ");

		Scanner scan1 = new Scanner(System.in);
		System.out.println("Type any word, again!");
		try {
			System.out.println(scan1.next());
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("This is in 'finally', it always gets run; exception or not");
			scan1.close();
		}
	}

}
