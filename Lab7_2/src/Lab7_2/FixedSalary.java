package Lab7_2;

public class FixedSalary {
	 private String firstName;
	    private String lastName;
	    private String phone;
	    private double salary;
	    private Card card;

	    public FixedSalary(String firstName, String lastName, String phone, double salary) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.phone = phone;
	        this.salary = salary;
	        this.card = new DebitCard("xxx-xxx-5555");
	    }

	    public Card getCard() {
	        return card;
	    }
}
