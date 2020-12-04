package methodChaining;

public class MethodChaining {

	String name;
	int grade;

	public static void main(String[] args) {

		MethodChaining s = new MethodChaining(); // this is creating a MethodChaining object
		s.setName("John");
		s.setGrade(99).setName("John Robert PIKE"); // this is method chaining
		System.out.println(s.name + " earned a " + s.grade);
	}

	public MethodChaining setName(String name) {
		this.name = name;
		return this; // need this return so that the method chaining knows to attach the methods to
						// itself
	}

	public MethodChaining setGrade(int grade) {
		this.grade = grade;
		return this;
	}
}
