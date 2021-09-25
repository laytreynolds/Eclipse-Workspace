package DataTypes;

public class DataTypeExercise {

	// Create a main method, either in the class, or in a separate runner.
	public static void main(String[] args) {
		
		// Declare 3 variables, 2 primitive types and one String.
		boolean bool = true;
		int number = 45;
		String str = "Hello";
		
		// Print all 3 to the console.
		System.out.println(bool);
		System.out.println(number);
		System.out.println(str);
		
		//  Call that method and print the value it returns to the console.
		System.out.println(returnNumber(65));
		System.out.println(addNumbers(20,98));
	}
	
	// Create a method which has a return value. 
	public static int returnNumber(int i) {
		return(i);
	}
	
	// Create a method which has a return value. 
	public static int addNumbers(int num1, int num2) {
	int sum = num1 + num2;
	return(sum);
	}
	
	
}
