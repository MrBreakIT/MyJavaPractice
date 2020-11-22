package programParty;

import java.util.Scanner;

public class Partay {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter party favor 1: ");
		String partyFavor1 = scan.nextLine();

		System.out.println("Enter party favor 2: ");
		String partyFavor2 = scan.nextLine();

		System.out.println("Enter party favor 3: ");
		String partyFavor3 = scan.nextLine();

		System.out.println("Enter party favor 4: ");
		String partyFavor4 = scan.nextLine();

		System.out.println("Enter party favor 5: ");
		String partyFavor5 = scan.nextLine();

		System.out.println("******************");
		System.out.println("Here are your party favors:");
		System.out.println(partyFavor1);
		System.out.println(partyFavor2);
		System.out.println(partyFavor3);
		System.out.println(partyFavor4);
		System.out.println(partyFavor5);
	}

}
