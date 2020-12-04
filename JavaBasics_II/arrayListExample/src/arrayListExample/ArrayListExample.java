package arrayListExample;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		String[] fruits = new String[3];
		fruits[0] = "Mango";
		fruits[1] = "Apple";
		fruits[2] = "Banana";
		System.out.println(fruits[1]);

		ArrayList<String> fruitList = new ArrayList<String>();
		fruitList.add("Mango");
		fruitList.add("Apple");
		fruitList.add("Banana");
		fruitList.add("Watermelon");
		fruitList.add("Kiwi");
		fruitList.add("Pear");
		fruitList.remove("Watermelon");
		System.out.println(fruitList);

		System.out.println(fruitList.contains("Grapes"));
	}

}
