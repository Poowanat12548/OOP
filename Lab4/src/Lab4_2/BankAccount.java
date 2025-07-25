package Lab4_2;

public class BankAccount {
	public String name;
	public double amt;
	public Date date;
	public String property;
	
	public BankAccount(String name) {
		this.name = name;
		this.amt = 0;
		this.date = new Date(25 , 7 , 2025);
		
	}
	public BankAccount(String name , double amount , Date d) {
		this.name = name;
		this.amt = amount;
		this.date = d;
		
	}
	
	public void deposit(double amount) {
		
		this.amt = this.amt + amount;
		
	}
	
	public boolean withdraw(double amount) {
		if(amount <= amt) {
			amt = amt - amount;
			return true;
		}
		return false;
	}
	
	public void transfer(BankAccount other, double amount) {
		if(withdraw(amount)) {
		other.deposit(amount);
		}
	}
	
	public double property() {
		return amt;
	}
	
	public String getInfo() {
		return this.name + "   " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear()  ;
	}
}
