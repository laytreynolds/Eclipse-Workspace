package conditionalsexercise;

public class CalculatorRevisit {

	public static void main(String[] args) {
		divisionSum(20, 10);
	}
	
	public static void divisionSum(int mynum1, int mynum2) {
		int sum = mynum1 / mynum2;
		
		if (mynum1 > mynum2) {
			System.out.println(sum);
		} else { 
			System.out.println("Division Invalid");
		}

	}	
	
}	


