package Lab7_2;

public abstract class BaseAccount implements Withdrawable {

	 protected double balance;
	    protected Card card;

	    public BaseAccount(Card card) {
	        this.card = card;
	        this.balance = 0;
	    }

	    public Card getCard() {
	        return card;
	    }

	    public abstract boolean deposit(double amount);

	  
	    public abstract boolean withdraw(double amount);
}
