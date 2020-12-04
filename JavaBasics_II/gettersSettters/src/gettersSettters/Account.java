package gettersSettters;

public class Account {

	String name;
	int age;

	public static void main(String[] args) {

		Account a = new Account(); // creating an Account called 'a'
//		a.name = "John Pike"; // so this is bad practice to set all variables this way. We want to create
//								// METHODS that do it for us. We do this with Getters/Setters
//		a.age = 43;

		a.setName("John Pike"); // these are methods being called
		a.setAge(43);
		System.out.println(a.getName());
		System.out.println(a.getAge());
		System.out.println(a.getName() + ", " + a.getAge());

		a.printDetails();

	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public void setName(String name) { // reason why public void and no static is that these getters/setters are
										// accessed thru Class name- Account
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void printDetails() {
		System.out.println(getName() + " is " + getAge() + " years old.");
	}

}
