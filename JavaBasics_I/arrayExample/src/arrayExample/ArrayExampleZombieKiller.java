package arrayExample;

public class ArrayExampleZombieKiller {

	public static void main(String[] args) {
		System.out.println("Welcome to the Zombie Killer program!");

		String backpack[] = { "Shotgun", "AR-15", "Sniper-Rifle" };
		String zombies[] = { "Close-range zombie", "Mid-range zombie", "Long-range zombie" };
		int numbersZombiesHATE[] = { 4, 90, 123, 31 };

		System.out.println();

		System.out.println("Backpack weapons!");
		System.out.println("Choose only one: " + backpack[0] + ", " + backpack[1] + ", " + backpack[2] + ".");

		System.out.println();

		System.out.println("Attacking Zombies!");
		System.out.println("Current Zombie attack: " + zombies[0] + ", " + zombies[1] + ", " + zombies[2] + ".");

		System.out.println();

		System.out.println("Your attack zombie hates number " + numbersZombiesHATE[2]);

	}

}
