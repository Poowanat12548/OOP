package Lab6_3;

public class HourlySalary extends Employees {

	 private double wage;   
	    private double hours;  

	    public HourlySalary(String first, String last, String ssn,
	                        double wage, double hours) {
	        super(first, last, ssn);
	        this.wage = wage;
	        this.hours = hours;
	    }

	  
	    public String toString() {
	        return "Hourly employee: " + super.toString() +
	               String.format("\nhourly pay: $%.2f; hours worked: %.2f",
	                       wage, hours);
	    }

	   
	    public double earnings() {
	        return wage * hours;
	    }

}
