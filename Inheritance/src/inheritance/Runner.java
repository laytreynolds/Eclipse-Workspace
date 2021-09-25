package inheritance;

public class Runner {

	public static void main(String[] args) {
	
		 Person person = new Person("Mike", 59, "zzzimaperson");
		
		 Farmer farmer = new Farmer(22, "Layt", "zzzz", "mowwww", "se");
	 
		 Banker banker = new Banker(22, "Layton", "zzz", "tradeeee", "stealll" );
		 
		 System.out.println(person.toString());
		 System.out.println(farmer.toString());
		 System.out.println(banker.toString());
		 System.out.println(farmer);
		 System.out.println(banker);
		 banker.trade();
		 banker.steal();
		 farmer.mow();
		 farmer.seed();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 


	}

}
