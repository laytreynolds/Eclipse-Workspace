package trycatchexceptions;

import java.util.Scanner;

import java.io.IOException;

public class CalculatorScanner {

	public static double result;

	

	public static double add(double firstNumber, double secondNumber) {

		result = firstNumber + secondNumber;

		return result;
	}

	public static double sub(double firstNumber, double secondNumber) {

		result = firstNumber - secondNumber;

		return result;
	}

	public static double mul(double firstNumber, double secondNumber) {

		result = firstNumber * secondNumber;
		return result;
	}

	public static double div(int int1, int int2) throws ArithmeticException{
		
		if (int2 == 0) {
			throw new ArithmeticException("Cannot divide by 0");
		} else if (int1 < int2) {
			throw new ArithmeticException("Cannot divide by larger number than: " + int1);
		}
		
		return int1 / int2;
		
	

	}
	
}