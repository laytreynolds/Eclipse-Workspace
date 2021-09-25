package inheritance;

public class Farmer extends Person {

	private String mow;
	private String seed;
	
	public Farmer(int age, String name, String sleep, String mow, String seed){
		super(seed, age, seed);
		this.setAge(age);
		this.setName(name);
		this.setSleep(sleep);
		this.mow = mow;
		this.seed = seed;
	}
	
	public void mow() {
		System.out.println("I am Mowing");
	}
	public void seed() {
		System.out.println("I am Seeding");
	}
	
//	override person
	@Override
	public void sleep() {
	System.out.println("Zzzimafarmerzzz");
	}
	
//	own functionality
	public void countSheep() {
		System.out.println("baaaaaaa");
	}
	
//	own getters and setters
	public String getMow() {
		return mow;
	}
	public void setMow(String mow) {
		this.mow = mow;
	}
	public String getSeed() {
		return seed;
	}
	public void setSeed(String seed) {
		this.seed = seed;
	}

	@Override
	public String toString() {
		return "Farmer [mow=" + mow + ", seed=" + seed + "]";
	}


	


	
	
	
	
}
