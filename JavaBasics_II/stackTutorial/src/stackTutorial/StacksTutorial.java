package stackTutorial;

import java.util.Stack;

public class StacksTutorial {

	public static void main(String[] args) {

		Stack<String> games = new Stack<String>();
		games.add("Call of Duty");
		games.add("Guitar Hero");
		games.add("Super Monkey Ball");
		System.out.println(games.pop());
		System.out.println(games.peek());
		System.out.println(games);

		// - Y
		// - B
		// - R

		Stack<String> tower = new Stack<String>();
		tower.add("R");
		tower.add("B");
		tower.add("Y");

		System.out.println(tower);
		System.out.println(tower.peek());
		System.out.println(tower.contains("P"));
		System.out.println(tower.empty());
		System.out.println(tower.get(1));
		System.out.println(tower.set(1, "P"));
		System.out.println(tower.get(1));
		System.out.println(tower);
		System.out.println(tower.size());

	}

}
