package inputs;

import java.util.Scanner;

public class InputwithScanner {
	
	private static int int1, int2;

		 public static int Addition(int int1, int int2) {
		int value = 0;
		value = int1 + int2;
		return value;
		}

		 public static int Multiplication(int int1, int int2) {
		int value = 0;
		value = int1 * int2;
		return value;
		}

		 public static int Subtraction(int int1, int int2) {
		int value = 0;
		value = int1 - int2;
		return value;
		}

		 public static double Division(int int1, int int2) {
		double value = 0;
		value = int1 / int2;
		return value;
		}

		 public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			System.out.println("Please enter first number");
				int1 = scan.nextInt();
			System.out.println("Please enter second number");
				int2 = scan.nextInt();
			System.out.println("What operation would you like to use?\n 1: Addition\n 2: Multiplication\n 3: Substraction\n 4: Division");
		
		int choice = scan.nextInt();
		
		switch (choice) {

		 case 1: {
		System.out.println(Addition(int1, int2));
		break;
		}
		case 2: {
		System.out.println(Multiplication(int1, int2));
		break;
		}
		case 3: {
		System.out.println(Subtraction(int1, int2));
		break;
		}
		case 4: {
		System.out.println(Division(int1, int2));
		break;
		}

		}
		scan.close();
		

		

		
		
	}

}
