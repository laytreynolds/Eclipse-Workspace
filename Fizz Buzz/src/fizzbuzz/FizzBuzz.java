package fizzbuzz;

public class FizzBuzz {

	public static void main(String[] args) {
		fizzBuzz(255);

	}
	
	public static void fizzBuzz(int x) {
		
		if (x % 3 == 0 && x % 5 != 0) {
			System.out.println("Fizz");
			
		} else if (x % 5 == 0 && x % 3 != 0) {
			System.out.println("Buzz");
			
		} if (x % 5 == 0 && x % 3 == 0) {
			System.out.println("FizzBuzz");
			
		} if (x % 5 != 0 && x % 3 != 0) {
			System.out.println(x);
		}
	}
}		
	


