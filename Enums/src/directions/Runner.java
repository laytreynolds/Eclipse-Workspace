package directions;

public class Runner {

	public static void main(String[] args) {
	
		
		Directions [] array = Directions.values();
		
		
		
		
		for (Directions directions : array) {
			
			System.out.println("The motion of " + directions + " is " + directions.motion());
		}
		
		System.out.println("=".repeat(40));
	
	
	for (Directions directions : array) {
		
		System.out.println(directions.abrevmotion());
	}
}
	
	 

}
