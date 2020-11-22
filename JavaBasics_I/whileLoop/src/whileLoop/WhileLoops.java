package whileLoop;

import java.util.ArrayList;
import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {

		String sentence = "Peanut butter pancakes are awesome!"; // create a sentence variable and store the sentence
		Scanner scan = new Scanner(sentence); // create the scanner to 'scan' the created sentence above
		ArrayList<String> words = new ArrayList<String>(); // put all the words in the sentence into an ArrayList called
															// words

		while (scan.hasNext()) {
			words.add(scan.next());
		}
		System.out.println(words);
	}
}
