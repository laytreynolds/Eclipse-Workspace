package inheritance;

public class Person {
	
	private String name;
	private int age;
	private String sleep;
	

	public Person(String name, int age, String sleep) {
		super();
		this.name = name;
		this.age = age;
		this.sleep = sleep;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	public String getSleep() {
		return sleep;
	}

	public void setSleep(String sleep) {
		this.sleep = sleep;
	}

	public void sleep() {
		System.out.println("Zzzzz");		
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sleep=" + sleep + "]";
	}
	
	
}