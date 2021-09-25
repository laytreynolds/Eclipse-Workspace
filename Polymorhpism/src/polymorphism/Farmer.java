package polymorphism;

public class Farmer extends Person {

	public Farmer(String name) {
		super(name);
		this.setName(name);
	}
	
	@Override
	public void speak() {
		
		System.out.println("Hi");
		
		}
	
}
