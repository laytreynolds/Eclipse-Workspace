package constructors;

public class Person {
	
	private String name;
	private int age;
	private double shoesize;
	private String job;
	private double height;
	
	public Person(String name, int age, double shoesize, String job, double height) {
		
		this.name = name;
		this.age = age;
		this.shoesize = shoesize;
		this.job = job;
		this.height = height;
		
	}
	
	public Person(String name, double height) {
		
		super();
		this.name = name;
		this.height = height;
	}
	
	public void greet() {
		System.out.println("Yo, my name is  " + name + " and I am " + height + ".");
		
		
	}
	
	
	public void greet2() {
		System.out.println("Hi, I am " + name + "." + " I am " + age + "." + " My shoesize is " + shoesize + "." + " I am a " + job + "." + " And I am " + height + ".");
	}


}
