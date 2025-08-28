package Lab7_2;

public class SavingAccount extends BaseAccount {

	public SavingAccount(Card card) {
        super(card);
    }

    
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    
    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
