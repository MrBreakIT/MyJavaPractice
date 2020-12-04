package package1;

public class Access1 {

	// 4 types of modifiers: default, public, private, protected
	// default- access w/in package and all files
	// public- access everywhere
	// private- access only in the package/file
	// protected- w/in package and IF access thru SubClass via extends

	int hours = 3;
	int minutes = 47;

	public int hours2 = 3;
	public int minutes2 = 47;

	private int hours3 = 3; // visible only to same file
	private int minutes3 = 47;

	protected int hours4 = 3;
	protected int minutes4 = 47;
}
