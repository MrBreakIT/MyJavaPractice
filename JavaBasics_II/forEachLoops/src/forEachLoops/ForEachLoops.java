package forEachLoops;

import java.util.ArrayList;

public class ForEachLoops {

	public static void main(String[] args) {

		String[] cars = { "BMW M3", "Jeep SRT", "Kia Stinger" };

		for (String car : cars) { // this is the forEach loop. 'car' is the String- 'cars' is the array
			System.out.println(car);
		}

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(4);
		numbers.add(7);
		numbers.add(2);

		for (int a : numbers) { // this is the forEach Loop
			System.out.println(a);
		}
		System.out.println("----------------");

		for (int i = 0; i < numbers.size(); i++) { // this is a regular for Loop
			System.out.println(numbers.get(i));
		}
		System.out.println("----------------");
	}

}
