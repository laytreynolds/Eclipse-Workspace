package inheritance;

public class Banker extends Person {

	private String trade;
	private String steal;
	
	public Banker(int age, String name, String sleep, String trade, String steal) {
		super(steal, age, steal);
		this.setAge(age);
		this.setName(name);
		this.setSleep(sleep);
		this.trade = trade;
		this.steal = steal;
	}
	


@Override
	public String toString() {
		return "Banker [trade=" + trade + ", steal=" + steal + "]";
	}



public void trade() {
	System.out.println("I am Trading");
}

public void steal() {
	System.out.println("I am Stealing");
}
	//	override person
	@Override
	public void sleep() {
	System.out.println("Zzzimabankerzzz");
	}
	
//	own functionality
	public void countMoney() {
		System.out.println("ChaChing");
	}
	
//	own getters and setters
	public String getTrade() {
		return trade;
	}
	public void setTrade(String trade) {
		this.trade = trade;
	}
	public String getSteal() {
		return steal;
	}
	public void setSteal(String steal) {
		this.steal = steal;
	}
	
	
	
}
