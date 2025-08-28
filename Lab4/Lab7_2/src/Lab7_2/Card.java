package Lab7_2;

public abstract class Card implements Withdrawable {
	protected String cardNumber;

    public Card(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public abstract String type();
    public abstract double discount();

    public String getCardNumber() {
        return cardNumber;
    }



	
}
