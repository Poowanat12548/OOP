package Lab7_2;

public class DebitCard extends Card {

	public DebitCard(String cardNumber) {
        super(cardNumber);
    }

   
    public String type() {
        return "visa";
    }

    
    public double discount() {
        return 2.5; 
    }

    
    public boolean withdraw(double amount) {
       
        return amount > 0;
    }
}
