package exceptions;

import java.util.ArrayList;

public class Exceptions {

	public static void main(String[] args) {

		// Exceptions are the red error messages alerting that code has stopped running
		// and where exceptions might be

//		ArrayList<String> list = new ArrayList<String>(); //tries to return something not there
//		list.get(0);

//		ArrayList<String> list2 = null; //gives a null pointer exception
//		list2.get(0);

		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("book");
		System.out.println(list3.get(0));

	}

}
