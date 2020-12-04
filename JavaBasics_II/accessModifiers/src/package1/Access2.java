package package1;

public class Access2 {

	public static void main(String[] args) {

		Access1 a = new Access1();
		System.out.println("default");
		System.out.println(a.hours);
		System.out.println(a.minutes);
		System.out.println("-----------");

		System.out.println("public");
		System.out.println(a.hours2);
		System.out.println(a.minutes2);
		System.out.println("-----------");

//		System.out.println("private");
//		System.out.println(a.hours3); //not visible b/c private
//		System.out.println(a.minutes3);
//		System.out.println("-----------");

		System.out.println("protected");
		System.out.println(a.hours4);
		System.out.println(a.minutes4);
		System.out.println("-----------");
	}

}
