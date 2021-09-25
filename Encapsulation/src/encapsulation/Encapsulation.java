package encapsulation;

public class Encapsulation {

	private int creditCardNumber;
	private int expireDate;
	private String nameOnCard;
	private float balance;
	private int penniesInAccount;
	

	public Encapsulation(int creditCardNumber, int expireDate, String nameOnCard, float balance, int penniesInAccount) {
		super();
		this.creditCardNumber = creditCardNumber;
		this.expireDate = expireDate;
		this.nameOnCard = nameOnCard;
		this.balance = balance;
		this.penniesInAccount = penniesInAccount;
	
	}
	
	public Encapsulation() {
		super();
	}

	public int getCreditCardNumber() {
		return creditCardNumber;
	}
	
	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	
	public int getExpireDate() {
		return expireDate;
	}
	
	public void setExpireDate(int expireDate) {
		this.expireDate = expireDate;
	}
	
	public String getNameOnCard() {
		return nameOnCard;
	}
	
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	
	
	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public float getPenniesInAccount() {
		return penniesInAccount;
	}

	public void setPenniesInAccount(int penniesInAccount) {
		this.penniesInAccount = penniesInAccount;
	}

	@Override
	public String toString() {
		return "Encapsulation [creditCardNumber=" + creditCardNumber + ", expireDate=" + expireDate + ", nameOnCard="
				+ nameOnCard + ", balance=" + balance + ", penniesInAccount=" + penniesInAccount + "]";
	}

	
	
}
