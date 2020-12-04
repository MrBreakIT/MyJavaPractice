package methodParams;

public class MethodParameters {

	public static void main(String[] args) {

//		saySomething("I want to say hello."); // inside ( ) is called the argument and goes in the the method call
//		saySomething("goodbye");
//		saySomething("whatev's");

		printInfo("John", 43);
		printInfo("Joy", 44);
		printInfo("RJ", 37);

		System.out.println(add(4, 5)); // the arguments 4,5 are called to return the addition from the Method below
	}

	public static void printInfo(String name, int age) { // the String s, is called the Method parameter and will not
															// change;
															// Also the int age is called Method parameter
		System.out.println(name + " is " + age + " years old");
	}

	public static int add(int x, int y) { // another example of Method parameters
		return x + y;
	}

}
