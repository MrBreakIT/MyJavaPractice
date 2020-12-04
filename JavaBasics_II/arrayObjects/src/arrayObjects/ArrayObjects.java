package arrayObjects;

class Monkey { // a class just has variables and methods..... below, in the main, is where the
				// program begins to run
	String type = "Spider Monkey";

	public void sayOohAhhAhh() {
		System.out.println("Ooh Ahh Ahh");
	}
}

public class ArrayObjects {

	public static void main(String[] args) {

		Monkey m1 = new Monkey();
		Monkey m2 = new Monkey();
		Monkey m3 = new Monkey();

		Monkey[] monkeys = { m1, m2, m3 };
		for (Monkey m : monkeys) { // "for Each monkey object it sees inside monkey array, call the current monkey
									// 'm' and run code inside method
			m.sayOohAhhAhh();
		}

//		System.out.println(monkeys[0]);
	}

}
