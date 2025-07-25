package Lab4_2;

public class test {
	public static void main(String[] args) {
		
		BankAccount amt1 = new BankAccount("Ac1");
		BankAccount amt2 = new BankAccount("Ac2" , 500.0 , new Date(1,7,2015));
		
		amt1.deposit(1000);
		
		amt2.transfer(amt1, 300);
		
		amt2.withdraw(300);
		
		System.out.println("Account 1 : " + amt1.getInfo() + "  " + amt1.property() + "   " + "\n" + "Account 2 : " + amt2.getInfo() + "  " + amt2.property());
		
		
	}

}
