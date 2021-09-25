package polymorphism;

public class Runner {

	public static void main(String[] args) {

		Object object = new Farmer("Layt");
		Person person = new Person("Charlie");
		Farmer farmer = new Farmer("Malcolm");

		farmer.speak();
		
		person.speak();
		
		
	}
}
