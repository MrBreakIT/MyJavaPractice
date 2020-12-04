package package2;

import package1.Access1; // b/c this is diff package/file

public class Access3 extends Access1 {
	// "protected" is not visible UNLESS we extend the Access1 to the Access3
	// and then below we call Access3 with new variable 'b' to view Access1

	public static void main(String[] args) {

		Access1 a = new Access1();
//		System.out.println("default");
//		System.out.println(a.hours); // not visible- "default"
//		System.out.println(a.minutes);
//		System.out.println("-----------");

		System.out.println("public"); // visible- b/c it's "public"
		System.out.println(a.hours2);
		System.out.println(a.minutes2);
		System.out.println("-----------");

//		System.out.println("private");
//		System.out.println(a.hours3); // not visible- "private"
//		System.out.println(a.minutes3);
//		System.out.println("-----------");

		Access3 b = new Access3(); // Must 'call' Access3 to view Access1
		System.out.println("protected");
		System.out.println(b.hours4); // not visible- "protected"
		System.out.println(b.minutes4);
		System.out.println("-----------");
	}

}