package mainMethod;

public class MainMethod {

	public static void main(String[] args) { // main method runs code inside main method. It's required and the entry
												// point for Java program.
		System.out.println(args[0]); // also passed these 3 args inside the run configurations
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println("***************");

		if (args[0].equals("Hey")) {
			System.out.println("'Hey' there!");
		} else if (args[0].equals("Hello")) {
			System.out.println("mi amigo!");
		} else if (args[0].equals("Hola")) {
			System.out.println("mi amigo!");
		}

		if (args[1].equals("Hey")) {
			System.out.println("'Hey' there!");
		} else if (args[1].equals("Hello")) {
			System.out.println("'Hello' fine sir!");
		} else if (args[1].equals("Hola")) {
			System.out.println("'Hola' mi amigo!");
		}

		if (args[2].equals("Hey")) {
			System.out.println("'Hey' there!");
		} else if (args[2].equals("'Hello' fine sir!")) {
			System.out.println("mi amigo!");
		} else if (args[2].equals("Hola")) {
			System.out.println("'Hola' mi amigo!");
		}
	}
}