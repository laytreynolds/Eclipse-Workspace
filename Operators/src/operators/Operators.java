package operators;

public class Operators {

	public static void main(String[] args) {
		System.out.println(printSum(45, 35));
		furtherMath(10, 5, 10);
		printBool(3, 5);

	}
	
	// Initialise values in method
	public static int printSum(int myNum, int myNum2) {
		return myNum * myNum2;
		
	}
	
	public static void furtherMath(int num1, int num2, int num3) {
		System.out.println((num1*num2)/num3);
	}
	
	public static void printBool(int num1, int num2) {
		System.out.println(num1==num2);
	}
}
