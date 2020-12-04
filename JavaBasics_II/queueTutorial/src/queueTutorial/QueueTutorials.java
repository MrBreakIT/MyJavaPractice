package queueTutorial;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTutorials {

	public static void main(String[] args) {

		Queue<String> bbqLine = new LinkedList<String>(); // needs to begin with Queue and end with LinkedList
		bbqLine.add("Mom");
		bbqLine.add("Dad");
		bbqLine.add("John");
		bbqLine.add("RJ");

		System.out.println(bbqLine.size() + " people in the BBQ line for food.");
		System.out.println(bbqLine);
		System.out.println(bbqLine.poll() + " is served first.");
		System.out.println(bbqLine.poll() + " is served next.");
		System.out.println(bbqLine.poll() + " is served after Dad.");
		System.out.println(bbqLine.poll() + " is served last.");
		System.out.println(bbqLine);
		System.out.println(bbqLine.size() + " people left in line for food.");
		System.out.println("Everyone has been fed.");
	}

}
