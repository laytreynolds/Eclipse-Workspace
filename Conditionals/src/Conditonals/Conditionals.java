package Conditonals;

public class Conditionals {

	public static void main(String[] args) {
		
		canLaytJava();
		numbersJava();


	}
	
	// else statements
	public static void canLaytJava() {
		
		boolean canHeJava = true;
		
		if (!canHeJava) {
			System.out.println("Layt can Java");
		} else {
			System.out.println("Layt cannot Java");
		}
		
	}
	
	// if else statements 
	public static void numbersJava() {
		int number = 24;
		
		if (number < 20) {
			System.out.println("Number is smaller than 20.");
		} else { 
			System.out.println("Number is bigger than 20.");
		}
		
	}
	
}
