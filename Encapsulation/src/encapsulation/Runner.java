package encapsulation;

public class Runner {

	public static void main(String[] args) {
		
		Encapsulation Layt = new Encapsulation();
		
		Layt.setCreditCardNumber(15485611);
		Layt.setExpireDate(250);
		Layt.setNameOnCard("Mr L reynolds");
		Layt.setBalance(9003);
		Layt.setPenniesInAccount(3456);
		
		
		System.out.println(Layt.getCreditCardNumber()+ " " + Layt.getNameOnCard()+ " " + Layt.getExpireDate());
		System.out.println(Layt.toString());
	}
	

}
