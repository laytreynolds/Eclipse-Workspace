package constructors;

public class Runner {

	public static void main(String[] args) {
		
		Person Layt = new Person("Layt", 23, 11.0, "Developer", 6.5);
		Person Mike = new Person("Mike", 24, 9.0, "Engineer", 5.8);
		Person Owen = new Person("Mike", 24, 9.0, "Engineer", 5.10);
		Person Ellie = new Person("Mike", 24, 9.0, "Engineer", 6.8);
		
		Layt.greet();
		Mike.greet2();
		Owen.greet();
		Ellie.greet2();


	}

}