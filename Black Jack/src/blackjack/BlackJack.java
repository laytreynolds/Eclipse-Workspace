package blackjack;

public class BlackJack {

	public static void main(String[] args) {
		System.out.print(blackJack(1, 22));
		
	}
	
	public static int blackJack(int num1, int num2) {
		
	int	winner = 0;
		
	if (num1 > num2 && num1 <= 21) {
		winner = num1;
		
			
		} else if (num1 < num2 && num2 <= 21) {
			winner = num2;
			
			
		} else if (num1 > num2 && num1 >= 21) {
			winner = num2;
			
			
		} else if (num1 < num2 && num2 >= 21) {
			winner = num1;
			
		} if (num1 > 21 && num2 > 21) {
			return 0;
		}
	
		return winner;
	
		
	}

}
