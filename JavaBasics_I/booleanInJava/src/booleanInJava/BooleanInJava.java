package booleanInJava;

public class BooleanInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
//		boolean b = false;
		boolean b = a == 0; // this is same as b = (a == 0)
		// boolean are called comparison operators
		// used for if statements

		boolean passedDoor = true;
		boolean missedDoor = false;
		int doorCount = 0;
		boolean passedAllDoors = false;

		System.out.println(b);
		System.out.println("***********");

		if (true) {
			System.out.println("We are in the \"if\" statement!");
		}
		if (passedDoor) {
			System.out.println("We passed the 1st door.");
			doorCount++;
		}
		if (missedDoor) {
			System.out.println("We passed the 2nd door.");
			doorCount++;
		}
		if (passedDoor) {
			System.out.println("We passed the 3rd door.");
			doorCount++;
		}
		if (doorCount == 3) {
			passedAllDoors = true;
			System.out.println(doorCount);
		}
		if (passedAllDoors) {
			System.out.println("Congrats, you've passed all 3 doors!");
		} else {
			System.out.println("You missed a door somewhere!");
		}
	}

}
