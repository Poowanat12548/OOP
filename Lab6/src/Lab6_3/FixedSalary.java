package Lab6_3;

public class FixedSalary extends Employees {
	 private double salary; 

	    public FixedSalary(String first, String last, String ssn, double salary) {
	        super(first, last, ssn);
	        this.salary = salary;
	    }

	   
	    public String toString() {
	        return "Fixed salary employee: " + super.toString() +
	               String.format("\nmonthly salary: $%.2f", salary);
	    }

	   
	    public double earnings() {
	        return salary;
	    }
}
